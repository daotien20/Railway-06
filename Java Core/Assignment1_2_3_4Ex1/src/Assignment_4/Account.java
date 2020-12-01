package Assignment_4;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Date;

public class Account {
	int					accountID;
	String				email;
	String				userName;
	String 				fullName;
	Department			department;
	Position			position;
	LocalDate			createDate;
//	Group[] 			groups;
	
	public Account() {
		super();
	}
	
	public Account(int accountID, String email, String userName, String firstName, String lastName, String fullName) {
		super();
		this.accountID = accountID;
		this.email = email;
		this.userName = userName;
		this.fullName = firstName + lastName;
	}

	public Account(int accountID, String email, String userName, String firstName, String lastName, String fullName,
			Position position) {
		super();
		this.accountID = accountID;
		this.email = email;
		this.userName = userName;
		this.fullName =  firstName + lastName;
		this.position = position;
		this.createDate = LocalDate.now();
	}

	public Account(int accountID, String email, String userName, String firstName, String lastName, String fullName,
			Position position, LocalDate createDate) {
		super();
		this.accountID = accountID;
		this.email = email;
		this.userName = userName;
		this.fullName = firstName + lastName;
		this.position = position;
		this.createDate = createDate;
	}

	@Override
	public String toString() {
		return "Account [accountID=" + accountID + ", email=" + email + ", userName=" + userName + ", fullName=" + fullName + ", position=" + position + ", createDate=" + createDate + "]";
	}
	
	
	
	
	
	
}
	
	
	
	
	

	


