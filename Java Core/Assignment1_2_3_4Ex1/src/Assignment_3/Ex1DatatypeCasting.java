package Assignment_3;

import java.util.Random;
import java.util.Scanner;

public class Ex1DatatypeCasting {

	public static void main(String[] args) {
//		question1();
//		question2();
//		question3();
		question4();
		
		
		
	}

	
//Assign3 Ex1 Ques 4:
	private static void question4() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập số nguyên a: ");
		int a = scanner.nextInt();
		int b;
		while(true) {
			System.out.println("Nhập số nguyên b: ");
			b = scanner.nextInt();
			if(b == 0) {
				System.out.println("Nhập lại số b");
				continue;
			}else {
				break;
			}
		
		}
		float c = (float) a/b;
		System.out.printf("%.2f", c);
		
	}

	private static void question3() {
		Random random = new Random();
		int x = random.nextInt(100000);
		Integer y = x;
		if(x<10) {
			String s1 = "0000" + y;
			System.out.println(s1);
			System.out.println(s1.substring(3, 5));
			
		}else if(x < 100) {
			String s2 = "000" + y;
			System.out.println(s2);
			System.out.println(s2.substring(3, 5));
			
		}else if(x < 1000) {
			String s3 = "00" + y;
			System.out.println(s3);
			System.out.println(s3.substring(3, 5));
			
		}else if(x < 10000) {
			String s4 = "0" + y;
			System.out.println(s4);
			System.out.println(s4.substring(3, 5));
			
		}else {
			String s5 = "" + y;
			System.out.println(s5);
			System.out.println(s5.substring(3, 5));
		}
		
	}
	
	private static void question2() {
		Random random = new Random();
		int x = random.nextInt(100000);
		Integer y = x;
		
		if(x<10) {
			System.out.println("0000" + y);
		}else if(x < 100) {
			System.out.println("000" + y);
		}else if(x < 1000) {
			System.out.println("00" + y);
		}else if(x < 10000) {
			System.out.println("0" + y);
		}else {
			System.out.println(y);
		}
	}

	private static void question1() {
		float luongAccount1 = 5240.5f;
		float luongAccount2 = 10970.055f;
		
		int x = (int)luongAccount1;
		int y = (int)luongAccount2;
		
		System.out.println("Lương của Account 1: " + x + "$");
		System.out.println("Lương của Account 2: " + y + "$");
	}

}
