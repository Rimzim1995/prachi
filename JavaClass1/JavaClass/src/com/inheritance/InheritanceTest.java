package com.inheritance;

public class InheritanceTest {

	public static void main(String[] args) {
		
		B b1 = new B();
		System.out.println("B i= "+b1.i);

		C c1 = new C();
		System.out.println("C i= "+c1.i);
		System.out.println("C j= "+c1.j);
		System.out.println("C i= "+c1.i);
		
		System.out.println("Update New Values i & j");
		b1.i=10;
		//c1.i=20;
		c1.j=30;
		
		System.out.println("B i= "+b1.i);
		System.out.println("C i= "+c1.i);
		System.out.println("C j= "+c1.j);
		
		System.out.println("B i= "+b1.i);
		
	}

}
