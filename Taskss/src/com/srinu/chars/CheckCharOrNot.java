package com.srinu.chars;

import java.util.Scanner;

public class CheckCharOrNot {

	Scanner sc = new Scanner(System.in);

	public void checkChar() {
		System.out.println("enter  the chars ");
		char c = sc.next().charAt(0);

		
		//sys
		if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {

			System.out.println("given umer is character::" + c);
		}

		else {
			System.out.println("not a char:: " + c);
		}
		char[] ch = { 'a', 'b' };

		for (int i = 0; i < ch.length; i++) {

			System.out.println(i);
		}

	}

	public static void main(String[] args) {
		CheckCharOrNot c = new CheckCharOrNot();

		c.checkChar();

	}

}
