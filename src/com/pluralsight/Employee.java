package com.pluralsight;

public class Employee {
        private int employeeId;   // private data members
        private String name;
        private double hoursWorked;
        private double payRate;

        // Parameterized constructor.
    public Employee(int employeeId, String name, double hoursWorked, double payRate) {
        this.employeeId = employeeId;
        this.name = name;
        this.hoursWorked = hoursWorked;
        this.payRate = payRate;
    }
 // getters and setters
    public int getEmployeeId() { return employeeId; }

    public void setEmployeeId(int employeeId) { this.employeeId = employeeId; }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public double getHoursWorked() { return hoursWorked; }

    public void setHoursWorked(double hoursWorked) { this.hoursWorked = hoursWorked; }

    public double getPayRate() { return payRate; }

    public void setPayRate(double payRate) { this.payRate = payRate; }


    // getGrossPay(), this calculates and returns that employee's gross pay based on their hours worked and pay rate.
    double grossPay() { return hoursWorked * payRate; }
}


