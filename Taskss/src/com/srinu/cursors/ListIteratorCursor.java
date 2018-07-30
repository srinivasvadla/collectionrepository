package com.srinu.cursors;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorCursor {

	public static void main(String[] args) {
		ListIteratorCursor c = new ListIteratorCursor();

		List<Integer> l = new ArrayList<Integer>();

		l.add(8);
		l.add(7);
		l.add(2);
		l.add(6);
		l.add(3);
		l.add(2);

		ListIterator<Integer> i1 = l.listIterator();
		while (i1.hasNext()) {
			int i = i1.next();

			if (i % 2 == 0) {
				System.out.println(i);
			} else {
				i1.remove();
			}

		}
		System.out.println("after removing ::" + i1);

	}

}
