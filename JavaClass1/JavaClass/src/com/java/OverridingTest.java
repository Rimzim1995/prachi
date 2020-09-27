package com.java;

public class OverridingTest {

	public static void main(String[] args) {
		D d = new D();
		
		System.out.println(d.method());
		
		C c = new C();
		System.out.println(c.method()); 
	}

}
