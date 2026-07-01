package com.tecspeak.inheritance.organizations;

public class Intern extends Employee{
    private int duration;

    public Intern(int employee_Id, String name, double salary, int duration) {
        super(employee_Id, name, salary);
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
    public String getDetails(){
       return getEmployee_Id()+" "+getName()+" "+getSalary()+" "+ duration;
    }
}
