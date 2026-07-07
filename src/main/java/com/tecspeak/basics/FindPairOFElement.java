package com.tecspeak.basics;

public class FindPairOFElement {
    public static void finfPairElement(int arr[],int x){
        for (int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++) {
                if (arr[i] + arr[j]==x){
                    System.out.println(arr[i]+" + "+ arr[j]+" = "+x);


                }
            }
        }
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int x=5;
        finfPairElement(arr,x);
    }
}
