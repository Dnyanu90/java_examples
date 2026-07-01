package com.tecspeak.inheritance.organizations;

public class Employee {
    private String name;
    private int employee_Id;
    private  double salary;

    public Employee(int employee_Id, String name, double salary) {
        this.employee_Id = employee_Id;
        this.name = name;
        this.salary = salary;
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
}
