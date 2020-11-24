package Assignment_3;

import java.util.Random;
import java.util.Scanner;

public class Ex1DatatypeCasting {

	public static void main(String[] args) {
		question1();
		question2();
		question3();
		question4();
		
		
		
	}

	

	private static void question4() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập số nguyên a: ");
		int a = scanner.nextInt();
		System.out.println("Nhập số nguyên b: ");
		int b = scanner.nextInt();
		float c = (float) a/b;
		System.out.printf("%.2f", c);
		
	}

	private static void question3() {
		
	}
	
	private static void question2() {
		Random random = new Random();
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
