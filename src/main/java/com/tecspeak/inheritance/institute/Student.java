package com.tecspeak.inheritance.institute;

/**
 * Represents an abstract Student.
 * <p>
 * This class serves as the base class for specific student types (e.g., BCAOne, BCATwo)
 * and mandates the implementation of methods for calculating total marks and
 * printing the report card.
 * </p>
 *
 * @author TecSpeak
 */
public abstract class Student {

    /** The student's name. */
    private String name;

    /** The student's roll number. */
    private int rollno;

    /**
     * Constructs a new Student with the specified name and roll number.
     *
     * @param name   the student's name
     * @param rollno the student's roll number
     */
    public Student(String name, int rollno) {
        this.name = name;
        this.rollno = rollno;
    }

    /**
     * Default constructor for Student.
     */
    public Student() {
    }

    /**
     * Returns the student's name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the student's name.
     *
     * @param name the new name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Returns the student's roll number.
     *
     * @return the roll number
     */
    public int getRollno() {
        return rollno;
    }

    /**
     * Sets the student's roll number.
     *
     * @param rollno the new roll number
     */
    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    /**
     * Calculates the total marks obtained by the student.
     *
     * @return the total marks
     */
    public abstract double getTotalMarks();

    /**
     * Prints the student's report card to the console.
     */
    public abstract void printReportCard();
}