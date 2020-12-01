package com.vti.backend;

import java.util.Scanner;

import com.vti.entity.Ex6Abs_Phone;
import com.vti.entity.Ex6Abs_VietnamesePhone;

public class beEx6Q1Abstract extends Ex6Abs_VietnamesePhone {

	@Override
	public void insertContact(String name, String phone) {
		System.out.println("Insert Contact with Name: " + name + " & Phone: " + phone);		
	}

	@Override
	public void removeContact(String name) {
		System.out.println("Remove Contact with Name: " + name);		
	}

	@Override
	public void updateContact(String name, String newPhone) {
		System.out.println("Update Contact with Name: " + name + " & New Phone: " + newPhone);		
	}

	@Override
	public void searchContact(String name) {
		System.out.println("Search Contact with Name: " + name);

	}
	
}

