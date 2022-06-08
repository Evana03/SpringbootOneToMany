package com.fabro.SpringbootOneToMany.repositary;

import com.fabro.SpringbootOneToMany.model.Employee_Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeAddressRepositary extends JpaRepository<Employee_Address,Integer> {


}
