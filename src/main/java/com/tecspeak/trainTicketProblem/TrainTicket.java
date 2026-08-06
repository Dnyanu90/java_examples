package com.tecspeak.trainTicketProblem;

import java.util.Scanner;

public class TrainTicket {


        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            String stations[] = {
                    "Miraj","Sangli","Madhavnagar","Takari","Bhavani Nagar",
                    "Kirloskarwadi","Shirravde","Karad","Shenoli","Walwa",
                    "Nandre","Lonand","Nira","Jejuri","Saswad Road",
                    "Phursungi","Hadapsar","Pune"
            };

            int start = sc.nextInt();
            int dest = sc.nextInt();

            int distance = Math.abs(start - dest);
            int fare;

            if ((start == 1 && dest == 18) || (start == 18 && dest == 1)) {
                fare = 200;
            }
            else if (distance <= 4) {
                fare = distance * 20;
            }
            else {
                fare = distance * 15;
            }

            // Print station names + fare
            System.out.println("From: " + stations[start - 1]);
            System.out.println("To: " + stations[dest - 1]);
            System.out.println("Fare: ₹" + fare);
        }
    }

