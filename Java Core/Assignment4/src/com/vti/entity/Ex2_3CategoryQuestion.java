package com.vti.entity;

public class Ex2_3CategoryQuestion {
	private byte		categoryID;
	private String		categoryName;
	
	public Ex2_3CategoryQuestion() {
		super();
	}

	@Override
	public String toString() {
		return "CategoryQuestion [categoryID=" + categoryID + ", categoryName=" + categoryName + "]";
	}

	public byte getCategoryID() {
		return categoryID;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryID(byte categoryID) {
		this.categoryID = categoryID;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	
	
	
	
}
