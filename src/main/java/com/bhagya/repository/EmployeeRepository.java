package com.bhagya.repository;

import com.bhagya.model.Employee;
import com.bhagya.model.EmployeeId;
import org.springframework.data.repository.Repository;

public interface EmployeeRepository  extends Repository<Employee,EmployeeId>{
    Employee findByNameAndDepartmentNameAndDepartmentLocation(String bhagya, String rnD, String location);
}
