package com.bhagya.service.Impl;

import com.bhagya.model.Employee;
import com.bhagya.repository.EmployeeRepository;
import com.bhagya.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;

    @Override
    public Employee getEmployee(String bhagya, String rnD, String kalutara) {
        return employeeRepository.findByNameAndDepartmentNameAndDepartmentLocation(bhagya,rnD,kalutara);
    }
}
