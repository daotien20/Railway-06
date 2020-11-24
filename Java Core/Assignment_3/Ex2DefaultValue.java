package Assignment_3;

import java.time.LocalDate;

public class Ex2DefaultValue {

	public static void main(String[] args) {
			
		Account[] accounts = new Account[5];
		for (int i = 0; i < accounts.length; i++ ) {
			accounts[i] = new Account();
			accounts[i].accountID = i + 1;
			accounts[i].email = "Email " + i+ 1;
			accounts[i].userName = "User Name " + i + 1 ;
			accounts[i].fullName = "Full Name " + i + 1;
			accounts[i].createDate = LocalDate.now();
		}
		
		for (Account account: accounts) {
			System.out.println("id: " + account.accountID);
			System.out.println("email: " + account.email);
			System.out.println("userName: " + account.userName);
			System.out.println("fullName: " + account.fullName);
			System.out.println("createDate: " + account.createDate);
			System.out.println("");
			
			System.out.println(account.toString());
		}
		
	}

}
