package com.fabro.SpringbootOneToMany.service;

import com.fabro.SpringbootOneToMany.dto.EmployeeDTO;
import com.fabro.SpringbootOneToMany.model.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> getAllEmployee();

    Employee saveEmployee(EmployeeDTO employeeDTO);

}
