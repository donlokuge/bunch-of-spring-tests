package com.beanmapping.beanmapping.configurationProperties.ymltests;

import java.util.Map;

public class Person {
	private String name;
	private Map<String, String> addresses;
	
	public Person() {
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Map<String, String> getAddresses() {
		return addresses;
	}
	public void setAddresses(Map<String, String> addresses) {
		this.addresses = addresses;
	}
	
	

}
