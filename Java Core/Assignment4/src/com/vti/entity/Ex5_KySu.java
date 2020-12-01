package com.vti.entity;

public class Ex5_KySu extends Ex5_CanBo{
	private String	nganhDaoTao;
	
	
	public Ex5_KySu(String fullName, int age, Ex5_Gender gender, String address, String nganhDaoTao) {
		super(fullName, age, gender, address);
		this.nganhDaoTao = nganhDaoTao;
	}


	public Ex5_KySu() {
	}


	public String getNganhDaoTao() {
		return nganhDaoTao;
	}


	public void setNganhDaoTao(String nganhDaoTao) {
		this.nganhDaoTao = nganhDaoTao;
	}
	
	
}
