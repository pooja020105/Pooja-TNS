package com.pooja.assignment.employees;

public class Employee {
    private String name;
    private int employeeId;
    private double salary;


    public Employee(String name, int employeeId, double salary) {
        this.name = name;
        this.employeeId = employeeId;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    protected void setName(String name) {
        this.name = name;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    protected void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public double getSalary() {
        return salary;
    }

    protected void setSalary(double salary) {
        this.salary = salary;
    }
    
    public void increaseSalary(double percentage) {
        this.salary = this.salary + (this.salary * percentage / 100);
    }

  
    public void displayEmployeeInfo() {
        System.out.println("Employee ID: " + employeeId + ", Name: " + name + ", Salary: " + salary);
    }
}
