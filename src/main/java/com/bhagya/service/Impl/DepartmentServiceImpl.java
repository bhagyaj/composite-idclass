package com.bhagya.service.Impl;

import com.bhagya.model.Department;
import com.bhagya.repository.DepartmentRepository;
import com.bhagya.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentServiceImpl implements DepartmentService {
    @Autowired
    DepartmentRepository departmentRepository;
    @Override
    public Department getDepartment(String rnD, String kalutara) {
        return departmentRepository.findByNameAndLocation(rnD,kalutara);
    }
}
