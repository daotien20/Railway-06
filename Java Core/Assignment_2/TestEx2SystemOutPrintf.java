package Assignment_2;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

import Assignment_2.Account;
import Assignment_2.Answer;
import Assignment_2.CategoryQuestion;
import Assignment_2.Department;
import Assignment_2.Exam;
import Assignment_2.Group;
import Assignment_2.Position;
import Assignment_2.PositionName;
import Assignment_2.Question;
import Assignment_2.TypeName;
import Assignment_2.TypeQuestion;

public class TestEx2SystemOutPrintf {

	public static void main(String[] args) {

//Ques1
		System.out.println("Question 1----------------------");
		int i = 5;
		System.out.printf("%d %n %n", 5);

//Ques2
		System.out.println("Question 2----------------------");
		int a = 100000000;
		System.out.printf("%,d %n %n", 100000000);

//Ques3
		System.out.println("Question 3----------------------");
		float b = 5.567098f;
		System.out.printf("%.4f %n %n", 5.567098f);

//Ques4
		System.out.println("Question 4----------------------");
		String fullName = "Nguyen Van A";
		System.out.println("Ten toi la " + fullName + " va toi dang doc than.");
		System.out.println("");

//Ques5
		System.out.println("Question 5----------------------");
		String pattern = "dd-MM-yyyy HH:mm:ss";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		String date = simpleDateFormat.format(new Date());
		System.out.println(date);
		System.out.println("");

//Ques6
		System.out.println("Question 6----------------------");
		
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
		
		//Add data Account		
		Account account1 = new Account();
		account1.accountID = 1;
		account1.email = "cuongnm@gmail.com";
		account1.userName = "cuongnm";
		account1.fullName = "nguyen cuong";
		account1.department = department1;
		account1.createDate = LocalDate.of(2019, 12, 23); //định dạng được như đề bài nhưng số liệu không đúng

		Account account2 = new Account();
		account2.accountID = 2;
		account2.email = "hoangvanthu@gmail.com";
		account2.userName = "hoangvanthu";
		account2.fullName = "hoang van thu";
		account2.department = department2;
		account2.createDate = LocalDate.of(2019, 12, 23);

		Account account3 = new Account();
		account3.accountID = 2;
		account3.email = "nguyenchienthang@gmail.com";
		account3.userName = "nguyenc";
		account3.fullName = "nguyen chien thang";
		account3.department = department2;
		account3.createDate = LocalDate.of(2019, 12, 23);

		Account[] accounts = {account1, account2, account3};
		for (i = 0; i < accounts.length; i++) {
			System.out.println(accounts[i].toString());
		}
		System.out.println("");

//Ques7
		System.out.println("Question 7----------------------");
		//Add data Group
		Group group1 = new Group();
		group1.groupID = 1;
		group1.groupName = "group so 1";
		group1.creator = account1;
		group1.createDate = LocalDate.of(2019, 12, 25);

		Group group2 = new Group();
		group2.groupID = 2;
		group2.groupName = "group so 2";
		group2.creator = account3;
		group2.createDate = LocalDate.of(2019, 12, 25);

		Group group3 = new Group();
		group3.groupID = 3;
		group3.groupName = "group so 3";
		group3.creator = account2;
		group3.createDate = LocalDate.of(2019, 12, 25);

		Group[] groupsOfAccount1 = { group1, group2 };
		account1.groups = groupsOfAccount1;

		Group[] groupsOfAccount2 = { group2, group3 };
		account2.groups = groupsOfAccount2;

		Group[] groupsOfAccount3 = { group1, group3 };
		account3.groups = groupsOfAccount3;

		Account[] accountsOfGroup1 = { account1, account3 };
		group1.accounts = accountsOfGroup1;

		Account[] accountsOfGroup2 = { account1, account2 };
		group2.accounts = accountsOfGroup2;

		Account[] accountsOfGroup3 = { account2, account3 };
		group3.accounts = accountsOfGroup3;
		
		for (i = 0; i < accountsOfGroup1.length; i++) {
			System.out.println(accountsOfGroup1[i].toString());
		}
		for (i = 0; i < accountsOfGroup2.length; i++) {
			System.out.println(accountsOfGroup2[i].toString());			
		}
		for (i = 0; i < accountsOfGroup3.length; i++) {
			System.out.println(accountsOfGroup3[i].toString());			
		}
		
	}
}
