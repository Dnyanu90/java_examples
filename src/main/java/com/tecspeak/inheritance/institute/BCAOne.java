package com.tecspeak.inheritance.institute;

public class BCAOne extends Student {

    double subOne;
    double subTwo;
    double subThree;
    double subFour;
    double subFive;
    double subSix;

    public BCAOne() {

    }

    public BCAOne(String name, int rollno, double subFive, double subFour, double subOne, double subSix, double subThree, double subTwo) {
        super(name, rollno);
        this.subFive = subFive;
        this.subFour = subFour;
        this.subOne = subOne;
        this.subSix = subSix;
        this.subThree = subThree;
        this.subTwo = subTwo;
    }

    public double getSubFour() {
        return subFour;
    }

    public void setSubFour(double subFour) {
        this.subFour = subFour;
    }

    public double getSubOne() {
        return subOne;
    }

    public void setSubOne(double subOne) {
        this.subOne = subOne;
    }

    public double getSubSix() {
        return subSix;
    }

    public void setSubSix(double subSix) {
        this.subSix = subSix;
    }

    public double getSubThree() {
        return subThree;
    }

    public void setSubThree(double subThree) {
        this.subThree = subThree;
    }

    public double getSubTwo() {
        return subTwo;
    }

    public void setSubTwo(double subTwo) {
        this.subTwo = subTwo;
    }

    public double getSubFive() {
        return subFive;
    }

    public void setSubFive(double subFive) {
        this.subFive = subFive;
    }
//    public double getTotalMarks(){
//        return (this.subOne + this.subTwo + this.subThree +
//                this.subFour + this.subFive + this.subSix);
//    }

    @Override
    public double getTotalMarks() {
        return (this.subOne + this.subTwo + this.subThree +
                this.subFour + this.subFive + this.subSix);
    }


    public double getTotalMarks(double outOfTotalMarks) {
        return ((this.subOne + this.subTwo + this.subThree +
                this.subFour + this.subFive + this.subSix)/outOfTotalMarks)*100;
    }

    public double getSubjectMarks(int input) {
        // Using Java 14+ enhanced switch expression
        return switch (input) {
            case 1   -> getSubOne();
            case 2   -> getSubTwo();
            case 3 -> getSubThree();
            case 4  -> getSubFour();
            case 5  -> getSubFive();
            case 6   -> getSubSix();
            default         -> throw new IllegalArgumentException("Unknown input: " + input);
        };
    }

    /**
     * Method To Generate Report Card
     */
    @Override
    public void printReportCard() {
        System.out.println("BCA 1");
        System.out.println("Name : "+this.getName());
        for (int i = 1; i < 7; i++) {
            System.out.println("Sub "+i+" : "+this.getSubjectMarks(i));
        }
        System.out.println("Total : "+this.getTotalMarks()+"/600");
        System.out.println("Percentage : "+(Math.round(this.getTotalMarks(600))));
    }
}
