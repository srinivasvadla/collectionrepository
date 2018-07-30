package com.srinu.interfaces;

public class ImplementatedClass implements A_interface,B_inteface  {

	public static void main(String[] args) {
		
		
		A_interface ainteface= new ImplementatedClass();
		ainteface.m1();
				
		B_inteface binteface= new ImplementatedClass();
		binteface.m1();
				
	
		System.out.println(i+" ::  i variable from inteface ");
		
	}

	@Override
	public void m1() {
		System.out.println("in impl calss");
		
	}

	
	
}
