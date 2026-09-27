package com.tecspeak.collection.studenthelpdesk;

import java.util.LinkedHashSet;

public class StudentHelpDesk {

    private LinkedHashSet<Student> students;

    public StudentHelpDesk() {
        this.students = new LinkedHashSet<>();
    }

    public void addStudent(Student student) {
        students.addLast(student);
        System.out.println("Student added Successfully");
    }

    public void serveStudent() {
        if (students.isEmpty()) {
            System.out.println("No student in List");
        } else {
            Student student = students.removeFirst();
            System.out.println("Served Student: " + student);
        }
    }

    public void removeStudent(int roll) {
        for (Student student : students) {
            if (student.getRoll() == roll) {
                students.remove(student);
                System.out.println("Student Removed");
                return;
            }
        }

        System.out.println("Student Not Found");
    }

    public void searchStudent(int roll) {
        for (Student student : students) {
            if (student.getRoll() == roll) {
                System.out.println("Student Found: " + student);
                return;
            }
        }

        System.out.println("Student Not Found");
    }

    public void displayStudent() {
        if (students.isEmpty()) {
            System.out.println("Empty List");
            return;
        }

        System.out.println("Students in List:");

        for (Student student : students) {
            System.out.println(student);
        }
    }

    public int countStudent() {
        return students.size();
    }

    public int getTotalStudents() {
        return students.size();
    }

    public void displayStudents() {
    }
}