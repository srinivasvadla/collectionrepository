package com.srinu.overloading;

public class Child extends Parent {

	@Override

	public String marry(Girls literature, int age) {
		return " marry the literature girl age is 22 from child";
	}

	// cannot override the final methods
	/*
	 public void time()
	  {
	   System.out.println("child class "); 
	   
	   }
	 */
	
	
	public static void main(String[] args) {

		Child c = new Child();
		c.time();

		Parent p = new Parent();
		p.time();
		Girls g = new Girls("mayavathi", 20);

		System.out.println(g.getGirlname() + " " + g.getGirlage());

	}

}
