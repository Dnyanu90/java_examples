package com.tecspeak.inheritance.institute;

public class BCAThree extends Student {

    double subOne;
    double subTwo;
    double subThree;

    public BCAThree(String name, int rollno, double subOne, double subThree, double subTwo) {
        super(name, rollno);
        this.subOne = subOne;
        this.subThree = subThree;
        this.subTwo = subTwo;
    }

    public double getTotalMarks(){
        return (this.subOne + this.subTwo + this.subThree );
    }
}
