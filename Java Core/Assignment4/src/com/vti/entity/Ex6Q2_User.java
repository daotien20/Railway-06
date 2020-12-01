package com.vti.entity;

public abstract class Ex6Q2_User {
	String	name;
	double	salaryRatio;
	
	public Ex6Q2_User(String name, double salaryRatio) {
		this.name = name;
		this.salaryRatio = salaryRatio;
	}
	
	public abstract double calculatePay();
	
	public void displayInfo() {
		System.out.println("Name: " + name);
		System.out.println("Salary ratio: " + salaryRatio);
		System.out.println("Salary: " + calculatePay());
	}
}
