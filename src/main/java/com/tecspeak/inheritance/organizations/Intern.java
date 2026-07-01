package com.tecspeak.inheritance.organizations;

public class Intern extends Employee{
    private int duration;

    public Intern(int employee_Id, String name, int duration,double dailyRate) {
        super(employee_Id, name,dailyRate);
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
    public String getDetails(){
       return getEmployee_Id()+" "+getName()+" "+ getDuration()+"" + getDailyRate();
    }
}
