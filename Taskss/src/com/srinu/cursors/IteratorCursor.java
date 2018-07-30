package com.srinu.cursors;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorCursor {

	List<String> l = new ArrayList<String>();

	public void iterateTheElements() {

		l.add("srinivas");
		l.add("panchal");
		l.add("akanksh");
		l.add("prachanth");
		l.add("rajsheker");
		l.add("yashwamth");
		
		

		// universal cursor has two methods
		Iterator<String> it = l.iterator();

		while (it.hasNext()) {
			String str = it.next();

			System.out.println(str);
		}

	}

	public static void main(String[] args) {

		IteratorCursor i = new IteratorCursor();
		i.iterateTheElements();
	}

}
