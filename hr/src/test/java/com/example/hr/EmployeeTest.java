package com.example.hr;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;


public class EmployeeTest {

    @Test
    public void test() throws Exception {
        Employee employee = new Employee("Alex", "Panov", 1989);
        assertThat(employee.getAge(), is(25));
    }
}
