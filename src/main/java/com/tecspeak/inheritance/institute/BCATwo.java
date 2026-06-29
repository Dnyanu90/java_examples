package com.tecspeak.inheritance.institute;

public class BCATwo extends Student {

    double subOne;
    double subTwo;
    double subThree;
    double subFour;

    public BCATwo(String name, int rollno, double subFour,
                  double subOne, double subThree, double subTwo) {
        super(name, rollno);
        this.subFour = subFour;
        this.subOne = subOne;
        this.subThree = subThree;
        this.subTwo = subTwo;
    }

    public double getTotalMarks(){
        return (this.subOne + this.subTwo + this.subThree +
                this.subFour);
    }
}
