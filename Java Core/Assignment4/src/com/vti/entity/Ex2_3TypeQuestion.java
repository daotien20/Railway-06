package com.vti.entity;

public class Ex2_3TypeQuestion {
	private byte		typeID;
	private Ex2_3TypeName	typeName;
	
	public Ex2_3TypeQuestion() {
		super();
	}

	@Override
	public String toString() {
		return "TypeQuestion [typeID=" + typeID + ", typeName=" + typeName + "]";
	}

	public byte getTypeID() {
		return typeID;
	}

	public Ex2_3TypeName getTypeName() {
		return typeName;
	}

	public void setTypeID(byte typeID) {
		this.typeID = typeID;
	}

	public void setTypeName(Ex2_3TypeName typeName) {
		this.typeName = typeName;
	}
	
	
	
}
