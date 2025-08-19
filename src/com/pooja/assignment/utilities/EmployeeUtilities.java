package com.pooja.assignment.utilities;
import com.pooja.assignment.employees.Employee;


public class EmployeeUtilities {

    public static void increaseSalary(Employee employee, double percentage) {

        employee.increaseSalary(percentage); 

        employee.displayEmployeeInfo();
    }
    public static void printEmployeeDetails(Employee employee) {
        System.out.println("\nEmployee Details:");
        employee.displayEmployeeInfo();
    }
}