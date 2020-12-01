package com.vti.entity;

public class Ex5_HighSchoolStudent extends Ex5_Student {
	private String clazz;
	private String desiredUniversity;
	
	public Ex5_HighSchoolStudent(String name, int id, String clazz, String desiredUniversity) {
		super(name, id);
		this.clazz = clazz;
		this.desiredUniversity = desiredUniversity;
	}

	public Ex5_HighSchoolStudent() {
		super();
	}

	public String getClazz() {
		return clazz;
	}

	public void setClazz(String clazz) {
		this.clazz = clazz;
	}

	public String getDesiredUniversity() {
		return desiredUniversity;
	}

	public void setDesiredUniversity(String desiredUniversity) {
		this.desiredUniversity = desiredUniversity;
	}

	@Override
	public String toString() {
		return "HighSchoolStudent [ID = " + getId() + ", Name = " + getName() + ", clazz = " + clazz + ", desiredUniversity = " + desiredUniversity + "]";
	}

	

	
}
