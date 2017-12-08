package com.bhagya.repository;

import com.bhagya.model.Department;
import com.bhagya.model.DepartmentId;
import org.springframework.data.repository.Repository;

public interface DepartmentRepository extends Repository<Department, DepartmentId> {
    Department findByNameAndLocation(String name,String location);
}
