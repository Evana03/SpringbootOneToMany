package com.fabro.SpringbootOneToMany.model;


import lombok.*;

import javax.persistence.*;
import java.util.Set;


@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "tbl_employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int emp_id;
    private String name;

    @OneToMany(fetch = FetchType.EAGER,mappedBy="employee",cascade = CascadeType.ALL)
    private Set<Employee_Address> employeeAddress;

}
