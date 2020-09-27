package com.exception;
//import com.exception.ClassNotFoundException;

public class ClassNotFoundExceptionDemo {
	
	public static void main(String[] args) {
		
		try {
			//ClassNotFoundException ex
			Class.forName("com.exception.ClassNotFoundException");
			System.out.println("Class Found");
			
		} catch (java.lang.ClassNotFoundException e) {
			
			e.printStackTrace();
		}
	}
}
