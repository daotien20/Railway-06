package com.vti.entity;

public class Ex4Q2Account {
	private String id;
	private String name;
	private int balance;
	
	
	public Ex4Q2Account(String id, String name, int balance) {
		this.id = id;
		this.name = name;
		this.balance = balance;
	}


	public String getId() {
		return id;
	}


	public String getName() {
		return name;
	}


	public int getBalance() {
		return balance;
	}
	
	public int credit (int amount) {
		return amount;
	}
	
	public int debit (int amount) {
		return amount;
		
	}
	
	public void tranferTo(Ex4Q2Account account, int mount) {
		System.out.println("Transfer "  + account + " to " + account.getName());
	}
}
