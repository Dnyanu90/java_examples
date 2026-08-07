package com.tecspeak.inheritance.ticketsystem;

public class StudentTicket extends Ticket{

    StudentTicket(int start, int dest) {
        super(start, dest);
    }
    int claculateFare(){
        int fare=super.calculateFare();
        return fare/2;
    }
    void printFare(){
        System.out.println("Student Fare : "+calculateFare());
    }
}
