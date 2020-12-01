package Assignment_4;

import java.time.LocalDate;

import Assignment_4.Position;
import Assignment_4.PositionName;
import Assignment_4.Department;
import Assignment_4.Account;

public class Ex1Constructor {

	public static void main(String[] args) {
//		question1();
//		question2();
////		question3();
		
	}


	private static void question3() {
		Account[] accounts = inputAccounts();
		Account1[] accountss = inputAccount1();
		
		//a
		Group group1 = new Group();
		System.out.println(group1.toString());
		
		//b
		Group group2 = new Group("Group so 2", accounts[0], LocalDate.of(2019, 06, 25), accounts);
		System.out.println(group2.toString());
		
		//c
		Group group3 = new Group("Group so 3", LocalDate.of(2020, 12, 25), accountss[0], accountss);
		System.out.println(group3.toString());
	}

	private static void question2() {
		//a
		Account account1 = new Account();
		System.out.println(account1.toString());
		
		//b
		Account account2 = new Account(2, "nguyenmn@gmail.com", "nmn", "ka ", "ma", "");
		System.out.println(account2.toString());
		
		//c
		Position position1 = new Position();
		position1.positionID = 1;
		position1.positionName = PositionName.SCUM_MASTER;
		
		Account account3 = new Account(3, "cuongnm@gmail.com", "cuong", "cuong", "nguyen", "", position1);
		System.out.println(account3.toString());
		
		//d
		Account account4 = new Account(4, "hkoinm@gmail.com", "hkoi", "mak", "hkoi", "", position1, LocalDate.of(2015, 06, 12));
		System.out.println(account4.toString());
	}

	private static void question1() {
		//a
		Department department1 = new Department();
		System.out.println(department1.toString());

		//b
		Department department2 = new Department("Sale");
		System.out.println(department2.toString());
	}
	
	private static Account[] inputAccounts() {
		Department[] departments = inputDepartments();
		Position[] positions = inputPositions();
		
		Account account1 = new Account();
		account1.accountID = 1;
		account1.email = "cuongnm@gmail.com";
		account1.userName = "cuongnm";
		account1.fullName = "nguyen cuong";
		account1.department = departments[0];
		account1.position = positions[1];
		account1.createDate = LocalDate.of(2019, 12, 23);

		Account account2 = new Account();
		account2.accountID = 2;
		account2.email = "hoangvanthu@gmail.com";
		account2.userName = "hoangvanthu";
		account2.fullName = "hoang van thu";
		account2.department = departments[1];
		account2.position = positions[0];
		account2.createDate = LocalDate.of(2019, 12, 23);

		Account account3 = new Account();
		account3.accountID = 2;
		account3.email = "nguyenchienthang@gmail.com";
		account3.userName = "nguyenc";
		account3.fullName = "nguyen chien thang";
		account3.department = departments[1];
		account3.position = positions[0];
		account3.createDate = LocalDate.of(2019, 12, 23);
		
		Account[] accounts = {account1, account2, account3};
		
		return accounts;
	}
	
	private static Account1[] inputAccount1() {
	
		Department[] departments = inputDepartments();
		Position[] positions = inputPositions();
		
		Account1 acoounts1 = new Account1();
		acoounts1.accountID = 1;
		acoounts1.email = "cuongnm@gmail.com";
		acoounts1.userName = "cuongnm";
		acoounts1.fullName = "nguyen cuong";
		acoounts1.department = departments[0];
		acoounts1.position = positions[1];
		acoounts1.createDate = LocalDate.of(2019, 12, 23);

		Account1 acoounts2 = new Account1();
		acoounts2.accountID = 2;
		acoounts2.email = "hoangvanthu@gmail.com";
		acoounts2.userName = "hoangvanthu";
		acoounts2.fullName = "hoang van thu";
		acoounts2.department = departments[1];
		acoounts2.position = positions[0];
		acoounts2.createDate = LocalDate.of(2019, 12, 23);

		Account1 acoounts3 = new Account1();
		acoounts3.accountID = 2;
		acoounts3.email = "nguyenchienthang@gmail.com";
		acoounts3.userName = "nguyenc";
		acoounts3.fullName = "nguyen chien thang";
		acoounts3.department = departments[1];
		acoounts3.position = positions[0];
		acoounts3.createDate = LocalDate.of(2019, 12, 23);
		
		Account1[] accountss = {acoounts1, acoounts2, acoounts3};
		
		return accountss;
	}
	
	private static Department[] inputDepartments() {
		Department department1 = new Department();
		department1.departmentID = 1;
		department1.departmentName = "Sale";

		Department department2 = new Department();
		department2.departmentID = 2;
		department2.departmentName = "Marketing";

		Department department3 = new Department();
		department3.departmentID = 3;
		department3.departmentName = "Test";
		
		Department[] departments = {department1, department2, department3};
		
		return departments;
	}
	
	private static Position[] inputPositions() {
		Position position1 = new Position();
		position1.positionID = 1;
		position1.positionName = PositionName.DEV;

		Position position2 = new Position();
		position2.positionID = 2;
		position2.positionName = PositionName.PM;

		Position position3 = new Position();
		position3.positionID = 3;
		position3.positionName = PositionName.SCUM_MASTER;
		
		Position[] positions = {position1, position2, position3};
		
		return positions;
	}
	

}
