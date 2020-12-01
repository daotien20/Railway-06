package com.vti.entity;

public abstract class Ex5_Student extends Ex5_Person {
	private int id;

	public Ex5_Student(String name, int id) {
		super(name);
		this.id = id;
	}

	public Ex5_Student() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
	
	
}
