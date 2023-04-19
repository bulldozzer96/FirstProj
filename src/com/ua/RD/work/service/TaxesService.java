package com.ua.RD.work.service;

import com.ua.RD.work.domain.Employee;

import java.util.List;

public interface TaxesService {

    default double calculateTaxes(List<Employee> employees) {
        double totalTaxes = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                totalTaxes += calculateTaxes(employee);
            }
        }

        return totalTaxes;
    }

    double calculateTaxes(Employee employee);
}
