package com.tecspeak.oops;

public class Student {
//    int id=101;
//    String name="Rahul";

     static String  clgName="RRC"; // Static variable
    int id; // instatnce variable
    String name;

    void studentInfo(){
        System.out.println("Information Of Student");
        String dept; // local variable


    }

    public static void main(String[] args) {
        Student s1=new Student();
        s1.id=101;
        s1.name="Vijay";
        System.out.println(s1.id);
        System.out.println(s1.name);
        s1.studentInfo();
        System.out.println("Name of collage: "+Student.clgName);
        System.out.println("-----------------------------");

        Student s2=new Student();
        s2.id=103;
        s2.name="Kisan";
        System.out.println(s2.id);
        System.out.println(s2.name);
        s2.studentInfo();
        System.out.println("Name of collage: "+clgName);
        System.out.println("-----------------------------");

        Student s3=new Student();
        s3.id=106;
        s3.name="Parth";
        System.out.println(s3.id);
        System.out.println(s3.name);
        s3.studentInfo();
        System.out.println("Name of collage: "+clgName);
        System.out.println("-----------------------------");

    }
}
