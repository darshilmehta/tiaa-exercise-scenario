package com.tiaa.w1q1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeManagement {
    public static void main(String[] args) {
        // Create a list of employees
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "Employee 1", 10000));
        employees.add(new Employee(2, "Employee 2", 25000));
        employees.add(new Employee(3, "Employee 3", 15000));
        employees.add(new Employee(4, "Employee 4", 30000));

        // Sort employees based on salary in ascending order
        List<Employee> sortedEmployees = employees.stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary))
                .collect(Collectors.toList());

        System.out.println("Sorted employees by salary:");
        sortedEmployees.forEach(e -> System.out.println(e.getName() + " - Salary: " + e.getSalary()));

        // Filter employees whose salary is greater than 20,000
        List<Employee> highSalaryEmployees = employees.stream()
                .filter(e -> e.getSalary() > 20000)
                .collect(Collectors.toList());

        System.out.println("\nEmployees with salary greater than 20,000:");
        highSalaryEmployees.forEach(e -> System.out.println(e.getName() + " - Salary: " + e.getSalary()));
    }
}