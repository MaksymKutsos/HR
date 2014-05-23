package com.example.hr;

public class Employee {

    private final String firstName;
    private final String lastName;
    private final int yearOfBirth;


    public Employee(String firstName, String lastName, int yearOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.yearOfBirth = yearOfBirth;
    }


    public String getFirstName() {
        return firstName;
    }


    public String getLastName() {
        return lastName;
    }


    public int getAge() {
        return 2014 - yearOfBirth;
    }


    @Override
    public String toString() {
        return "Employee{" +
               "firstName='" + firstName + '\'' +
               ", lastName='" + lastName + '\'' +
               ", yearOfBirth=" + yearOfBirth +
               '}';
    }
}
