package com.beanmapping.beanmapping.configurationProperties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:global.properties")
@ConfigurationProperties
public class GlobalPropertiesTest2 {
	
	private String email;
	private int threadPool;
	
	public GlobalPropertiesTest2() {
		System.out.println("GlobalPropertiesTest2 with @ConfigurationProperties inject without @value (spEL) requries getter and setter");
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getThreadPool() {
		return threadPool;
	}

	public void setThreadPool(int threadPool) {
		this.threadPool = threadPool;
	}
	
	

}
	