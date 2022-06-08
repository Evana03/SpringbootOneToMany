package com.fabro.SpringbootOneToMany.serviceImpl;

import com.fabro.SpringbootOneToMany.dto.EmployeeDTO;
import com.fabro.SpringbootOneToMany.dto.SelectedItemDTO;
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
    public List<SelectedItemDTO> getRandom() {
        return employeeRepositary.getNameandCountry();
    }

    @Override
    public Employee saveEmployee(EmployeeDTO employeeDTO) {
        Employee employee=modelMapper.map(employeeDTO,Employee.class);

        Employee savedEmployee=employeeRepositary.save(employee);

        return savedEmployee;
    }

}
