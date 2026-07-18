package com.tecspeak.inheritance;

/**
 * Represents a contract employee whose pay is calculated based on hours worked.
 * <p>
 * Extends {@link Employee} and implements the {@code calculatepay()} method.
 * </p>
 *
 * @author TecSpeak
 */
public class ContractEmployee extends Employee {

    /** The number of hours worked by the contract employee. */
    private int hourwork;

    /**
     * Constructs a ContractEmployee with a name, base rate, and hours worked.
     *
     * @param name     the employee's name
     * @param baserate the hourly pay rate
     * @param hourwork the total hours worked
     */
    // FIX: Added 'hourwork' parameter to the constructor to correctly initialize the field
    public ContractEmployee(String name, double baserate, int hourwork) {
        super(name, baserate);
        this.hourwork = hourwork;
    }

    /**
     * Calculates the pay for the contract employee.
     *
     * @return the total pay (base rate × hours worked)
     */
    @Override
    public double calculatepay() {
        return baserate * hourwork;
    }
}
