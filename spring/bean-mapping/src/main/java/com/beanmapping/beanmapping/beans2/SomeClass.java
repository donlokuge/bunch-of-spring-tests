package com.beanmapping.beanmapping.beans2;

public class SomeClass {

	private int number;

	public SomeClass(Integer theNumber) {
		this.number = theNumber.intValue();
	}

	public int getNumber() {
		return this.number;
	}
}
