package com.beanmapping.beanmapping.beans2;

public class Foo {

	public Bar bar;

	private int id;

	private String name;

	public Foo(Bar bar) {
		this.bar = bar;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
