package com.vti.entity;

public class Ex2_3Position {
	private byte			positionID;
	private Ex2_3PositionName	positionName;
	
	public Ex2_3Position() {
		super();
	}

	@Override
	public String toString() {
		return "Position [positionID=" + positionID + ", positionName=" + positionName + "]";
	}

	public byte getPositionID() {
		return positionID;
	}

	public Ex2_3PositionName getPositionName() {
		return positionName;
	}

	public void setPositionID(byte positionID) {
		this.positionID = positionID;
	}

	public void setPositionName(Ex2_3PositionName positionName) {
		this.positionName = positionName;
	}
	
	
	
	
}
