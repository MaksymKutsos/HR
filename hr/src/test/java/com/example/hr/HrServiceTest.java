package com.example.hr;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.*;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;


public class HrServiceTest {

    private EmployeeRepository employeeRepository;
    private HrService service;
    private Employee oldestEmployee;


    @Before
    public void configure() throws Exception {
        employeeRepository = mock(EmployeeRepository.class);
        service = new HrService(employeeRepository);
    }


    @Test
    public void determinesYearsTillRetirement() throws Exception {
        createEmployees();
        Employee result = service.getOldestEmployee();
        assertThat(result, is(oldestEmployee));
    }


    private void createEmployees() {
        Employee employee = new Employee("Alex", "Panov", 1989);
        oldestEmployee = new Employee("Max", "Kutsos", 1901);

        when(employeeRepository.getAllEmployees()).thenReturn(Arrays.asList(employee, oldestEmployee));
    }
}
