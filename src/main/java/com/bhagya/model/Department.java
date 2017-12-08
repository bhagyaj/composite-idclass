package com.bhagya.model;

import java.util.Set;
import javax.persistence.*;

@Entity
@Table(name = "Department")
@IdClass(DepartmentId.class)
public class Department {

    @Id
    @Column(name = "Name")
    private String name;
    @Id
    @Column(name = "Location")
    private String location;
    @Column(name = "EmpNumber")
    private Integer empNumber;
    @OneToMany(fetch = FetchType.EAGER, cascade = {CascadeType.ALL}, mappedBy = "department")
    private Set<Employee> employees;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Integer getEmpNumber() {
        return empNumber;
    }

    public void setEmpNumber(Integer empNumber) {
        this.empNumber = empNumber;
    }

    public Set<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(Set<Employee> employees) {
        this.employees = employees;
    }
}
