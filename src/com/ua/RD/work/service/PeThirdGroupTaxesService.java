package com.ua.RD.work.service;

import com.ua.RD.work.domain.Employee;

public class PeThirdGroupTaxesService implements TaxesService {

    private static final double SINGLE_SOCIAL_CONTRIBUTION_AMOUNT = 1401.50;

    @Override
    public double calculateTaxes(Employee employee) {
        return employee.getSalary() * 0.05 + SINGLE_SOCIAL_CONTRIBUTION_AMOUNT;
    }
}