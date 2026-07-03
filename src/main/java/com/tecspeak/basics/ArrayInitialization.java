package com.tecspeak.basics;

import java.util.Arrays;

public class ArrayInitialization {
    public static void main(String[] args){
    //  Static Initialization --> 1D Array
    int arr[]={1,2,3,4,5,6};
    String srt[]={"Dog","Cat","Horse"};


      //   Dynamic Initialization -->1D Array

        int num[]=new int[4];
        String str[]=new String[4];

        num[0]=1;
        num[1]=2;
        num[2]=3;
        num[3]=4;

        num=Arrays.copyOf(num,6);

        num[4]=5;
         num[5]=6;

//        for(int i=0;i<num.length;i++){
//            System.out.println(num[i]);
//        }

        //  Static Initialization --> 2D Array

        int oneD[][]={{1,2,3},{4,5,6},{7,8,9}};
        for (int i=0;i<oneD.length;i++){
            for (int j=0;j<oneD.length;j++){
                System.out.print(oneD[i][j]);
            }

            System.out.println();
        }

        //   Dynamic Initialization -->2D Array
        String names[][]=new String[4][5];
        names=Arrays.copyOf(names,6);
    }
}
