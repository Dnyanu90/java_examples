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

    @Override
    public double getTotalMarks() {
        return (this.subOne + this.subTwo + this.subThree +
                this.subFour);
    }
    public double getTotalMarks(double outOfTotalMarks) {
        return ((this.subOne + this.subTwo + this.subThree +
                this.subFour)/outOfTotalMarks)*100;
    }

    /**
     * Method To Generate Report Card
     */
    @Override
    public void printReportCard() {
        System.out.println("BCA 2");
        System.out.println("Name : "+this.getName());
//        for (int i = 1; i < 7; i++) {
//            System.out.println("Sub "+i+" : "+this.getSubOne());
//        }
        System.out.println("Sub 1 : "+this.getSubOne());
        System.out.println("Sub 2 : "+this.getSubTwo());
        System.out.println("Sub 3 : "+this.getSubThree());
        System.out.println("Sub 4 : "+this.getSubFour());
 System.out.println("Total : "+this.getTotalMarks()+"/400");
        System.out.println("Percentage : "+this.getTotalMarks(400));
    }

//    public double getTotalMarks(){
//        return (this.subOne + this.subTwo + this.subThree +
//                this.subFour);
//    }


}
