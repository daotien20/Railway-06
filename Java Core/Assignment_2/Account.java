package Assignment_2;

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
	Group[] 			groups;
	@Override
	public String toString() {
		String pattern = "dd-MM-yyyy HH:mm:ss";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		String createDate = simpleDateFormat.format(new Date());
		return "Account [email=" + email + ", fullName=" + fullName + ", department=" + department.departmentName + ", createDate=" + createDate + " groups="
				+ Arrays.toString(groups) + "]";
	}
	
	
	
	
	
	}
	


