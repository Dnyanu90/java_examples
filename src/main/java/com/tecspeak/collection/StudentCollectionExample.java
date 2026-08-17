package com.tecspeak.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class StudentCollectionExample {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(12, "Rahul"));
        students.add(new Student(13, "Vijay"));
        students.add(new Student(15, "Kumar"));
//        students.set(2, (Student) students);
        students.remove(0);  // delteting the 0th index of the Arraylist

        System.out.println(students.size());


        for (Student student : students) {
            System.out.println(student.getRoll() + "  " + student.getName());
        }

        int searchID = 13;
        for (Student student : students) {

            if (student.getRoll() == searchID) {
                System.out.println("Student found");
                System.out.println("Roll Number :" + student.getRoll() + "  Name :" + student.getName());
            }
        }

        System.out.println(students.contains(new Student(13, "")) ? "present" : "absent");

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

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Student student)) return false;
        return roll == student.roll;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(roll);
    }
}
