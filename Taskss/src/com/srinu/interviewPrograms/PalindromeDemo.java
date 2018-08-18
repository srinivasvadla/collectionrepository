package com.srinu.interviewPrograms;

public class PalindromeDemo {

	public static void main(String[] args) {

		int n = 12121, r, s = 0;
		int t = n;
		while (n > 0) {
			r = n % 10;
			n = n / 10;

			s = s * 10+ r;
		}
		if (t == s) {

			System.out.println("Palindrome");
		} else {
			System.out.println("Not a palindrome");
		}

	}

}
