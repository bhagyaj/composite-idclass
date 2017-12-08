package com.bhagya.controller;


import com.bhagya.model.Department;
import com.bhagya.model.Employee;
import com.bhagya.service.DepartmentService;
import com.bhagya.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @Autowired
    EmployeeService employeeService;
    @Autowired
    DepartmentService departmentService;

    @RequestMapping("/employees/{id}")
    public Employee getEmployee(){
        Employee employee= employeeService.getEmployee("Bhagya","RnD","Kalutara");
        return employee;
    }

    @RequestMapping("/departments/{id}")
    public Department getDepartment(){
        Department department= departmentService.getDepartment("RnD","Kalutara");
        return department;
    }

}
