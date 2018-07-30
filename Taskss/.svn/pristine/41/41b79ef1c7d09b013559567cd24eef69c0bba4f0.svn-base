package com.srinu.polymorphism;

public class Child extends Parent {

	// we can over ride static method in subclass but it says method hidding
	public static void m1() {

		System.out.println(" sub class overridden static method");
	}

	// overridden instance method
	// Finds the length of the String
	@Override
	public   void employee() {
		String st = new String("srinivas panchal");

		for (int i = 1; i < st.length(); i++) {
			System.out.println(i);
		}

	}

	public static void main(String[] args) {

		Child c = new Child();

		c.m1();
		c.employee();

	}

}
