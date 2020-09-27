package com.java;

public class D extends C {
	
	public static void method(C c) {
		
		if (c instanceof D) {
			D d1 = (D)c;
			System.out.println("OK-D");
		}
		
		if (c instanceof C) {
			System.out.println("OK-C");
		}
		
	}
	
	public static void main(String[] args) {
		D d = (D) new C();
		
		//C c1 = new D();
		//method(d);
		
	}
}
