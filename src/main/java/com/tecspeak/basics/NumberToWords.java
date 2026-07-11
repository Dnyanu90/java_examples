package com.tecspeak.basics;

import java.util.Scanner;

public class NumberToWords {

        static String[] ones = {
                "", "One", "Two", "Three", "Four", "Five",
                "Six", "Seven", "Eight", "Nine", "Ten",
                "Eleven", "Twelve", "Thirteen", "Fourteen",
                "Fifteen", "Sixteen", "Seventeen",
                "Eighteen", "Nineteen"
        };

        static String[] tens = {
                "", "", "Twenty", "Thirty", "Forty",
                "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"
        };

        static String twoDigit(int n) {
            if (n < 20)
                return ones[n];

            if (n % 10 == 0)
                return tens[n / 10];

            return tens[n / 10] + " " + ones[n % 10];
        }

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.print("Enter Number: ");
            int num = sc.nextInt();

            if (num == 0) {
                System.out.println("Zero");
                return;
            }

            if (num >= 10000000) {
                int crore = num / 10000000;
                System.out.print(twoDigit(crore) + " Crore ");
                num = num % 10000000;
            }

            if (num >= 100000) {
                int lakh = num / 100000;
                System.out.print(twoDigit(lakh) + " Lakh ");
                num = num % 100000;
            }

            if (num >= 1000) {
                int thousand = num / 1000;
                System.out.print(twoDigit(thousand) + " Thousand ");
                num = num % 1000;
            }

            if (num >= 100) {
                int hundred = num / 100;
                System.out.print(ones[hundred] + " Hundred ");
                num = num % 100;
            }

            if (num > 0) {
                System.out.print(twoDigit(num));
            }

            sc.close();
        }
    }
