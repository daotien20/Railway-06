package com.vti.entity;

public class Ex2_3Department {
	private byte	departmentID;
	private String	departmentName;
	
	public Ex2_3Department() {
		super();
	}
	
	@Override
	public String toString() {
		return "Department [departmentID=" + departmentID + ", departmentName=" + departmentName + "]";
	}

	public byte getDepartmentID() {
		return departmentID;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentID(byte departmentID) {
		this.departmentID = departmentID;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	
	
	
}
