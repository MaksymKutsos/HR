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
        return null;
    }
}
