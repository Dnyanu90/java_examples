package com.tecspeak.basics;

import java.util.Arrays;

public class SwapNumber {

    public static int[] swapNumbers(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        int[] swapped = {a, b};
        return swapped;
    }

    public static int[] swapNumbersWithoutTemp(int a, int b) {
        a = a + b;
        b = a - b;
        a = a - b;
        int[] result = {a, b};
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(SwapNumber.swapNumbers(5, 6)));
        System.out.println(Arrays.toString(SwapNumber.swapNumbers(700, 57)));
    }
}
