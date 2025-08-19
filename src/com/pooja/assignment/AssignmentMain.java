package com.pooja.assignment;
import com.pooja.assignment.employees.*;
import com.pooja.assignment.utilities.EmployeeUtilities;
public class AssignmentMain {
    public static void main(String[] args) {
        Manager manager = new Manager("Alice", 101, 75000, "HR");
        Developer developer = new Developer("Bob", 102, 65000, "Java");

        System.out.println("Before Salary Increase");
        EmployeeUtilities.printEmployeeDetails(manager);
        EmployeeUtilities.printEmployeeDetails(developer);

        System.out.println("\n After Salary Increase");
        EmployeeUtilities.increaseSalary(manager, 10);
        EmployeeUtilities.increaseSalary(developer, 15);

    }
}
