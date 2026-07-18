package com.tecspeak.inheritance.institute;

/**
 * Represents a second-year BCA student (BCA 2) with four subjects.
 * <p>
 * Extends the abstract {@link Student} class and implements grading logic
 * specific to a 4-subject curriculum.
 * </p>
 *
 * @author TecSpeak
 */
public class BCATwo extends Student {

    /** Marks for subject 1. */
    double subOne;
    /** Marks for subject 2. */
    double subTwo;
    /** Marks for subject 3. */
    double subThree;
    /** Marks for subject 4. */
    double subFour;

    /**
     * Constructs a new BCATwo student with all subject marks.
     *
     * @param name     the student's name
     * @param rollno   the student's roll number
     * @param subFour  marks for subject 4
     * @param subOne   marks for subject 1
     * @param subThree marks for subject 3
     * @param subTwo   marks for subject 2
     */
    public BCATwo(String name, int rollno, double subFour,
                  double subOne, double subThree, double subTwo) {
        super(name, rollno);
        this.subFour = subFour;
        this.subOne = subOne;
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
     * Calculates the absolute total of all four subjects.
     *
     * @return the sum of marks
     */
    @Override
    public double getTotalMarks() {
        return (this.subOne + this.subTwo + this.subThree + this.subFour);
    }

    /**
     * Calculates the total percentage based on the maximum possible marks.
     *
     * @param outOfTotalMarks the maximum total marks for all subjects combined
     * @return the calculated percentage
     */
    public double getTotalMarks(double outOfTotalMarks) {
        return ((this.subOne + this.subTwo + this.subThree + this.subFour) / outOfTotalMarks) * 100;
    }

    /**
     * Generates and prints the report card for a BCA 2 student.
     * <p>
     * Displays marks for all four subjects, the total marks (out of 400),
     * and the final percentage.
     * </p>
     */
    @Override
    public void printReportCard() {
        System.out.println("BCA 2");
        System.out.println("Name : " + this.getName());
        System.out.println("Sub 1 : " + this.getSubOne());
        System.out.println("Sub 2 : " + this.getSubTwo());
        System.out.println("Sub 3 : " + this.getSubThree());
        System.out.println("Sub 4 : " + this.getSubFour());
        System.out.println("Total : " + this.getTotalMarks() + "/400");
        System.out.println("Percentage : " + this.getTotalMarks(400));
    }
}
