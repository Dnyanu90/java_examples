package com.tecspeak.collection.linkedlist.playlistmanagement;

import java.util.Scanner;

public class PlaylistManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int choice;

        do {
            System.out.println("\n===== PLAYLIST MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Song");
            System.out.println("2. Delete Song");
            System.out.println("3. Search Song");
            System.out.println("4. Filter Songs");
            System.out.println("5. Move Song");
            System.out.println("6. Display Playlist");
            System.out.println("7. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("Add Song");
                    break;

                case 2:
                    System.out.println("Delete Song");
                    break;

                case 3:
                    System.out.println("Search Song");
                    break;

                case 4:
                    System.out.println("Filter Songs");
                    break;

                case 5:
                    System.out.println("Move Song");
                    break;

                case 6:
                    System.out.println("Display Playlist");
                    break;

                case 7:
                    System.out.println("Exiting Playlist...");
                    break;

                default:
                    System.out.println("Invalid choice! Please enter 1-7.");
            }

        } while (choice != 7);

        sc.close();




    }
}
