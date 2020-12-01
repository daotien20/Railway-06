package com.vti.entity;

public class Ex5_NhanVien extends Ex5_CanBo {
	private String congViec;

	public Ex5_NhanVien(String fullName, int age, Ex5_Gender gender, String address, String congViec) {
		super(fullName, age, gender, address);
		this.congViec = congViec;
	}

	public Ex5_NhanVien() {
	}

	public String getCongViec() {
		return congViec;
	}

	public void setCongViec(String congViec) {
		this.congViec = congViec;
	}
	
	
}
