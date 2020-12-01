package com.vti.entity;

import java.util.Scanner;

public class Ex5_TapChi extends Ex5_TaiLieu {
	private int soPhatHanh;
	private byte thangPhatHanh;
	
	public Ex5_TapChi(int maTaiLieu, String tenNXB, int soBanPhatHanh, int soPhatHanh, byte thangPhatHanh) {
		super(maTaiLieu, tenNXB, soBanPhatHanh);
		this.soPhatHanh = soPhatHanh;
		this.thangPhatHanh = thangPhatHanh;
	}

	public Ex5_TapChi() {
		super();
	}

	public int getSoPhatHanh() {
		return soPhatHanh;
	}

	public byte getThangPhatHanh() {
		return thangPhatHanh;
	}

	public void setSoPhatHanh(int soPhatHanh) {
		this.soPhatHanh = soPhatHanh;
	}

	public void setThangPhatHanh(byte thangPhatHanh) {
		this.thangPhatHanh = thangPhatHanh;
	}
	
	public void inputTapChi() {
		super.inputTaiLieu();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Nhập số phát hành: ");
		soPhatHanh = scanner.nextInt();
		scanner.nextLine();
		
		System.out.println("Nhập tháng phát hành: ");
		thangPhatHanh = (byte) scanner.nextInt();
		scanner.nextLine();
	}
	
	public void getInforTapChi() {
		super.getInforTL();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Số phát hành		: " + soPhatHanh);
		System.out.println("Tháng phát hành		: " + thangPhatHanh);
		
	}
	
}
