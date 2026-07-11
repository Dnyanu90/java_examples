package com.tecspeak.basics;

import java.util.Scanner;

public class DieceFaces {

    public static int printDiceFaces(int upSide){
        if (upSide<=6){
          return  7 - upSide;
        }
        return -1;
    }
    public  static int diceFacePrint(int upSide){
        int downSide = -1;
        if (upSide<1 || upSide >7) {
            if (upSide == 1) {
                downSide = 6;

            } else if (upSide == 2) {
                downSide = 5;

            } else if (upSide == 3) {
                downSide = 4;
            } else if (upSide == 4) {
                downSide = 3;
            } else if (upSide == 5) {
                downSide = 2;
            } else if (upSide == 6) {
                downSide = 1;

            }
        }

        return downSide;
    }

    public static void main(String[] args) {
        System.out.println(diceFacePrint(7));
//        System.out.println(printDiceFaces());
    }
}
