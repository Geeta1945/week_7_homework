package week7homework;

import java.util.*;

public class Person {
    String firstName, lastName;
    int age;

    public static void main(String[] args) {
        Person person = new Person();

        String name;
        //Person obj = new Person();


        person.setFirstName("");         // firstName is set to empty string
        person.setLastName(""); // lastName is set to empty string
        person.setAge(10);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setFirstName("John"); // firstName is set to John
        person.setAge(18);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setLastName("Smith"); // lastName is set to Smith
        System.out.println("fullName= " + person.getFullName());

    }

    //method 1
    public String getFirstName() {

        return firstName;
    }

    //method 2
    public String getLastName() {

        return lastName;
    }

    //method 3
    public int getAge() {

        return age;
    }

    //method 4
    public void setFirstName(String firstN) {
        firstName = firstN;

    }

    //method 5
    public void setLastName(String lastN) {
        lastName = lastN;

    }

    //method 6
    public void setAge(int A) {

        if (A < 0 || A > 100) {

            age = 0;
        } else {


            age = A;
        }


    }

    //method 7
    public boolean isTeen() {
        boolean b;

        if (age > 12 && age < 20) {
            b = true;

        } else {
            b = false;
        }
        return b;
    }

    //method 8

    public String getFullName() {

        String fullname;

        if (firstName.isEmpty() == true) {


            fullname = "";
            return fullname;


        } else if (firstName.isEmpty() != true) {

            fullname = firstName +" " +lastName;


        } else if (lastName.isEmpty() == true) {

            fullname = "";
            return fullname;

        } else {

            fullname = firstName + " " + lastName;
            return fullname;
        }
        return fullname;

    }

}





