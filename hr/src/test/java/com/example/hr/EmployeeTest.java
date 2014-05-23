package com.example.hr;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;


public class EmployeeTest {

    @Test
    public void create() throws Exception {
        Employee employee = new Employee("Alex", "Panov", 1989);
        assertThat(employee.getAge(), is(25));
    }


    @Test(expected = IllegalArgumentException.class)
    public void notAllowsTooOldEmployees() throws Exception {
        new Employee("Alex", "Panov", 1800);
    }


    @Test(expected = IllegalArgumentException.class)
    public void notAllowsTooYoungEmployees() throws Exception {
        new Employee("Alex", "Panov", 2012);
    }


    @Test(expected = IllegalArgumentException.class)
    public void notAllowsDatesOfBirthInFuture() throws Exception {
        new Employee("Alex", "Panov", 2200);
    }
}
