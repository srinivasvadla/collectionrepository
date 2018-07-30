package com.srinu.strings;

public class Demo {

	private String nam1="srinu";
	private String sn="ravindra";

	public Demo(String name) {

	}

	public Demo(String nam1, String sn) {
		super();
		this.nam1 = nam1;
		this.sn = sn;
	}

	public static void main(String[] args) {

		/*
		 
		  Demo d = new Demo("srinivas");
		 
		  Demo d1 = new Demo("srinivas");
		 */
		
		/*
		 * System.out.println("demo class::" + d.equals(d1));// true
		 * System.out.println(d == d1);
		 */
		String s = "srinu";
		String r = "srinu";
		System.out.println("String scp::" + s.equals(r));
		System.out.println(s == r);
		
		String str3= new String("ravi");
		String str4= new String("ravi");
		
		Demo demo1 = new Demo("ravi");
		Demo demo2 = new Demo("ravi");
		
		System.out.println(demo1.hashCode());
		System.out.println(demo2.hashCode());
		System.out.println("demos ");
		System.out.println(demo1 == demo2);
		System.out.println(demo1.equals(demo2));

		StringBuilder str = new StringBuilder("srinivas");
		StringBuilder str1 = new StringBuilder("srinivas");

		System.out.println("builder::" + str.equals(str1)); // false
		System.out.println(str == str1);

		// true

		String string = new String("srinivas");
		String string1 = new String("srinivas");
		System.out.println(string.equals(string1)); // true

		Demo d = new Demo("srinivas");
		Demo d1 = new Demo("srinivas");
		System.out.println(d.equals(d1));
		System.out.println("demo class::"+d1);// return vaues

	}

	
	//  if we override the toString() the we can able to print the values
	// else we print hashcode
	
	@Override
	public String toString() {
		return "Demo [nam1=" + nam1 + ", sn=" + sn + "]";
	}

	/*
	Override public int hashCode() 
	{
	 final int prime = 31; int result = 1;
	  result = prime * result + ((nam1 == null) ? 0 : nam1.hashCode()); result =
	  prime * result + ((sn == null) ? 0 : sn.hashCode()); 
	  return result;
	   }
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Demo other = (Demo) obj;
		if (nam1 == null) {
			if (other.nam1 != null)
				return false;
		} else if (!nam1.equals(other.nam1))
			return false;
		if (sn == null) {
			if (other.sn != null)
				return false;
		} else if (!sn.equals(other.sn))
			return false;
		return true;
	}

}
