package com.vti.entity;

public class Ex6Q3_Employee extends Ex6Q2_User {
	
	public Ex6Q3_Employee(String name, double salaryRatio) {
		super(name, salaryRatio);
	}

	@Override
	public double calculatePay() {
		return salaryRatio * 420;
	}
}
