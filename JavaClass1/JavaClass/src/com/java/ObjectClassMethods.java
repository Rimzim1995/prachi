package com.java;

public class ObjectClassMethods {

	public static void main(String[] args) {
		
		F f1 = new F();
		f1.a = 5;
		f1.b = 6;
		f1.e.x = 10;
		f1.e.y = 20;
		
		try {
			F f2 = (F) f1.clone();
			//F f2 = new F();
			 // Creating a copy of object f1 and passing it to f2 
			
			System.out.println("a: "+f2.a + " b: " + f2.b + " x: " + f2.e.x + " y: " + f2.e.y); 
			
			f2.a = 100;
			
			// Change in primitive type of f2 will not be reflected in f1 field 
			f2.e.x = 400;
			
			// Change in object type field will be reflected in both f2 and f1(shallow copy) 
			
			System.out.println("a: "+f1.a + " b: " + f1.b + " x: " + f1.e.x + " y: " + f1.e.y); 
		
			
			System.out.println("a: "+f2.a + " b: " + f2.b + " x: " + f2.e.x + " y: " + f2.e.y); 
 
			
		} catch (CloneNotSupportedException e) {
			
			e.printStackTrace();
		}
		
		
	
	}
}
