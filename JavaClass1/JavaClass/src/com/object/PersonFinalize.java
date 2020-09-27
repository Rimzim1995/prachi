package com.object;

public class PersonFinalize {
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

    // This method is called just before an object is garbage collected
    @Override
    protected void finalize() throws Throwable {
        System.out.println("self final");
        super.finalize();
    }

    @Override
    public String toString() {
        return "Person [firstName=" + firstName + ", lastName=" + lastName + "]";
    }

    public static void main(String[] args) {
    	PersonFinalize person = new PersonFinalize();
        person.setFirstName("Ram");
        person.setLastName("Singh");

        System.out.println("Before Finalize");
        System.out.println(person.getFirstName());
        try {
            person.finalize();
        } catch (Throwable e) {
            
            e.printStackTrace();
        }
     System.out.println("After Finalize");
    }
}
