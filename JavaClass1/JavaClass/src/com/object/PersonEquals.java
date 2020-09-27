package com.object;

public class PersonEquals implements Cloneable {
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
    public boolean equals(Object obj) {
       if (this == obj)
          return true;
       if (obj == null)
          return false;
       if (getClass() != obj.getClass())
          return false;
       PersonEquals other = (PersonEquals) obj;
       if (firstName.equals(null)) {
          if (other.firstName != null)
             return false;
       } else if (!firstName.equals(other.firstName))
             return false;
       if (lastName == null) {
          if (other.lastName != null)
             return false;
       } else if (!lastName.equals(other.lastName))
             return false;
       return true;
    }
    
    @Override
    public String toString() {
        return "Person [firstName=" + firstName + ", lastName=" + lastName + "]";
    }

    public static void main(String[] args) throws CloneNotSupportedException {
         PersonEquals person = new PersonEquals();
         person.setFirstName("Akshay");
         person.setLastName("Jain");

         PersonEquals person1 = new PersonEquals();
         person1.setFirstName("Akshay");
         person1.setLastName("Kumar");

         
         boolean hasEqual = person.equals(person1);
         System.out.println("Both objects equal :: " + hasEqual);
     }

}
