package com.sinu.sortings;

public class BubbleSorting {

	public void sort(int[] array) {

		int temp;
		int k = array.length;

		for (int i = 0; i < k; i++) {

			for (int j = 1; j < (k - i); j++) {

				if (array[j - 1] > array[j]) {

					temp = array[j];
					array[j] = array[j - 1];
					array[j - 1] = temp;
					// System.out.println(array[j]);
				}

			}

		}
	}

	public static void main(String[] args) {

		BubbleSorting b = new BubbleSorting();

		int[] array = { 20, 34, 45, 2, 5, 7 };

		System.out.println();

		b.sort(array);

		for (int j = 0; j < array.length; j++) {

			System.out.println(array[j] + " ");

		}
	}

}
