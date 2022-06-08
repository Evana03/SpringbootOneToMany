package com.fabro.SpringbootOneToMany.service;

import com.fabro.SpringbootOneToMany.dto.EmployeeDTO;
import com.fabro.SpringbootOneToMany.dto.SelectedItemDTO;
import com.fabro.SpringbootOneToMany.model.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> getAllEmployee();

    List<SelectedItemDTO> getRandom();

    Employee saveEmployee(EmployeeDTO employeeDTO);

}
