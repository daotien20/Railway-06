package Assignment_3;

import java.time.LocalDate;
import java.util.Arrays;

public class Account {
	int			accountID;
	String		email;
	String		userName;
	String 		fullName;
//	Department	department;
//	Position	position;
	LocalDate	createDate;
//	Group[] 	groups;
	
	@Override
	public String toString() {
		return "Account [accountID=" + accountID + ", email=" + email + ", userName=" + userName + ", fullName="
				+ fullName + ", createDate=" + createDate + "]";
	}

	
}
	

