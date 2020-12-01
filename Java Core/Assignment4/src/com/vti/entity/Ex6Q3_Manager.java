package com.vti.entity;

public class Ex6Q3_Manager extends Ex6Q2_User {
	
	public Ex6Q3_Manager(String name, double salaryRatio) {
		super(name, salaryRatio);
	}

	@Override
	public double calculatePay() {
		return salaryRatio * 520;
	}
}
