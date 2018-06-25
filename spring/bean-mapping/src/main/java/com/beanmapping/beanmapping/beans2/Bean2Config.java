package com.beanmapping.beanmapping.beans2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Bean2Config {

	@Bean
	public Bean2 bean2() {
		return new Bean2();		
	}
}
