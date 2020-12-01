package com.vti.entity;

import java.util.Scanner;

public class Ex5_CanBo {
	private String fullName;
	private int age;
	private Ex5_Gender gender;
	private String address;

	public Ex5_CanBo(String fullName, int age, Ex5_Gender gender, String address) {
		this.fullName = fullName;
		this.age = age;
		this.gender = gender;
		this.address = address;
	}

	@Override
	public String toString() {
		return "CanBo [fullName=" + fullName + ", age=" + age + ", gender=" + gender + ", address=" + address + "]";
	}

	public Ex5_CanBo() {

	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Ex5_Gender getGender() {
		return gender;
	}

	public void setGender(int gioiTinh) {

		if (gioiTinh == 1) {
			this.gender = Ex5_Gender.valueOf("MALE");
		
		} else if (gioiTinh == 2) {
			this.gender = Ex5_Gender.valueOf("FEMALE");
		
		} else {
			this.gender = Ex5_Gender.valueOf("UNKNOWN");
	
		}

	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	public void getInfor() {
		System.out.println("Họ tên      : " + fullName);
		System.out.println("Tuổi        : " + age);
		System.out.println("Giới tính   : " + getGender());
		System.out.println("Địa chỉ     : " + address);
	}

}
