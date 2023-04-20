package com.ua.RD.work.repository;

import com.ua.RD.lesson27.Student;
import com.ua.RD.work.domain.Employee;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class EmployeeFileSerializationRepository implements EmployeeRepository {

    private static final String FILE_NAME = "EMPLOYEES.obj";

    @Override
    public void save(Employee employee) {
        List<Employee> employees = findAll();
        try (OutputStream os = new FileOutputStream(FILE_NAME); ObjectOutputStream oos = new ObjectOutputStream(os)) {
            List<Employee> oldEmployees = new ArrayList<>(employees);
            oldEmployees.add(employee);
            oos.writeObject(oldEmployees);
        } catch (IOException e) {
            System.err.println("Error saving employee to file: " + e.getMessage());
        }
    }

    @Override
    public List<Employee> findAll() {
        if (new File(FILE_NAME).length() == 0) {
            return new ArrayList<>();
        }

        try (InputStream is = new FileInputStream(FILE_NAME); ObjectInputStream ois = new ObjectInputStream(is)) {
            return (List<Employee>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error reading employees from file: " + e.getMessage());

            return new ArrayList<>();
        }
    }

    @Override
    public void delete(Employee employee) {

    }
}