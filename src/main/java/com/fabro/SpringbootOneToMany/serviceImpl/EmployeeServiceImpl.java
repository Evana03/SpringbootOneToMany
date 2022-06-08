package com.fabro.SpringbootOneToMany.serviceImpl;

import com.fabro.SpringbootOneToMany.dto.EmployeeDTO;
import com.fabro.SpringbootOneToMany.model.Employee;
import com.fabro.SpringbootOneToMany.model.Employee_Address;
import com.fabro.SpringbootOneToMany.repositary.EmployeeRepositary;
import com.fabro.SpringbootOneToMany.service.EmployeeService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class EmployeeServiceImpl implements EmployeeService {


    @Autowired
    ModelMapper modelMapper;

    @Autowired
    EmployeeRepositary employeeRepositary;

    @Override
    public List<Employee> getAllEmployee() {
        return employeeRepositary.findAll();
    }

    @Override
    public Employee saveEmployee(EmployeeDTO employeeDTO) {
        Employee employee=modelMapper.map(employeeDTO,Employee.class);



       // Employee savedEmployee=employeeRepositary.save(employee);

        saveEmployee();

        return employee;
    }


    public void saveEmployee()
    {
        Employee employee = new Employee();
        employee.setName("Frank");

        Employee_Address employeeAddress1 = new Employee_Address();
        employeeAddress1.setStreet("Street 1");
        employeeAddress1.setCity("City 1");
        employeeAddress1.setCountry("Country 1");
        employeeAddress1.setState("State 1");
        employeeAddress1.setEmployee(employee);


        Employee_Address employeeAddress2 = new Employee_Address();
        employeeAddress2.setStreet("Street 2");
        employeeAddress2.setCity("City 2");
        employeeAddress2.setCountry("Country 2");
        employeeAddress2.setState("State 2");
        employeeAddress2.setEmployee(employee);

        Set<Employee_Address> employeeAddressSet = new HashSet();
        employeeAddressSet.add(employeeAddress1);
        employeeAddressSet.add(employeeAddress2);

        employee.setEmployeeAddress(employeeAddressSet);

        employeeRepositary.save(employee);
        System.out.println("Employee and Employee Address saved successfully!!");
    }


}
