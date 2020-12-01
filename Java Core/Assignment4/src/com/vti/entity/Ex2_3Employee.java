package com.vti.entity;

public class Ex2_3Employee extends Ex6Q2_User {
	
	public Ex2_3Employee(String name, double salaryRatio) {
		super(name, salaryRatio);
	}

	@Override
	public double calculatePay() {
		return salaryRatio * 420;
	}
}
