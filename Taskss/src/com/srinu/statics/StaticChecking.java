package com.srinu.statics;

public class StaticChecking {

	static int k = 10;
	// final variable with static combinaion we has to declare  a value; 
	 final static int l=10;
	  static int m;

	
	

	// static block
	// static block executes the moment when the class is loading into the jvm
	static {

		System.out.println("static variable valus of  L is ::"+l);
		System.out.println("inside the static block");

		// static block to static method calling using class nam
		name("static method is calling from static block");
		// we can able to create an object in static block
		StaticChecking s = new StaticChecking();
		StaticChecking.name1("hello Srinivas");
		s.department();
	}

	// instance block
	// this block executes when the time of object creation
	{
		System.out.println("inside the instance block");
		// StaticChecking s = new StaticChecking();
		// we can call instance method being from instance block but we have to create
		// an Object to a class

	}

	// static method call by using the class name.
	public static void name(String name) {
		StaticChecking s = new StaticChecking();
		s.department();// department is a non static method
		System.out.println(name);
	}
	public static void name1(String name) {

		StaticChecking s = new StaticChecking();
		s.department();// department is a non static method
		System.out.println(name);
	}


	// non static method
	public void department() {

		
		
		for (int i = 0; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.print(" " + i);
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		StaticChecking s = new StaticChecking();
		// call an instance method
		// s.department();
		// To call the static method
		StaticChecking.name(" staitc method is created  and called by class name ----srinivas");

	}

}
