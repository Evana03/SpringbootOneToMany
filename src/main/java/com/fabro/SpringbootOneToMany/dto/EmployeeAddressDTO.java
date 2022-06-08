package com.fabro.SpringbootOneToMany.dto;


import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class EmployeeAddressDTO implements Serializable {

    private int addr_id;
    private String street;
    private String city;
    private String state;
    private String country;

}
