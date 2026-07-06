package com.tecspeak.basics;

import java.util.Arrays;

public class RemoveDuplicates {
    public static void removeduplicates(int arr[]){
        int finalArray[] = new int[]{};
        for (int i=0;i<arr.length;i++){

            int num = arr[i];

            boolean isExists = false;

            for (int j = 0; j < finalArray.length; j++) {
                if(num == finalArray[j]){
                    isExists = true;
                    break;
                }
            }

            if (!isExists) {
                finalArray=Arrays.copyOf(finalArray,finalArray.length+1);
                finalArray[finalArray.length-1] = num;
            }
        }
        System.out.println(Arrays.toString(finalArray));
    }
    public static void main(String[] args) {
        RemoveDuplicates.removeduplicates(new int[]{5, 7, 4, 3, 56, 7});
    }
}
