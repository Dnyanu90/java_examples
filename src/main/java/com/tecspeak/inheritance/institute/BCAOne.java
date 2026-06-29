package com.tecspeak.inheritance;

public class BCAOne extends Student{

    double subOne;
    double subTwo;
    double subThree;
    double subFour;
    double subFive;
    double subSix;

    public BCAOne(String name, int rollno, double subFive, double subFour, double subOne, double subSix, double subThree, double subTwo) {
        super(name, rollno);
        this.subFive = subFive;
        this.subFour = subFour;
        this.subOne = subOne;
        this.subSix = subSix;
        this.subThree = subThree;
        this.subTwo = subTwo;
    }

    public double getTotalMarks(){
        return (this.subOne + this.subTwo + this.subThree +
                this.subFour + this.subFive + this.subSix);
    }
}
