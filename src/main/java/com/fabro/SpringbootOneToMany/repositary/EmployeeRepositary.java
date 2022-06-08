package com.fabro.SpringbootOneToMany.repositary;

import com.fabro.SpringbootOneToMany.dto.SelectedItemDTO;
import com.fabro.SpringbootOneToMany.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepositary extends JpaRepository<Employee,Integer> {
    @Query("SELECT new com.fabro.SpringbootOneToMany.dto.SelectedItemDTO(e.name,a.country) FROM tbl_employee e JOIN e.employeeAddress a")
    List<SelectedItemDTO> getNameandCountry();

}
