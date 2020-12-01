package com.vti.entity;

import java.util.Scanner;

public class Ex5_TaiLieu {
	
	private int maTaiLieu;
	private String tenNXB;
	private int soBanPhatHanh;
	
	public Ex5_TaiLieu(int maTaiLieu, String tenNXB, int soBanPhatHanh) {
		super();
		this.maTaiLieu = maTaiLieu;
		this.tenNXB = tenNXB;
		this.soBanPhatHanh = soBanPhatHanh;
	}

	public Ex5_TaiLieu() {
		
	}

	public int getMaTaiLieu() {
		return maTaiLieu;
	}

	public String getTenNXB() {
		return tenNXB;
	}

	public int getSoBanPhatHanh() {
		return soBanPhatHanh;
	}

	public void setMaTaiLieu(int maTaiLieu) {
		this.maTaiLieu = maTaiLieu;
	}

	public void setTenNXB(String tenNXB) {
		this.tenNXB = tenNXB;
	}

	public void setSoBanPhatHanh(int soBanPhatHanh) {
		this.soBanPhatHanh = soBanPhatHanh;
	}
	
	public void inputTaiLieu() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập mã tài liệu: ");
		maTaiLieu = scanner.nextInt();
		scanner.nextLine();
		
		System.out.println("Nhập tên NXB: ");
		tenNXB = scanner.nextLine();
		
		System.out.println("Nhập số bản phát hành: ");
		soBanPhatHanh = scanner.nextInt();
		scanner.nextLine();
	}
	
	public void getInforTL() {
		System.out.println("Mã Tài liệu		 : " + maTaiLieu);
		System.out.println("Tên NXB			 : " + tenNXB);
		System.out.println("Số bản phát hành : " + soBanPhatHanh);
	}
	
}
