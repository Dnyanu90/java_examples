package com.tecspeak.inheritance.institute;

/**
 * Represents a third-year BCA student (BCA 3) with three subjects.
 * <p>
 * Extends the abstract {@link Student} class and implements grading logic
 * specific to a 3-subject curriculum.
 * </p>
 *
 * @author TecSpeak
 */
public class BCAThree extends Student {

    /** Marks for subject 1. */
    double subOne;
    /** Marks for subject 2. */
    double subTwo;
    /** Marks for subject 3. */
    double subThree;

    /**
     * Constructs a new BCAThree student with all subject marks.
     *
     * @param name     the student's name
     * @param rollno   the student's roll number
     * @param subOne   marks for subject 1
     * @param subThree marks for subject 3
     * @param subTwo   marks for subject 2
     */
    public BCAThree(String name, int rollno, double subOne, double subThree, double subTwo) {
        super(name, rollno);
        this.subOne = subOne;
        this.subThree = subThree;
        this.subTwo = subTwo;
    }

    /** @return marks for subject 1 */
    public double getSubOne() {
        return subOne;
    }

    /** @param subOne marks to set for subject 1 */
    public void setSubOne(double subOne) {
        this.subOne = subOne;
    }

    /** @return marks for subject 3 */
    public double getSubThree() {
        return subThree;
    }

    /** @param subThree marks to set for subject 3 */
    public void setSubThree(double subThree) {
        this.subThree = subThree;
    }

    /** @return marks for subject 2 */
    public double getSubTwo() {
        return subTwo;
    }

    /** @param subTwo marks to set for subject 2 */
    public void setSubTwo(double subTwo) {
        this.subTwo = subTwo;
    }

    /**
     * Calculates the absolute total of all three subjects.
     *
     * @return the sum of marks
     */
    @Override
    public double getTotalMarks() {
        return (this.subOne + this.subTwo + this.subThree);
    }

    /**
     * Calculates the total percentage based on the maximum possible marks.
     *
     * @param outOfTotalMarks the maximum total marks for all subjects combined
     * @return the calculated percentage
     */
    public double getTotalMarks(double outOfTotalMarks) {
        return ((this.subOne + this.subTwo + this.subThree) / outOfTotalMarks) * 100;
    }

    /**
     * Retrieves the student's name prefixed with their roll number.
     *
     * @return formatted string "RollNo Name"
     */
    public String getNameWithRollNo() {
        return this.getStudentRollNo() + " " + this.getName();
    }

    /**
     * A private helper method to fetch the inherited roll number.
     *
     * @return the roll number
     */
    private int getStudentRollNo() {
        return this.getRollno();
    }

    /**
     * Generates a string representation of the total marks against the maximum.
     * <p>
     * E.g., "250.0/300.0"
     * </p>
     *
     * @param outOfTotalMarks the maximum total marks
     * @return formatted fraction string
     */
    protected String getStudentMarksAsString(double outOfTotalMarks) {
        return (this.subOne + this.subTwo + this.subThree) + "/" + outOfTotalMarks;
    }

    /**
     * Generates and prints the report card for a BCA 3 student.
     * <p>
     * Displays marks for all three subjects, the total marks (out of 300),
     * and the final percentage.
     * </p>
     */
    @Override
    public void printReportCard() {
        System.out.println("BCA 3");
        System.out.println("Name : " + this.getName());
        System.out.println("Sub 1 : " + this.getSubOne());
        System.out.println("Sub 2 : " + this.getSubTwo());
        System.out.println("Sub 3 : " + this.getSubThree());
        System.out.println("Total : " + this.getTotalMarks() + "/300");
        System.out.println("Percentage : " + this.getTotalMarks(300));
    }

    /**
     * Main method to demonstrate the BCAThree class functionality.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        BCAThree bcaThreeStudent = new BCAThree("ABC", 2, 60, 40, 50);
        System.out.println(bcaThreeStudent.getNameWithRollNo());
    }
}
