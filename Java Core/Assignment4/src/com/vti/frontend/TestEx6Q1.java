package com.vti.frontend;

import com.vti.backend.beEx6Q1Abstract;

public class TestEx6Q1 {

	public static void main(String[] args) {
		beEx6Q1Abstract test = new beEx6Q1Abstract();
		test.insertContact("Hà Kiều", "0123456789");
		test.removeContact("Hà Kiều");
		test.updateContact("Hà Kiều", "234567890");
		test.searchContact("Hà Kiều");

	}
}
