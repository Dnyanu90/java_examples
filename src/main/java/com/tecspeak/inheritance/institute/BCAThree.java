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

    public double getSubOne() {
        return subOne;
    }

    public void setSubOne(double subOne) {
        this.subOne = subOne;
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

    public double getTotalMarks(){
        return (this.subOne + this.subTwo + this.subThree );
    }
    public double getTotalMarks(double outOfTotalMarks) {
        return ((this.subOne + this.subTwo + this.subThree)/outOfTotalMarks)*100;
    }
    /**
     * Method To Generate Report Card
     */
    @Override
    public void printReportCard() {
        System.out.println("BCA 3");
        System.out.println("Name : "+this.getName());
//        for (int i = 1; i < 7; i++) {
//            System.out.println("Sub "+i+" : "+this.getSubOne());
//        }
        System.out.println("Sub 1 : "+this.getSubOne());
        System.out.println("Sub 2 : "+this.getSubTwo());
        System.out.println("Sub 3 : "+this.getSubThree());
        System.out.println("Total : "+this.getTotalMarks()+"/300");
        System.out.println("Percentage : "+this.getTotalMarks(300));
    }

}
