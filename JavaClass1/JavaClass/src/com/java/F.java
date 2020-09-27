package com.java;

public class F implements Cloneable {
	int a;
	int b;
	
	E e = new E();
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		
		return super.clone();
	}
}
