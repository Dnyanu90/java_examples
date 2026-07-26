package com.tecspeak.basics.stringinjava;

public class StringInJava {

    public static void main(String[] args) {

        String str="Hello";   // Literal
        String str1="Hello";

        System.out.println(str==str1); // true
        String s=new String("Techspeak");  // using new operatior
        String s1=new String("Techspeak");

        System.out.println(s==s1);
        /*                 Golden Rule
             ->only compile time constant go to String Pool  automatically
            ->Run time Creates string go to Heap

         */
//        String strOne="ja"+"va";
//        String strTwo="java";
//        System.out.println(strOne==strTwo);
//
//        String strThree="hello";
//        String strFour=strThree+"World";
//        String strFive="Hello World";
//
//        System.out.println(strFive==strFour);
         String strsix="Hello";
         String strSeven=strsix;
//        System.out.println(strsix==strSeven);

        String strEight="Hello";
        strEight="World";
        System.out.println(strEight);

        String strNine=new String("Hello");
        String strTen="Hello";
        System.out.println(strNine==strTen);




    }
}