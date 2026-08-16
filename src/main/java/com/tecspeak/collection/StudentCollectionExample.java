package com.tecspeak.collection;

import java.util.ArrayList;
import java.util.List;

public class StudentCollectionExample {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(12, "Eahul"));
        students.add(new Student(13, "Vijay"));
        students.add(new Student(12, "Kumar"));
        for (Student student :students){
            System.out.println(student.getRoll()+" "+ student.getName());
        }


    }
}

class Student {
    private int roll;
    private String name;

    public Student(int roll, String name) {
        this.name = name;
        this.roll = roll;
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
}
