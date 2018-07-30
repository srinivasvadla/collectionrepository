package com.srinu.inheritance;

// sub class properties using the base class properties
public class Sub_Inheritance {
	
	public static void main(String[] args) {
		
		//creating super class object here
		Base_Inheritance b= new Base_Inheritance(){
			
		};
		b.i=10;
		b.j=20;	
		
		int c=b.i+b.j;
		System.out.println(" base class properties ::"+c);
	
		
		 // calling super class method
		b.department();
		
	}

}
