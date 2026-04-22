package com.pluralsight;

public class Employee {
        private String employeeId;   // private data members
        private String name;
        private double hours;
        private double payRate;

        // Parameterized constructor.
    public Employee(String employeeId, String name, double hours, double payRate) {
        this.employeeId = employeeId;
        this.name = name;
        this.hours = hours;
        this.payRate = payRate;
    }
 // getters and setters
    public String getEmployeeId() { return employeeId; }

    public void setEmployeeId(String employeeId) { this.employeeId = employeeId; }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public double getHours() { return hours; }

    public void setHours(double hours) { this.hours = hours; }

    public double getPayRate() { return payRate; }

    public void setPayRate(double payRate) { this.payRate = payRate; }


    // getGrossPay(), this calculates and returns that employee's gross pay based on their hours worked and pay rate.
    double grossPay() { return hours * payRate; }
}


