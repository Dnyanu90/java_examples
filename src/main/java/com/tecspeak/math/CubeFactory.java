package com.tecspeak.math;

import com.tecspeak.inheritance.institute.BCAThree;

public class CubeFactory {
    private int num;

    public CubeFactory(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getCube() {
        return this.num * this.num * this.num;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator(8);
        System.out.println(calculator.calculateSquqre());

        BCAThree bcaThree = new BCAThree("Avadhut", 1, 70,85,75);
        System.out.println(bcaThree.getTotalMarks(300));

        BCAThreeStudent bcaThreeStudent = new BCAThreeStudent("XYZ", 1, 70,85,75);
        bcaThreeStudent.sayMarks(300);
    }
}

class BCAThreeStudent extends BCAThree {

    public BCAThreeStudent(String name, int rollno, double subOne, double subThree, double subTwo) {
        super(name, rollno, subOne, subThree, subTwo);
    }

    public String sayMarks(double outOfMarks){
        return this.getStudentMarksAsString(outOfMarks);
    }
}
