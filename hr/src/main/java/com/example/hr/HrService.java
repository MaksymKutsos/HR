/*
* Copyright 2014, SEARCHTEQ GmbH
*/

package com.example.hr;

public class HrService {

    private EmployeeRepository employeeRepository;


    public HrService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }


    public Employee getOldestEmployee() {
        int maxAge = 0;
        Employee oldest = null;
        for (Employee employee : employeeRepository.getAllEmployees()) {
            if (employee.getAge() > maxAge) {
                oldest = employee;
                maxAge = employee.getAge();
            }
        }
        return oldest;
    }
}
