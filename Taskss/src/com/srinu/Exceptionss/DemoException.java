package com.srinu.Exceptionss;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

// fianal  is applicable for classes
final class DemoException {

	public void test() throws IOException {

		FileInputStream f = new FileInputStream("e:\\test.txt");

		File file = new File("e:\\test.txt");
		Reader reader = new FileReader(file);
		BufferedReader br = new BufferedReader(reader);
		int i;
		while ((i=br.read()) !=-1) {
			System.out.println((char)i);
		}
		
		f.close();

	}

	public void m1() throws IOException {

		test();

	}

	public static void main(String[] args) throws IOException {

		System.out.println("in main method");

		DemoException d = new DemoException();
		// d.test();

		d.m1();

	}

}
