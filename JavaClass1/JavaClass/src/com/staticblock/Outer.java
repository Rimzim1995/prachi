package com.staticblock;

public class Outer {
	int i = 30;
	
	static class Inner {
		public void showMsg() {
			//System.out.println("Value of i: "+i);
			int j = 10;
			Outer outer = new Outer();
			outer.i=10;
			System.out.println(outer.i);
		}
	};
	
	
}
