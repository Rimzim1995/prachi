package com.staticblock;

public class J {
	static int i;
	int j;
	
	static {
		System.out.println("SIB");
		i=5;
	}
	
	{
		System.out.println("IIB");
	}
	
	J () {
		System.out.println("Constructor");
	}
	
	public static void main(String[] args) {
		System.out.println("hello");
	}
	
	/*static public void show() {
		System.out.println("Static M/d");
		System.out.println(i);
	}
	
	public void nonStaticShow() {
		System.out.println("Non Static M/d");
		System.out.println(j);
	}
	
	public void nonStaticPrint() {
		System.out.println("Non Static M/d");
	}*/
}
