package com.fabro.SpringbootOneToMany.dto;

import com.fabro.SpringbootOneToMany.model.Employee_Address;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;


@Getter
@Setter
public class EmployeeDTO implements Serializable {

    private int emp_id;
    private String name;

    private List<EmployeeAddressDTO> employeeAddress;

}
