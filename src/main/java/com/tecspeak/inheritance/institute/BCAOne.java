package com.tecspeak.inheritance.institute;

/**
 * Represents a first-year BCA student (BCA 1) with six subjects.
 * <p>
 * Extends the abstract {@link Student} class and implements the specific
 * grading and reporting logic for a 6-subject curriculum.
 * </p>
 *
 * @author TecSpeak
 */
public class BCAOne extends Student {

    /** Marks for subject 1. */
    double subOne;
    /** Marks for subject 2. */
    double subTwo;
    /** Marks for subject 3. */
    double subThree;
    /** Marks for subject 4. */
    double subFour;
    /** Marks for subject 5. */
    double subFive;
    /** Marks for subject 6. */
    double subSix;

    /**
     * Default constructor for BCAOne.
     */
    public BCAOne() {

    }

    /**
     * Constructs a new BCAOne student with all subject marks.
     *
     * @param name     the student's name
     * @param rollno   the student's roll number
     * @param subFive  marks for subject 5
     * @param subFour  marks for subject 4
     * @param subOne   marks for subject 1
     * @param subSix   marks for subject 6
     * @param subThree marks for subject 3
     * @param subTwo   marks for subject 2
     */
    public BCAOne(String name, int rollno, double subFive, double subFour, double subOne, double subSix, double subThree, double subTwo) {
        super(name, rollno);
        this.subFive = subFive;
        this.subFour = subFour;
        this.subOne = subOne;
        this.subSix = subSix;
        this.subThree = subThree;
        this.subTwo = subTwo;
    }

    /** @return marks for subject 4 */
    public double getSubFour() {
        return subFour;
    }

    /** @param subFour marks to set for subject 4 */
    public void setSubFour(double subFour) {
        this.subFour = subFour;
    }

    /** @return marks for subject 1 */
    public double getSubOne() {
        return subOne;
    }

    /** @param subOne marks to set for subject 1 */
    public void setSubOne(double subOne) {
        this.subOne = subOne;
    }

    /** @return marks for subject 6 */
    public double getSubSix() {
        return subSix;
    }

    /** @param subSix marks to set for subject 6 */
    public void setSubSix(double subSix) {
        this.subSix = subSix;
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

    /** @return marks for subject 5 */
    public double getSubFive() {
        return subFive;
    }

    /** @param subFive marks to set for subject 5 */
    public void setSubFive(double subFive) {
        this.subFive = subFive;
    }

    /**
     * Calculates the absolute total of all six subjects.
     *
     * @return the sum of marks
     */
    @Override
    public double getTotalMarks() {
        return (this.subOne + this.subTwo + this.subThree +
                this.subFour + this.subFive + this.subSix);
    }

    /**
     * Calculates the total percentage based on the maximum possible marks.
     *
     * @param outOfTotalMarks the maximum total marks for all subjects combined
     * @return the calculated percentage
     */
    public double getTotalMarks(double outOfTotalMarks) {
        return ((this.subOne + this.subTwo + this.subThree +
                this.subFour + this.subFive + this.subSix) / outOfTotalMarks) * 100;
    }

    /**
     * Retrieves the marks for a specific subject by its index (1-6).
     *
     * @param input the subject number (1 to 6)
     * @return the marks for the specified subject
     * @throws IllegalArgumentException if the input is not between 1 and 6
     */
    public double getSubjectMarks(int input) {
        // Using Java 14+ enhanced switch expression
        return switch (input) {
            case 1 -> getSubOne();
            case 2 -> getSubTwo();
            case 3 -> getSubThree();
            case 4 -> getSubFour();
            case 5 -> getSubFive();
            case 6 -> getSubSix();
            default -> throw new IllegalArgumentException("Unknown input: " + input);
        };
    }

    /**
     * Generates and prints the report card for a BCA 1 student.
     * <p>
     * Displays marks for all six subjects, the total marks (out of 600),
     * and the final percentage.
     * </p>
     */
    @Override
    public void printReportCard() {
        System.out.println("BCA 1");
        System.out.println("Name : " + this.getName());
        for (int i = 1; i < 7; i++) {
            System.out.println("Sub " + i + " : " + this.getSubjectMarks(i));
        }
        System.out.println("Total : " + this.getTotalMarks() + "/600");
        System.out.println("Percentage : " + (Math.round(this.getTotalMarks(600))));
    }
}
