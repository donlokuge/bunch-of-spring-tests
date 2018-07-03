package com.beanmapping.beanmapping.beans2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FooUser {
	
	@Autowired
	Foo foo;
	
	public void printFoo() {
		System.out.println(foo.getName());
	}

}
