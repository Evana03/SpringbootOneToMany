package com.fabro.SpringbootOneToMany.model;


import lombok.*;

import javax.persistence.*;
import java.util.List;
import java.util.Set;


@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity(name = "tbl_employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int emp_id;
    private String name;

    @OneToMany(targetEntity =Employee_Address.class,cascade = CascadeType.ALL)
    @JoinColumn(name = "employee_id",referencedColumnName = "emp_id")
    private List<Employee_Address> employeeAddress;

}
