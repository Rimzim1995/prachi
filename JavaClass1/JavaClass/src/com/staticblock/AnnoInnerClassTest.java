package com.staticblock;

public class AnnoInnerClassTest {
	public static void main(String[] args) {
		
		
		Person p = new Person() {
			
			@Override
			void sleep() {
				System.out.println("Sleep");
				
			}
			
			@Override
			void eat() {

				System.out.println("Eat");
			}
		};
		
		p.eat();
		p.sleep();
	}
}
