package com.vti.entity;

public class Ex5_CongNhan extends Ex5_CanBo {
	private int level;
	
	public Ex5_CongNhan(String fullName, int age, Ex5_Gender gender, String address, int level) {
		super(fullName, age, gender, address);
		this.level = level;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public Ex5_CongNhan() {
	}
	
	
}
