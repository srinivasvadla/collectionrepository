package com.srinu.overloading;

public class TeluguMovies extends Movies {

	public void simplicity() {

		System.out.println("telugu films");
	}

	public void piracyMovies() {
		System.out.println("Telugu films copied from the  tamil movies");
	}

	public void heroein(String heroein, int age) {

		if ((age <= 24) && (age >= 18)) {

			char[] name = { 's' };

			// String s = heroein.valueOf(name);

			if (heroein.startsWith("s")) {

				System.out.println("iam  ready to take her as a heroein:: "+heroein+"and her age is ::"+age);

			}

			/*
			  for(int i=0;i<heroein.length()>=;i++) {
			  
			  System.out.println("age is less and name matched  iam ready to marry ");
			 
			  }
			 */
			else {
				System.out.println("name does not matched with letter::"+name);
			}

		} else {
			System.out.println("her name  is not matched  " + heroein + " And her age   IS ::" + age);
		}
		// System.out.println("copied from the english movies");
	}
}
