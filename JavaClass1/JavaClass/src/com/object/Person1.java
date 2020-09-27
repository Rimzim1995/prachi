package com.object;

public class Person1 implements Cloneable {
    private String firstName;
    private String lastName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

   @Override
   public Person1 clone() throws CloneNotSupportedException {
       Person1 person =  (Person1) super.clone();
       return person;
   }

   @Override
   public String toString() {
       return "Person1 [firstName=" + firstName + ", lastName=" + lastName + "]";
   }

   public static void main(String[] args) throws CloneNotSupportedException {
       //Person1 person = (Person1) new Object();
       Person1 person = new Person1();
       person.setFirstName("Bhagwati");
       person.setLastName("Patidar");

       System.out.println(person.toString());

       Person1 person2 = person.clone();

       System.out.println(person2.toString());
   }
}
