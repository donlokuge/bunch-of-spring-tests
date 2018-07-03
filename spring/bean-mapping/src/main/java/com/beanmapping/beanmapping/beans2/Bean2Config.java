package com.beanmapping.beanmapping.beans2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration 
public class Bean2Config {
	
	@Bean
	public Bean2 bean2() {
		return new Bean2();
	}

	@Bean
	public Foo foo() {
		return new Foo(bar());
	}

	@Bean
	public Bar bar() {
		return new Bar();
	}
	
	@Bean
	public int number() { // change method name to number10 and run and see the exception
		//
		// Consider marking one of the beans as @Primary, updating the consumer to accept multiple beans,
		// or using @Qualifier to identify the bean that should be consumed

		return 10;
	}
	
	@Bean
	public int number20() {
		return 20;
	}
	
	@Bean
	public SomeClass someclass(int number) {
		return new SomeClass(number);
	}
}
