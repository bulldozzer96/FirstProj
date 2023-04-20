package com.ua.RD.work.service;

//import com.ua.RD.lesson14.A;
import com.ua.RD.work.domain.Employee;
import com.ua.RD.work.repository.EmployeeFileSerializationRepository;
import com.ua.RD.work.repository.EmployeeMemoryRepository;
import com.ua.RD.work.repository.EmployeeRepository;

import java.util.ArrayList;
import java.util.List;

public class EmployeeService {

    private static final String TABLE_FORMAT = "|%-5s |%-20s |%-20s |%-10s |%-10s| |%-10s|";
    private static final int LINE_SIZE = 88;
    private final EmployeeRepository employeeRepository;

    public EmployeeService() {
        employeeRepository = new EmployeeFileSerializationRepository();
    }

    public void printEmployees() {
        printHeader();
        for (Employee employee : employeeRepository.findAll()) {
            if (employee != null) {
                String body = String.format(TABLE_FORMAT,
                        employee.getId(),
                        employee.getFirstName(),
                        employee.getLastName(),
                        employee.getAge(),
                        employee.getSalary(),
                        employee.getType());
                System.out.println(body);
            }
        }
    }

    private void printHeader() {
        printDivider();
        System.out.printf((TABLE_FORMAT) + "%n", "id", "firstName", "lastName", "age", "salary", "type");
        printDivider();
    }

    public void printEmployee(Employee employee) {
        printHeader();
        String body = String.format(TABLE_FORMAT,
                employee.getId(),
                employee.getFirstName(),
                employee.getLastName(),
                employee.getAge(),
                employee.getSalary(),
                employee.getType());
        System.out.println(body);
    }

    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    public void save(Employee employee) {
        employeeRepository.save(employee);
    }

    public Employee findEmployeeWithMaxSalary() {
        int maxSalary = 0;
        Employee result = null;
        var employees = employeeRepository.findAll();
        for (Employee employee : employees) {
            if (employee != null) {
                if (employee.getSalary() > maxSalary) {
                    maxSalary = employee.getSalary();
                    result = employee;
                }
            }
        }

        return result;
    }

    public void delete(Employee employee) {
        employeeRepository.delete(employee);
    }

    public List<Employee> findEmployeesByType(String type) {
        List<Employee> filteredEmployees = new ArrayList<>();
        for (Employee employee : employeeRepository.findAll()) {
            if (employee.getType().equals(type)) {
                filteredEmployees.add(employee);
            }
        }

        return filteredEmployees;
    }

    public Employee findEmployeeWithMinSalary() {
        int minSalary = Integer.MAX_VALUE;
        Employee result = null;
        var employees = employeeRepository.findAll();
        for (Employee employee : employees) {
            if (employee != null) {
                if (employee.getSalary() < minSalary) {
                    minSalary = employee.getSalary();
                    result = employee;
                }
            }
        }
        return result;
    }

    private void printDivider() {
        for (int i = 0; i < LINE_SIZE; i++) {
            System.out.print("_");
        }
        System.out.println();
    }
}
