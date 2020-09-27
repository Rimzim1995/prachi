package com.abstractdemo;

public class Execution {
	public static void main(String[] args) {
		ElectricGuitar guitar;
		
		guitar = new ElectricGuitar();
		guitar = null;
		guitar.play();
		
		guitar = new ElectricGuitar();
		guitar.play();
		
		StringedInstrument st = new ElectricGuitar();
		st.play();
	}
				
	
}
