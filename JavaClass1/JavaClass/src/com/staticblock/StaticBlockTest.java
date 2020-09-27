package com.staticblock;

public class StaticBlockTest {
	
	public static void main(String[] args) {
		
		Outer.Inner in = new Outer.Inner();
		in.showMsg();
		//System.out.println(Outer.i); 

	}
}
