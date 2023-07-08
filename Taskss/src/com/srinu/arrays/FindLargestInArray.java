package com.srinu.arrays;

// To fing the largest  number
public class FindLargestInArray {

	public int large(int[] arr) {

		
		System.out.println("Testing for the git account");
		int max = arr[0];

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] > max) {

				max = arr[i];
			}

		}
		return max;
	}

	public static void main(String[] args) {

		FindLargestInArray f = new FindLargestInArray();
		int[] arr = { 2, 5, 7, 3, 8, 4, 7 };
		System.out.println(f.large(arr));

	}

}
