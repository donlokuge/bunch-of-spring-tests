package com.beanmapping.beanmapping.beans1;

import org.springframework.beans.factory.annotation.Value;


public class A {

	@Value("${a.name}") 
	public String name;
	@Value("${a.age}") 
	public int age;
	
	@Override
	public String toString() {
		return "A [name=" + name + ", age=" + age + "]";
	}
	
	
	
}
