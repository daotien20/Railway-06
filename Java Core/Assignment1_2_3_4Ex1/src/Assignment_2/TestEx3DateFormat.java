package Assignment_2;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.Locale;

public class TestEx3DateFormat {

	public static void main(String[] args) {
		question1();
		question2();

	}
	

	private static void question2() {
	}


	@SuppressWarnings("resource")
	private static void question1() {
		Account[] accounts = inputAccounts();
		
		System.out.println("Question 1:");
		System.out.println("Thông tin account thứ 1:");
		System.out.println("ID: " + accounts[0].accountID);
		System.out.println("Email: " + accounts[0].email);
		System.out.println("User Name: " + accounts[0].userName);
		System.out.println("Full Name: " + accounts[0].fullName);
		
		Locale locale = new Locale("vi", "VN");
		DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.DEFAULT, locale);
		
		ZoneId defaultZoneId = ZoneId.systemDefault();
		Date date = Date.from(accounts[0].createDate.atStartOfDay(defaultZoneId).toInstant());
		String createDate1 = dateFormat.format(date);
		
		System.out.println("Create Date: " + createDate1);
	}
	
	private static Account[] inputAccounts() {
		Account account1 = new Account();
		account1.accountID = 1;
		account1.email = "cuongnm@gmail.com";
		account1.userName = "cuongnm";
		account1.fullName = "nguyen cuong";
		account1.createDate = LocalDate.of(2019, 12, 23);

		Account account2 = new Account();
		account2.accountID = 2;
		account2.email = "hoangvanthu@gmail.com";
		account2.userName = "hoangvanthu";
		account2.fullName = "hoang van thu";
		account2.createDate = LocalDate.of(2019, 12, 23);

		Account account3 = new Account();
		account3.accountID = 2;
		account3.email = "nguyenchienthang@gmail.com";
		account3.userName = "nguyenc";
		account3.fullName = "nguyen chien thang";
		account3.createDate = LocalDate.of(2019, 12, 23);

		Account[] accounts = { account1, account2, account3 };

		return accounts;
	}
}
