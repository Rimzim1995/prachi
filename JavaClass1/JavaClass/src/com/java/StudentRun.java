package com.java;

public class StudentRun {

	public static void main(String[] args) {
		
		
		Student std =  new Student();
		System.out.println("1. Student Name: "+std.getName()+" Roll No: "+std.getRollno()+" Age: "+std.getAge());
		
		std.setName("Abc");
		std.setRollno(1111);
		std.setAge(23);
		
		System.out.println("2. Student Name: "+std.getName()+" Roll No: "+std.getRollno()+" Age: "+std.getAge());

		Student std1 =  new Student("Shyam", 1001, 30);
		
		
		System.out.println("STD1: "+std1); 
		System.out.println("STD1: "+std1.toString()); 
		
	}

}
