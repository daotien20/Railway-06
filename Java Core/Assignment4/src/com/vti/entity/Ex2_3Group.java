package com.vti.entity;

import java.time.LocalDate;
import java.util.Arrays;

public class Ex2_3Group {
	private short		groupID;
	private String 		groupName;
	private Ex2_3Account		creator;
	private LocalDate	createDate;
	private Ex2_3Account[]	accounts;
	
	public Ex2_3Group() {
		super();
	}

	@Override
	public String toString() {
		return "Group [groupID=" + groupID + ", groupName=" + groupName + ", creator=" + creator + ", createDate="
				+ createDate + ", accounts=" + Arrays.toString(accounts) + "]";
	}

	public short getGroupID() {
		return groupID;
	}

	public String getGroupName() {
		return groupName;
	}

	public Ex2_3Account getCreator() {
		return creator;
	}

	public LocalDate getCreateDate() {
		return createDate;
	}

	public Ex2_3Account[] getAccounts() {
		return accounts;
	}

	public void setGroupID(short groupID) {
		this.groupID = groupID;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public void setCreator(Ex2_3Account creator) {
		this.creator = creator;
	}

	public void setCreateDate(LocalDate createDate) {
		this.createDate = createDate;
	}

	public void setAccounts(Ex2_3Account[] accounts) {
		this.accounts = accounts;
	}
	
	
	
	
}
