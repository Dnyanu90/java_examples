package com.tecspeak.inheritance.institute;

public abstract class Student {
    private String name;
    private int rollno;

    public Student(String name, int rollno){
     this.name=name;
     this.rollno=rollno;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    abstract public double getTotalMarks();

    public abstract void printReportCard();
}