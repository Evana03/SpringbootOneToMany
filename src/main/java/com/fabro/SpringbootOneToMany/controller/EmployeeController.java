package com.fabro.SpringbootOneToMany.controller;

import com.fabro.SpringbootOneToMany.dto.EmployeeDTO;
import com.fabro.SpringbootOneToMany.dto.SelectedItemDTO;
import com.fabro.SpringbootOneToMany.model.Employee;
import com.fabro.SpringbootOneToMany.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {

     @Autowired
     EmployeeService employeeService;

     @GetMapping(value = "/getAll")
    public ResponseEntity<List<Employee>> getAllEmployees(){
         List<Employee> list=employeeService.getAllEmployee();
         return new ResponseEntity<>(list, HttpStatus.OK);
    }


    @GetMapping(value = "/getrandom")
    public ResponseEntity<List<SelectedItemDTO>> getrandom(){
        List<SelectedItemDTO> list=employeeService.getRandom();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }


    @PostMapping(value = "/saveEmployee")
    public ResponseEntity<Employee> saveEmployee(@RequestBody EmployeeDTO employeeDTO){
        Employee employee=employeeService.saveEmployee(employeeDTO);
        return new ResponseEntity<>(employee, HttpStatus.OK);
    }



}
