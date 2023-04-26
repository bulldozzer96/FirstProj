package com.ua.RD.work.repository;

import com.ua.RD.work.domain.Employee;

import java.util.List;

public interface EmployeeRepository {
    void save(Employee employee);
    List<Employee> findAll();
    void delete(Employee employee);

}
