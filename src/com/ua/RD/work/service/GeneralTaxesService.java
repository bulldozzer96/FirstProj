package com.ua.RD.work.service;

import com.ua.RD.work.domain.Employee;

public class GeneralTaxesService implements TaxesService {

    @Override
    public double calculateTaxes(Employee employee) {
        return employee.getSalary() * 0.195;
    }
}