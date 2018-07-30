package com.srinu.overloading;

public class FilmsTest {

	public static void main(String[] args) {

		Movies movies = new TeluguMovies();

		movies.artists();// -------->possible
		Movies hindi = new HindiMovies();
		hindi.artists();

		TeluguMovies telugu = new TeluguMovies();
		telugu.simplicity();

		telugu.heroein("Rakul Preethi", 21);
		

	}

}
