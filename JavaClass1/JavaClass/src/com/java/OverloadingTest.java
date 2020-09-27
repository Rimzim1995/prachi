package com.java;

public class OverloadingTest {

	public static void main(String[] args) {
		
		B b = new B();
		b.method("Hello", 10);
		System.out.println();
		b.method();
		System.out.println();
		b.method(10.5, 'A');
		
		A a = new B();
		//a.method();
	
	}
}
