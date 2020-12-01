package Assignment_4;

import java.time.LocalDate;

import Assignment_4.Department;
import Assignment_4.Position;

public class Account1 {
	int					accountID;
	String				email;
	String				userName;
	String 				fullName;
	Department			department;
	Position			position;
	LocalDate			createDate;
	


	@Override
	public String toString() {
		return "Account1 [accountID=" + accountID + ", email=" + email + ", userName=" + userName + ", fullName="
				+ fullName + ", department=" + department + ", position=" + position + ", createDate=" + createDate
				+ "]";
	}

	public Account1(int accountID, String email, String userName, String fullName, Department department,
			Position position, LocalDate createDate) {
		super();
		this.accountID = (Integer) null;
		this.email = null;
		this.userName = userName;
		this.fullName = null;
		this.department = null;
		this.position = null;
		this.createDate = null;
	}

	public Account1() {
		super();
	}
	
	
	
}
