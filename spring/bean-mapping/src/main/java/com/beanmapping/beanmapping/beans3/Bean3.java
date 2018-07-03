package com.beanmapping.beanmapping.beans3;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Bean3 {

	private int n1;
	private String s1;

	public Bean3(@Value("10") int n1, @Value("s1") String s1) {
		this.n1 = n1;
		this.s1 = s1;
	}

	@Override
	public String toString() {
		return "Bean3 [n1=" + n1 + ", s1=" + s1 + "]";
	}

}
