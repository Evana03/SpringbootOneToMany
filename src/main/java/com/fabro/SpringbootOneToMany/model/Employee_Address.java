package com.fabro.SpringbootOneToMany.model;

import lombok.*;
import org.aspectj.weaver.GeneratedReferenceTypeDelegate;

import javax.persistence.*;



@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity(name = "tbl_employee_address")
public class Employee_Address {

    @Id
    @GeneratedValue
    private int addr_id;
    private String street;
    private String city;
    private String state;
    private String country;

    @ManyToOne(cascade= CascadeType.ALL)
    @JoinColumn(name = "emp_id")
    private Employee employee;

}
