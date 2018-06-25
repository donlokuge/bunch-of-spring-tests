package com.beanmapping.beanmapping.beans1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration { 
	
	@Bean
	public Bean1 bean1() {
		return new Bean1();
	}
	
	
}
