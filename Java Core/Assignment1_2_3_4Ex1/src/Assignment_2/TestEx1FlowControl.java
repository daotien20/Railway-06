package Assignment_2;

import java.time.LocalDate;

public class TestEx1FlowControl {

	public static void main(String[] args) {

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
		Account account1 = new Account();
		account1.accountID = 1;
		account1.email = "cuongnm@gmail.com";
		account1.userName = "cuongnm";
		account1.fullName = "nguyen cuong";
		account1.department = department1;
		account1.position = position2;
		account1.createDate = LocalDate.of(2019, 12, 23);

		Account account2 = new Account();
		account2.accountID = 2;
		account2.email = "hoangvanthu@gmail.com";
		account2.userName = "hoangvanthu";
		account2.fullName = "hoang van thu";
		account2.department = department2;
		account2.position = position1;
		account2.createDate = LocalDate.of(2019, 12, 23);

		Account account3 = new Account();
		account3.accountID = 2;
		account3.email = "nguyenchienthang@gmail.com";
		account3.userName = "nguyenc";
		account3.fullName = "nguyen chien thang";
		account3.department = department2;
		account3.position = position1;
		account3.createDate = LocalDate.of(2019, 12, 23);

		
//		System.out.println(account1.toString());
		
		// Add data group
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

		// Add data TypeQuestion
		TypeQuestion type1 = new TypeQuestion();
		type1.typeID = 1;
		type1.typeName = TypeName.ESSAY;

		TypeQuestion type2 = new TypeQuestion();
		type2.typeID = 2;
		type2.typeName = TypeName.MULTIPLE_CHOICE;

		// Add data CategoryQuestion
		CategoryQuestion category1 = new CategoryQuestion();
		category1.categoryID = 1;
		category1.categoryName = "Java";

		CategoryQuestion category2 = new CategoryQuestion();
		category2.categoryID = 2;
		category2.categoryName = "Python";

		CategoryQuestion category3 = new CategoryQuestion();
		category3.categoryID = 3;
		category3.categoryName = "C";

		// Add data Question
		Question question1 = new Question();
		question1.questionID = 1;
		question1.content = "cau hoi so 1";
		question1.category = category1;
		question1.type = type1;
		question1.creator = account1;
		question1.createDate = LocalDate.of(2020, 01, 01);

		Question question2 = new Question();
		question2.questionID = 2;
		question2.content = "cau hoi so 2";
		question2.category = category1;
		question2.type = type1;
		question2.creator = account1;
		question2.createDate = LocalDate.of(2020, 01, 01);

		Question question3 = new Question();
		question3.questionID = 3;
		question3.content = "cau hoi so 3";
		question3.category = category2;
		question3.type = type2;
		question3.creator = account1;
		question3.createDate = LocalDate.of(2020, 01, 01);

		// Add data Answer
		Answer answer1 = new Answer();
		answer1.answer_id = 1;
		answer1.content = "cau tra loi so 1";
		answer1.question = question2;
		answer1.is_correct = true;

		Answer answer2 = new Answer();
		answer2.answer_id = 2;
		answer2.content = "cau tra loi so 2";
		answer2.question = question2;
		answer2.is_correct = false;

		Answer answer3 = new Answer();
		answer3.answer_id = 3;
		answer3.content = "cau tra loi so 3";
		answer3.question = question1;
		answer3.is_correct = true;

		// Add data exam
		Exam exam1 = new Exam();
		exam1.examID = 1;
		exam1.code = "EX001";
		exam1.title = "Python Final Exam";
		exam1.category = category1;
		exam1.duration = 60;
		exam1.creator = account1;
		exam1.createDate = LocalDate.of(2020, 01, 01);

		Exam exam2 = new Exam();
		exam2.examID = 2;
		exam2.code = "EX002";
		exam2.title = ".NET Final Exam";
		exam2.category = category2;
		exam2.duration = 60;
		exam2.creator = account1;
		exam2.createDate = LocalDate.of(2020, 01, 01);

		Exam exam3 = new Exam();
		exam3.examID = 3;
		exam3.code = "EX003";
		exam3.title = "Java Final Exam";
		exam3.category = category1;
		exam3.duration = 120;
		exam3.creator = account3;
		exam3.createDate = LocalDate.of(2020, 01, 01);

		Exam[] examsOfQuestion1 = { exam1, exam2 };
		question1.exams = examsOfQuestion1;

		Exam[] examsOfQuestion2 = { exam2, exam3 };
		question2.exams = examsOfQuestion2;

		Exam[] examsOfQuestion3 = { exam1, exam3 };
		question3.exams = examsOfQuestion3;

		Question[] questionsOfExam1 = { question1, question3 };
		exam1.questions = questionsOfExam1;

		Question[] questionsOfExam2 = { question1, question2 };
		exam2.questions = questionsOfExam2;

		Question[] questionsOfExam3 = { question2, question3 };
		exam3.questions = questionsOfExam3;

// IF
	//Ques1
		System.out.println("Question 1----------------------");
		if (account2.department == null) {
			System.out.println("Nhan vien nay chua co phong ban");
		} else {
			System.out.println("Phong ban cua nhan vien nay la " + account2.department.departmentID);
		}
		System.out.println("");
		
	//Ques2
		System.out.println("Question 2----------------------");
		if (account2.groups.length == 0) {
			System.out.println("Nhan vien nay chua co group");
		}else if(account2.groups.length <=2 ){
			System.out.println("Group cua nhan vien nay la Java Fresher, C# Fresher");
		}else if(account2.groups.length ==3) {
			System.out.println("Nhan vien nay la nguoi quan trong, tham gia nhieu group");
		}else {
			System.out.println("Nhan vien nay la nguoi hong chuyen, tham gia tat ca cac group");
		}
		System.out.println("");
		
	//Ques3
		System.out.println("Question 3----------------------");
		System.out.println((account2.department == null) ? "Nhan vien nay chua co phong ban"
				: "Phong ban cua nhan vien nay la " + account2.department.departmentID);	
		System.out.println("");
		
	//Ques4
		System.out.println("Question 4----------------------");
		System.out.println((account1.position.positionName == PositionName.DEV) ? "Day la developer" 
				: "Nguoi nay khong phai developer");
		System.out.println("");
		
//SWITCH CASE		
	//Ques5
		System.out.println("Question 5----------------------");
		switch (group1.accounts.length) {
		case 1:
			System.out.println("Nhom co 1 thanh vien");
			break;
		case 2:
			System.out.println("Nhom co 2 thanh vien");
			break;
		case 3:
			System.out.println("Nhom co 3 thanh vien");
			break;
		default:
			System.out.println("Nhom co nhieu thanh vien");
			break;
		}
		System.out.println("");
		
	//Ques6
		System.out.println("Question 6----------------------");
		switch (account2.groups.length) {
		case 0:
			System.out.println("Nhan vien nay chua co group");
			break;
		case 1:
			System.out.println("Group cua nhan vien nay la Java Fresher, C# Fresher");
			break;
		case 2:				
			System.out.println("Group cua nhan vien nay la Java Fresher, C# Fresher");
			break;
		case 3:
			System.out.println("Nhan vien nay la nguoi quan trong, tham gia nhieu group");
		case 4:				
			System.out.println("Nhan vien nay la nguoi hong chuyen, tham gia tat ca cac group");
			break;
		default:
			break;
		}
		System.out.println("");
		
	//Ques7
		System.out.println("Question 7----------------------");
		switch (account1.position.positionName) {
		case DEV:
			System.out.println("Day la developer");
			break;
		default:
			System.out.println("Nguoi nay khong phai developer");
			break;
		}
		System.out.println("");
		
//FOR EACH		
	//Ques8
		System.out.println("Question 8----------------------");
		Account[] accounts = {account1, account2, account3};
		int i = 1;
		for (Account account : accounts) {
			System.out.println("Email: " + account.email);
			System.out.println("Full Name: " + account.fullName);
			System.out.println("Account Department: " + account.department.departmentName);
			System.out.println("");
			i++;
		}
		
	//Ques9
		System.out.println("Question 9----------------------");
		Department [] departments = {department1, department2, department3};
		for (Department department : departments) {
			System.out.println("Department ID: " + department.departmentID);
			System.out.println("Department Name: " + department.departmentName);
			System.out.println("");
			i++;
		}
		
//FOR
	//Ques10
		System.out.println("Question 10----------------------");
		for (i = 0; i < accounts.length; i++) {
			System.out.println("Thong tin Account thu " + (i + 1) + " la: ");
			System.out.println("Email: " + accounts[i].email);
			System.out.println("Full Name: " + accounts[i].fullName);
			System.out.println("Account Department: " + accounts[i].department.departmentName);
			System.out.println("");
			}
		
	//Ques11
		System.out.println("Question 11----------------------");
		for (i = 0; i <departments.length; i++) {
			System.out.println("Thong tin department thu" + (i + 1) + " la: ");
			System.out.println("Department ID: " + departments[i].departmentID);
			System.out.println("Department Name: " + departments[i].departmentName);
			System.out.println("");
			}

	//Ques12
		System.out.println("Question 12----------------------");
		for (i = 0; i <2; i++) {
			System.out.println("Thong tin department thu" + (i + 1) + " la: ");
			System.out.println("Department ID: " + departments[i].departmentID);
			System.out.println("Department Name: " + departments[i].departmentName);
			System.out.println("");
		}
		
	//Ques13
		System.out.println("Question 13----------------------");
		for (i = 0; i < accounts.length; i++) {
			if (i == 1) {
				continue;
			}
			System.out.println("Thong tin Account thu " + (i + 1) + " la: ");
			System.out.println("Email: " + accounts[i].email);
			System.out.println("Full Name: " + accounts[i].fullName);
			System.out.println("Account Department: " + accounts[i].department.departmentName);
			System.out.println("");
			}
		
	//Ques14
		System.out.println("Question 14----------------------");
		for (i = 0; i < accounts.length; i++) {
			if (accounts[i].accountID >= 4) {
				break;
			}
			System.out.println("Thong tin Account thu " + (i + 1) + " la: ");
			System.out.println("Email: " + accounts[i].email);
			System.out.println("Full Name: " + accounts[i].fullName);
			System.out.println("Account Department: " + accounts[i].department.departmentName);
			System.out.println("");
			}
					
		
	//Ques15
		System.out.println("Question 15----------------------");
		for (i = 0; i <= 20; i++ ) {
			if (i % 2 == 0) {
			System.out.println(i);
			}
		}
		System.out.println("");
		
//WHILE		
	//Ques16_10
		System.out.println("Question 16_10----------------------");
		i = 0;
		while (i < accounts.length) {
			System.out.println("Thong tin Account thu " + (i + 1) + " la: ");
			System.out.println("Email: " + accounts[i].email);
			System.out.println("Full Name: " + accounts[i].fullName);
			System.out.println("Account Department: " + accounts[i].department.departmentName);
			System.out.println("");
			i++;
			}	
		
	//Ques16_11
		System.out.println("Question 16_11----------------------");
		i = 0;
		while (i < departments.length) {
			System.out.println("Thong tin department thu" + (i + 1) + " la: ");
			System.out.println("Department ID: " + departments[i].departmentID);
			System.out.println("Department Name: " + departments[i].departmentName);
			System.out.println("");
			i++;
			}
	
	//Ques16_12
		System.out.println("Question 16_12----------------------");
		i = 0;
		while (i < 2) {
			System.out.println("Thong tin department thu" + (i + 1) + " la: ");
			System.out.println("Department ID: " + departments[i].departmentID);
			System.out.println("Department Name: " + departments[i].departmentName);
			System.out.println("");
			i++;
		}
		
	//Ques16_13
		System.out.println("Question 16_13----------------------");
		i = 0;
		while (i < accounts.length) {
			if(i == 1) {
				i++; //tai sao phai co i++ o day?
				continue;
			}
			System.out.println("Thong tin Account thu " + (i + 1) + " la: ");
			System.out.println("Email: " + accounts[i].email);
			System.out.println("Full Name: " + accounts[i].fullName);
			System.out.println("Account Department: " + accounts[i].department.departmentName);
			System.out.println("");
			i++;
			}
		
	//Ques16_14
		System.out.println("Question 16_14----------------------");
		i = 0;
		while (i < accounts.length) {
			if (accounts[i].accountID < 4) {
			System.out.println("Thong tin Account thu " + (i + 1) + " la: ");
			System.out.println("Email: " + accounts[i].email);
			System.out.println("Full Name: " + accounts[i].fullName);
			System.out.println("Account Department: " + accounts[i].department.departmentName);
			System.out.println("");
			i++;
			}
		}
		
	//Ques16_15
		System.out.println("Question 16_15----------------------");
		i = 0;
		while (i <= 20) {
			if (i % 2 == 0) {
				System.out.println(i);	
			}
		i++;
		}
		System.out.println("");
		
//DO-WHILE		
	//Ques17_10
		System.out.println("Question 17_10----------------------");
		i = 0;
		do {
			System.out.println("Thong tin Account thu " + (i + 1) + " la: ");
			System.out.println("Email: " + accounts[i].email);
			System.out.println("Full Name: " + accounts[i].fullName);
			System.out.println("Account Department: " + accounts[i].department.departmentName);
			System.out.println("");
			i++;
			}
		while (i < accounts.length);
		System.out.println("");
		
	//Ques17_11
		System.out.println("Question 17_11----------------------");
		i = 0;
		do {
			System.out.println("Thong tin department thu" + (i + 1) + " la: ");
			System.out.println("Department ID: " + departments[i].departmentID);
			System.out.println("Department Name: " + departments[i].departmentName);
			System.out.println("");
			i++;
			}
		while (i < departments.length);
		System.out.println("");
		
	//Ques17_12
		System.out.println("Question 17_12----------------------");
		i = 0;
		do {
			System.out.println("Thong tin department thu" + (i + 1) + " la: ");
			System.out.println("Department ID: " + departments[i].departmentID);
			System.out.println("Department Name: " + departments[i].departmentName);
			System.out.println("");
			i++;
			}
		while (i < 2);
		System.out.println("");
		
	//Ques17_13
		System.out.println("Question 17_13----------------------");
		i = 0;
		do {
			if(i == 1) {
				i++;
				continue; //continue khac gi break
			}
			System.out.println("Thong tin Account thu " + (i + 1) + " la: ");
			System.out.println("Email: " + accounts[i].email);
			System.out.println("Full Name: " + accounts[i].fullName);
			System.out.println("Account Department: " + accounts[i].department.departmentName);
			System.out.println("");
			i++;
			}
		while (i < accounts.length);
		System.out.println("");
		
	//Ques17_14
		System.out.println("Question 17_14----------------------");
		i = 0;
		do {
			if (accounts[i].accountID < 4) {
				System.out.println("Thong tin Account thu " + (i + 1) + " la: ");
				System.out.println("Email: " + accounts[i].email);
				System.out.println("Full Name: " + accounts[i].fullName);
				System.out.println("Account Department: " + accounts[i].department.departmentName);
				System.out.println("");
				i++;
				}
			}
		while (i < accounts.length);
		System.out.println("");
		
		
	//Ques17_15
		System.out.println("Question 17_15----------------------");
		i = 0;
		do {
			if (i % 2 == 0) {
				System.out.println(i);	
			}
			i++;
			}
		while (i <= 20);
	}
}
