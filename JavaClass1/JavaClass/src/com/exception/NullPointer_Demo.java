package com.exception;

public class NullPointer_Demo {

	public static void main(String args[]) 
    { 
        try { 
            String a = "a"; //null value 
            System.out.println(a.charAt(0)); 
            System.out.println("done");
        } catch(NullPointerException e) { 
            System.out.println("NullPointerException.."); 
        } catch(RuntimeException ex){
        	System.out.println("Index Out of Bound");
        } finally {
        	 System.out.println("Final Block");
		}
        
        System.out.println("DONE");
    } 
}
