package com.tecspeak.basics;

public class CommonInTwoArray {
    public static void commomInTwoArray(int arrOne[], int arrTwo[]){
        int lengthOne=arrOne.length ;
        int lengthTwo=arrTwo.length ;
        if (lengthTwo==lengthOne){

            for (int i=0;i<lengthOne;i++){
                for (int j=lengthTwo-1;j>0;j--){
                    if (arrOne[i]==arrTwo[j]){
                        System.out.println(arrOne[i]);
                        break;
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        int arrOne[]={1,2,3,4,5,1};
        int arrTwo[]={5,6,2,8,9,1};
        commomInTwoArray(arrOne,arrTwo);
    }
}
