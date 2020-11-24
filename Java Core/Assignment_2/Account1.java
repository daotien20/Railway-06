package Assignment_2;

import java.time.LocalDate;
import java.util.Arrays;

public class Account1 {
	int					accountID;
	String				email;
	String				userName;
	String 				fullName;
	Department			department;
	Position			position;
	LocalDate			createDate;
	Group[] 			groups;
	@Override
	public String toString() {
		return "Account1 [accountID=" + accountID + ", email=" + email + ", userName=" + userName + ", fullName="
				+ fullName + ", department=" + department.departmentName + ", position=" + position.positionName + ", createDate=" + createDate
				+ "]";
	}

	
	
}
