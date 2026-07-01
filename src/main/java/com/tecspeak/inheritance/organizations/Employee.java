package com.tecspeak.inheritance.organizations;

public class Employee {
    private String name;
    private int employee_Id;
    private  double salary;
    private double dailyRate;
    private int daysWorked;

    public Employee(int employee_Id, String name, double dailyRate) {
        this.employee_Id = employee_Id;
        this.name = name;
        this.dailyRate=dailyRate;
        this.salary = 0;
    }

    public int getDaysWorked() {
        return daysWorked;
    }

    public void setDaysWorked(int daysWorked) {
        this.daysWorked = daysWorked;
    }

    public double calculateSalary(int days) {
        return dailyRate * days;
    }

    public int getEmployee_Id() {
        return employee_Id;
    }

    public void setEmployee_Id(int employee_Id) {
        this.employee_Id = employee_Id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getDailyRate() {
        return dailyRate;
    }

    public void setDailyRate(double dailyRate) {
        this.dailyRate = dailyRate;
    }
}
