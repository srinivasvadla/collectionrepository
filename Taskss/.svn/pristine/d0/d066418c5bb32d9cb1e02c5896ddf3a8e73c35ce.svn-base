package com.srinu.statics;

// To avoid the SYstem.ot.println
import static java.lang.System.*;

public class StaticForm {

	protected int m = 9;

	static int i;
	static String s;
	static float f;

	static {

	}

	int j;
	
	public static void m() {
		System.out.println("fdhfdhfds");
	}

	// static content will be used in non static context USING CLASS NAME
	public void test() {
		
		StaticForm.i=10;
		// System.out.println(StaticChecking.k);
		System.out.println(m);

		// non static variables cannot be used in the static context;
		j = 10;
		f = 101.3f;
		i = 10;

		s = "srinivas";

		// we can import static import to print this statement
		out.print("from static import::  " + i);
		out.print("from static import::  " + i);
		// System.out.println(j+" "+f+" "+i+" "+s);

	}

	public static void main(String[] args) {

		StaticForm o = new StaticForm();
		o.test();
		
		o.m();
		//StaticForm.i=10;

		StaticForm.i = 10;

	}

}
