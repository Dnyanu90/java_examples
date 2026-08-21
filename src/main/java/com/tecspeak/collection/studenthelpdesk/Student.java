package com.tecspeak.collection.studenthelpdesk;

import java.util.Objects;

public class Student {
    private  int roll;
    private String name;
    private String department;
    private String course;

    public Student(String course, String department, String name, int roll) {
        this.course = course;
        this.department = department;
        this.name = name;
        this.roll = roll;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    @Override
    public String toString() {
        return "Student{" +
                "course='" + course + '\'' +
                ", roll=" + roll +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Student student)) return false;
        return roll == student.roll && Objects.equals(name, student.name) && Objects.equals(department, student.department) && Objects.equals(course, student.course);
    }

    @Override
    public int hashCode() {
        return Objects.hash(roll, name, department, course);
    }
}
