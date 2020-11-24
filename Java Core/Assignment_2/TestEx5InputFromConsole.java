package Assignment_2;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

public class TestEx5InputFromConsole {

	public static void main(String[] args) {
		question1();
		question2();
		question3();
//		question4();
//		question5();
		question6();

	}


	private static void question6() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap vao ID cua dpartment: ");
		int id1 = scanner.nextInt();
		Department department1 = new Department();
		department1.departmentID = id1;
		scanner.nextLine();
		System.out.println("Nhap vao ten cua department: ");
		department1.departmentName = scanner.nextLine();
		
		System.out.println(department1.toString());
		
		
	}

//	private static void question4() {
//		System.out.println("Question 4-----------------------------");
//		Scanner scanner = new Scanner(System.in);
//		
//		System.out.println("Nhập vào ngày sinh nhật của bạn (theo định dạng ngày-tháng-năm): ");
//		String dateInput = scanner.next();
//		
//		String pattern = "dd-MM-yyyy";
//		SimpleDateFormat dateFormat = new SimpleDateFormat(pattern);
//		Date date = dateFormat.parse(dateInput);
//		System.out.println("Sinh nhật của bạn: " + date);
//		
//		scanner.close();
//				
//	}
	
	private static void question3() {
		System.out.println("Question 3-----------------------------");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập họ và tên");
		System.out.println("Họ của bạn: ");
		String lastName = scanner.nextLine();
		System.out.println("Tên của bạn: ");
		String firstName = scanner.nextLine();
		String s1 = lastName + " " + firstName;
		System.out.println("Họ và tên của bạn: " + s1);
		
	}
	
	private static void question2() {
		System.out.println("Question 2-----------------------------");
		Scanner scanner = new Scanner(System.in);
		int i;
		for (i = 1; i < 3; i++) {
			System.out.println("Nhập vào số thực thứ " + i + ":");
			double x = scanner.nextDouble();
			System.out.println(x);
		}
	
	}
	
	private static void question1() {
		System.out.println("Question 1-----------------------------");
		Scanner scanner = new Scanner(System.in);
		int i;
		for (i = 1; i < 4; i++) {
			System.out.println("Nhập vào số nguyên thứ " + i + ":");
			int x = scanner.nextInt();
			System.out.println(x);
		}
	}

}
