package com.exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ClassNotFoundException {

	public static void main(String[] args) throws FileNotFoundException{
		/*try { 
			// Following file does not exist 
			File file = new File("E://file.txt"); 

			FileReader fr = new FileReader(file);
			System.out.println("DONE");
			
		} catch (FileNotFoundException e) { 
			System.out.println("File does not exist"); 
			System.out.println(e.getMessage());
			
			//e.printStackTrace();
			
		} */
		
										
	} 
	
	public static void show() throws FileNotFoundException {
		// Following file does not exist 
		File file = new File("E://file1.txt"); 

		FileReader fr = new FileReader(file);
		
		System.out.println("DONE");
	}

}
