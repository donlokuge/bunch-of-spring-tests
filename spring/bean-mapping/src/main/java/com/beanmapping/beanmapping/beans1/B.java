package com.beanmapping.beanmapping.beans1;

import org.springframework.stereotype.Component;

@Component(value = "b1")
public class B {

	public A a;

	public B(A a) {
		this.a = a;
	}

	@Override
	public String toString() {
		return "B [a=" + a + "]";
	}

}
