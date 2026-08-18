package com.tecspeak.collection.studenthelpdesk;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        StudentHelpDesk helpDesk = new StudentHelpDesk();

        while (true) {

            System.out.println("\n===== STUDENT HELP DESK =====");
            System.out.println("1. Add Student");
            System.out.println("2. Serve Student");
            System.out.println("3. Remove Student");
            System.out.println("4. Search Student");
            System.out.println("5. Display Students");
            System.out.println("6. Total Students");
            System.out.println("7. Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter Roll: ");
                    int roll = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Department: ");
                    String department = sc.nextLine();

                    System.out.print("Enter Course: ");
                    String course = sc.nextLine();

                    Student student =
                            new Student(course, department, name, roll);

                    helpDesk.addStudent(student);
                    break;

                case 2:
                    helpDesk.serveStudent();
                    break;

                case 3:
                    System.out.print("Enter Roll to remove: ");
                    int removeRoll = sc.nextInt();

                    helpDesk.removeStudent(removeRoll);
                    break;

                case 4:
                    System.out.print("Enter Roll to search: ");
                    int searchRoll = sc.nextInt();

                    helpDesk.searchStudent(searchRoll);
                    break;

                case 5:
                    helpDesk.displayStudents();
                    break;

                case 6:
                    System.out.println(
                            "Total Students: "
                                    + helpDesk.getTotalStudents());
                    break;

                case 7:
                    System.out.println("Program Ended.");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }
}