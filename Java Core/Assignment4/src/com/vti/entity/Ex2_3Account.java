package com.vti.entity;

import java.time.LocalDate;
import java.util.Arrays;

public class Ex2_3Account {
	private int			accountID;
	private String		email;
	private String		userName;
	private String 		fullName;
	private Ex2_3Department	department;
	private Ex2_3Position	position;
	private LocalDate	createDate;
	private Ex2_3Group[] 	groups;
	
	public Ex2_3Account() {
		super();
	}

	@Override
	public String toString() {
		return "Account [accountID=" + accountID + ", email=" + email + ", userName=" + userName + ", fullName="
				+ fullName + ", department=" + department + ", position=" + position + ", createDate=" + createDate
				+ ", groups=" + Arrays.toString(groups) + "]";
	}

	public int getAccountID() {
		return accountID;
	}

	public String getEmail() {
		return email;
	}

	public String getUserName() {
		return userName;
	}

	public String getFullName() {
		return fullName;
	}

	public Ex2_3Department getDepartment() {
		return department;
	}

	public Ex2_3Position getPosition() {
		return position;
	}

	public LocalDate getCreateDate() {
		return createDate;
	}

	public Ex2_3Group[] getGroups() {
		return groups;
	}

	public void setAccountID(int accountID) {
		this.accountID = accountID;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public void setDepartment(Ex2_3Department department) {
		this.department = department;
	}

	public void setPosition(Ex2_3Position position) {
		this.position = position;
	}

	public void setCreateDate(LocalDate createDate) {
		this.createDate = createDate;
	}

	public void setGroups(Ex2_3Group[] groups) {
		this.groups = groups;
	}
	
	
	
	
}

