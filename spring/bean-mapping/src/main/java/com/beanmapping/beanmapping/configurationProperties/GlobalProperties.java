package com.beanmapping.beanmapping.configurationProperties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component("GlobalPropertiesTest1")
@PropertySource("classpath:global.properties")
public class GlobalProperties {
	
	public GlobalProperties() {
		System.out.println("GlobalPropertiesTest1 init"); 
		System.out.println("Testing injecting from a properties file with @PropertySource and @Value ${nmae}");
		 
	}
	
	@Value("${email}")
	public String email;
	
	@Value("${thread-pool}")
	public int threadPool;

}
