package com.inheritance;

public class Rectangle extends Shape {
	int x,y;
	public void show() {		
		super.x=10;
		x=20;// this.x=20;
		System.out.println(x + " "+ y);
		System.out.println(super.x + " "+ super.y);
	}
}
