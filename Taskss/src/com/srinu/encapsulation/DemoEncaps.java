package com.srinu.encapsulation;

public class DemoEncaps {
// set all the private memebers  and provide public setters and getters methods
	private int age;
	private String name;
	private String department;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	

	public static void main(String[] args) {
		
		DemoEncaps d=  new DemoEncaps();
		d.setAge(20);
		d.setName("srinivas");
		d.setDepartment("java");
		
		
		
		
		System.out.println("age is ::"+d.getAge()+" name is:: "+d.getName()+  "department::"+d.getDepartment());
	}

}
