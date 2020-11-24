package Assignment_2;

import java.time.LocalDate;

public class TestEx6Method {

	public static void main(String[] args) {
		question1();
		question2();
		question3();

	}

	private static void question3() {
		int i;
		for (i = 0; i < 10; i++) {
				System.out.println(i);
		}
	}

	private static void question2() {
		// Add data department
		Department department1 = new Department();
		department1.departmentID = 1;
		department1.departmentName = "Sale";

		Department department2 = new Department();
		department2.departmentID = 2;
		department2.departmentName = "Marketing";

		Department department3 = new Department();
		department3.departmentID = 3;
		department3.departmentName = "Test";

		// Add data position
		Position position1 = new Position();
		position1.positionID = 1;
		position1.positionName = PositionName.DEV;

		Position position2 = new Position();
		position2.positionID = 2;
		position2.positionName = PositionName.PM;

		Position position3 = new Position();
		position3.positionID = 3;
		position3.positionName = PositionName.SCUM_MASTER;

		// Add data account
		Account1 account1 = new Account1();
		account1.accountID = 1;
		account1.email = "cuongnm@gmail.com";
		account1.userName = "cuongnm";
		account1.fullName = "nguyen cuong";
		account1.department = department1;
		account1.position = position2;
		account1.createDate = LocalDate.of(2019, 12, 23);

		Account1 account2 = new Account1();
		account2.accountID = 2;
		account2.email = "hoangvanthu@gmail.com";
		account2.userName = "hoangvanthu";
		account2.fullName = "hoang van thu";
		account2.department = department2;
		account2.position = position1;
		account2.createDate = LocalDate.of(2019, 12, 23);

		Account1 account3 = new Account1();
		account3.accountID = 2;
		account3.email = "nguyenchienthang@gmail.com";
		account3.userName = "nguyenc";
		account3.fullName = "nguyen chien thang";
		account3.department = department2;
		account3.position = position1;
		account3.createDate = LocalDate.of(2019, 12, 23);

		Account1[] accounts = { account1, account2, account3 };
		int i;
		for (i = 0; i < accounts.length; i++) {
			System.out.println(accounts[i].toString());
		}
	}

	private static void question1() {
		int i;
		for (i = 0; i < 10; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
	}

}
