package com.tecspeak.collection;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> student = new LinkedList<>();

        student.add("Vijay");
        student.add("Rahul");
        student.add("Pratik");




        // Add at First
        student.addFirst("Vikas");

        System.out.println(student);


        // Add Last
        student.addLast("Kumar");
        student.removeFirst();

        // Add Element in  Specific position
        student.add(1,"Pranav");


        // Remove First
        student.removeLast();
        System.out.println(student);
    }
}
