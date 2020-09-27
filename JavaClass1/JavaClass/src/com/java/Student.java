package com.java;

public class Student {

	public String name;
	public float rollno;
	public double age;
	
	public Student() {
		this.name = "Ram";
		this.rollno = 1000;
		this.age = 10;
	}
	
	public Student(String aName, float aRollNo, double aAge) {
		this.name = aName;
		this.rollno = aRollNo;
		this.age = aAge;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String aName) {
		this.name = aName;
	}
	public float getRollno() {
		return rollno;
	}
	public void setRollno(float rollno) {
		this.rollno = rollno;
	}
	public double getAge() {
		return age;
	}
	public void setAge(double age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Student Name: "+name+" Roll No: "+rollno+" Age: "+age;
	}
}
