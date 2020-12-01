package Assignment_4;

import java.time.LocalDate;
import java.util.Arrays;

public class Group {
	short		groupID;
	String 		groupName;
	Account		creator;
	LocalDate	createDate;
	Account[]	accounts;
	
	Account1	creator1;
	Account1[]	accountss;

	


	public Group(String groupName, LocalDate createDate, Account1 creator1, Account1[] accountss) {
		super();
		this.groupName = groupName;
		this.createDate = createDate;
		this.creator1 = creator1;
		this.accountss = accountss;
	}


	public Group(String groupName, Account creator, LocalDate createDate, Account[] accounts) {
		super();
		this.groupName = groupName;
		this.creator = creator;
		this.createDate = createDate;
		this.accounts = accounts;
	}


	public Group(String groupName, Account creator, LocalDate createDate) {
		super();
		this.groupName = groupName;
		this.creator = creator;
		this.createDate = createDate;
	
	}
	

	public Group() {
		super();
	}


	@Override
	public String toString() {
		return "Group [groupID=" + groupID + ", groupName=" + groupName + ", creator=" + creator + ", createDate="
				+ createDate + ", accounts=" + Arrays.toString(accounts) + "]";
	}
	
}
