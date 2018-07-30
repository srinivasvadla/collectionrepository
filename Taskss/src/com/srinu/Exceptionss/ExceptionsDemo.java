package com.srinu.Exceptionss;

public class ExceptionsDemo {

	public static void main(String[] args) {

		try {
			System.out.println("lksdnkds");
			// System.out.println(10 / 0);

			String s = null;
			s.length();
			System.out.println(s);

		} catch (NullPointerException n) {

		}

	}

}
