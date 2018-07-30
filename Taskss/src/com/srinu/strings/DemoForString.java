package com.srinu.strings;

public class DemoForString {

	public static void main(String[] args) {

		String str = "sriniva";

		String res = "sriniva";
		
	str= "chary";
		System.out.println("dfvdsfsdf"+str);

		//String s = str.concat(res);
		System.out.println(str);

		// System.out.println(str.equals(res)); // if both String values are equal the
		// it prints true else false . actually it checks the
		// value of the String
		System.out.println(str == res);// == checks the reference of the object
		System.out.println(str.compareTo(res));

		System.out.println("after trimmng " + str.trim());

		if (str.endsWith("s")) {
			System.out.println("str  has a letter's'");
		} else {
			System.out.println("dont have a letter 's' ");
		}

		char[] cha = str.toCharArray();
		System.out.println(cha);

		for (int i = 0; i < cha.length; i++) {
			System.out.println(cha[i]);
		}

	}

}
