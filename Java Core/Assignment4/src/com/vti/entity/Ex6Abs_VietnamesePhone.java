package com.vti.entity;

public abstract class Ex6Abs_VietnamesePhone extends Ex6Abs_Phone {
	
	public Ex6Abs_VietnamesePhone() {
		
	}
	
	public abstract void insertContact(String name, String phone);
		

	public abstract void removeContact(String name);
		

	public abstract void updateContact(String name, String newPhone) ;
	
	
	public abstract void searchContact(String name);

	
}
