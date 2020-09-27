package com.java;

public class EncapsTest {

	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.setSsn(1112);
		emp.setEmpName("John");
		
		System.out.println("SSN: "+emp.getSsn()+" Emp Name: "+emp.getEmpName());
	
	

	}

}
