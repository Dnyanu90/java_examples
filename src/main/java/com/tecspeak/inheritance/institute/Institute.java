package com.tecspeak.inheritance.institute;

public class Institute {
    public static void main(String[] args) {
        Student student=new BCAOne("Dnyane",1,
                50,60,70,
                48,49,45);
        student.printReportCard();

//        Student studentOne=new BCATwo("Vijay",2,
//                98,45,67,56);
//        studentOne.printReportCard();
//
//        Student studentTwo=new BCAThree("Vijay",2,
//                98,45,67);
//        studentOne.printReportCard();
    }
}
