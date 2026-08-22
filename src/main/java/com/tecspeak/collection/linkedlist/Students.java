package com.tecspeak.collection.linkedlist;

public class Students {
    int roll;
    String name;
    String dept;

    public Students(int roll, String name, String dept) {
        this.dept = dept;
        this.name = name;
        this.roll = roll;
    }

    @Override
    public String toString() {
        return "Students{" +
                "dept='" + dept + '\'' +
                ", roll=" + roll +
                ", name='" + name + '\'' +
                '}';
    }
}
