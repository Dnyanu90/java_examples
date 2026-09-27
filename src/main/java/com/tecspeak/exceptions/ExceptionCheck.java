package com.tecspeak.exceptions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionCheck {
    String filePath = "example.txt";
    BufferedReader reader;
    int arr [] = {1, 2, 3, 4};
    public void printFileContent(){

        try {
            reader = new BufferedReader(new FileReader(filePath));
            System.out.println("Reading file contents using read():");
            int characterValue;
            while ((characterValue = reader.read()) != -1) {
                // Cast the int value to a char and print it
                System.out.print((char) characterValue);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (Exception e) {
            throw new IllegalArgumentException("Ghari ja", e);
        }
    }

    public void printArrElement() throws ArrayIndexOutOfBoundsException{

        System.out.println(arr[2]);

    }

    public static void main(String[] args) {
        ExceptionCheck exceptionCheck = new ExceptionCheck();
        exceptionCheck.printFileContent();

        exceptionCheck.printArrElement();
    }
}
