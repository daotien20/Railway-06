package com.vti.backend;

import com.vti.entity.Ex4Q1Encapsulation;

public class beEx4Q1Encapsulation {

	public static void main(String[] args) {

	}

	public void question1() {
		Ex4Q1Encapsulation student1 = new Ex4Q1Encapsulation("Chung", "Hà Nội");
//		student1.setScore(8);

		Ex4Q1Encapsulation student2 = new Ex4Q1Encapsulation("Cường", "Hà Giang");
		student2.setScore(10);

		Ex4Q1Encapsulation student3 = new Ex4Q1Encapsulation("Kiên", "Hà Tây");
		student3.setScore(4);

		student3.plusScore(2.5f);

		System.out.println(student1);
		System.out.println(student2);
		System.out.println(student3);
	}

}
