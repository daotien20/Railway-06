package com.vti.entity;

import java.util.Scanner;

public class Ex5_Bao extends Ex5_TaiLieu {
	private String ngayPhatHanh;

	public Ex5_Bao() {
		super();
	}
	
	public Ex5_Bao(int maTaiLieu, String tenNXB, int soBanPhatHanh, String ngayPhatHanh) {
		super(maTaiLieu, tenNXB, soBanPhatHanh);
		this.ngayPhatHanh = ngayPhatHanh;
	}


	public String getNgayPhatHanh() {
		return ngayPhatHanh;
	}

	public void setNgayPhatHanh(String ngayPhatHanh) {
		this.ngayPhatHanh = ngayPhatHanh;
	}

	
	public void inputBao() {
		super.inputTaiLieu();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Nhập ngày phát hành: ");
		ngayPhatHanh = scanner.nextLine();
		
	}
	
	public void getInforBao() {
		super.getInforTL();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ngày phát hành		: " + ngayPhatHanh);
	
	}
}
