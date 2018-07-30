package com.srinu.AutoBoxing;

public class AutoBoxing {

	public static void main(String[] args) throws NumberFormatException {

		int i = 10;
		Integer l = new Integer(i);

		Integer g = i;
		System.out.println(g);// Autoboxing --convertng an data type to wrapper type

		Integer i1 = new Integer("12");
		i1.hashCode();

		
		System.out.println(i1);
		// we an pass String for integer argument as well

		System.out.println(i1);

	}

}
