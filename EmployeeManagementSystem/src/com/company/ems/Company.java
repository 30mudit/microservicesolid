package com.company.ems;

import java.util.ArrayList;
import java.util.List;

public class Company {
    private List<IEmployee> employees = new ArrayList<>();

    public void addEmployee(IEmployee employee) {
        employees.add(employee);
    }

    public void showAllEmployees() {
        for (IEmployee employee : employees) {
            System.out.println(employee.getName() + ", ID: " + employee.getID());
            employee.work();
        }
    }
}
