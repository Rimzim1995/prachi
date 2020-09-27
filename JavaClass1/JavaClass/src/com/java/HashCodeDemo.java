package com.java;

public class HashCodeDemo {
	
	
	public static void main(String[] args) {
		 E e1 = new E();
		 E e2 = new E();
		 
		System.out.println(""+e1);
		System.out.println(""+e2.toString());
		
		boolean isEqual = e1.equals(e2);
		
		System.out.println(isEqual);
		
		isEqual = e1.equals(e1);
		System.out.println(isEqual);
		
		
		Integer x = new Integer(50);
		Integer y = new Integer(60);
		int z=10;
		int a=10;
		
		
		System.out.println(x.equals(y));
		
	}
}
