package com.ua.RD.work.repository;

import com.ua.RD.work.domain.Employee;
import com.ua.RD.work.domain.EmploymentType;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class EmployeeMemoryRepository implements EmployeeRepository{

    private final List<Employee> employees = new ArrayList<>();

    public EmployeeMemoryRepository() {
        fillListWithRandomEmployees();
    }

    public List<Employee> findAll() {
        return employees;
    }

    @Override
    public void delete(Employee employee) {
        employees.remove(employee);
    }

    public void save(Employee employee) {
        employees.add(employee);
    }

    private void fillListWithRandomEmployees() {
        for (int i = 0; i < 5; i++) {
            Employee employee =  getRandomEmployee();
            employee.setId(i);

            save(employee);
        }

    }

    private Employee getRandomEmployee() {
        Random random = new Random();
        int nameSize = random.nextInt(5, 8);
        String firstName = generateRandomNameString(nameSize);
        String lastName = generateRandomNameString(nameSize);
        int age = random.nextInt(18, 62);
        int salary = random.nextInt(300, 6200);

        int typeNumber = random.nextInt(2);
        String type = typeNumber == 0 ? EmploymentType.PE : EmploymentType.GENERAL;

        return new Employee(0, firstName, lastName, age, salary, type);
    }

    private String generateRandomNameString(int size) {
        String alphaNumericStr = "abcdefghijklmnopqrstuvxyz";
        Random random = new Random();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < random.nextInt(1, 3); j++) {
                result.append(alphaNumericStr.charAt(random.nextInt(0, alphaNumericStr.length())));
            }
        }
        result.setCharAt(0, Character.toUpperCase(result.charAt(0)));

        return result.toString();
    }

}
