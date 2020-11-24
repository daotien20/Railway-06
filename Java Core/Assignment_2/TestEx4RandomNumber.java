package Assignment_2;

import java.time.LocalDate;
import java.util.Random;

public class TestEx4RandomNumber {

	public static void main(String[] args) {
		
		question1();
		question2();
		question3();
		question4();
//		question5();
		question6();
		question7();
		

//		Random	random = new Random();
		
//		//random 1 so tu 0 - 9
//		int x = random.nextInt(10);
//		System.out.println(x);
//		
//		//random 1 so tu 13 - 25
//		int y = random.nextInt(13) + 13;
//		System.out.println(y);
//		
//		float r = random.nextFloat();
//		System.out.println(r);
	}

	private static void question7() {

	}

	private static void question6() {
		
	}

//	private static void question5() {
//		Random random = new Random();
//		int today = (int) LocalDate.now();
//	}

	private static void question4() {
		Random random = new Random();
		int minDate = (int) LocalDate.of(1995, 7, 24).toEpochDay();
		int maxDate = (int) LocalDate.of(1995, 12, 20).toEpochDay();

		long randomLong = minDate + random.nextInt(maxDate - minDate);

		LocalDate randomDate = LocalDate.ofEpochDay(randomLong);
		System.out.println("Question4: In ngẫu nhiên 1 ngày trong khoảng thời gian 24/07/1995 tới này 20/12/1995");
		System.out.println(randomDate);
	}

	private static void question3() {
		
		String[] students = {"Mai Văn Hiến", "Cù Lao Chàm", "A Bờ Cờ"};
		
		Random	random = new Random();
		int x = random.nextInt(students.length);
		System.out.println("Question3: In ngẫu nhiên ra 1 tên");
		System.out.println(students[x]);
		
	}

	private static void question2() {
		Random	random = new Random();
		float x = random.nextFloat();
		System.out.println("Question2: In ngẫu nhiên ra 1 số thực");
		System.out.println(x);
	}

	private static void question1() {
		Random	random = new Random();
		int x = random.nextInt();
		System.out.println("Question1: In ngẫu nhiên ra 1 số nguyên");
		System.out.println(x);
	}

}
