package com.tecspeak.inheritance;

/**
 * Represents a full-time employee with a bonus and tax deductions.
 * <p>
 * Extends {@link Employee} and calculates pay by adding a bonus to the base rate,
 * then deducting a tax percentage.
 * </p>
 *
 * @author TecSpeak
 */
public class FullTimeEmployee extends Employee {

    /** The bonus amount added to the base rate. */
    private double bonus;

    /** The tax deduction percentage (e.g., 0.15 for 15%). */
    private double taxDeductionPercentage;

    /**
     * Constructs a FullTimeEmployee.
     *
     * @param name                   the employee's name
     * @param baserate               the base pay rate
     * @param bonus                  the bonus amount
     * @param taxDeductionPercentage the tax deduction rate as a decimal
     */
    public FullTimeEmployee(String name, double baserate, double bonus, double taxDeductionPercentage) {
        super(name, baserate);
        this.bonus = bonus;
        this.taxDeductionPercentage = taxDeductionPercentage;
    }

    /**
     * Calculates the net pay after adding the bonus and deducting taxes.
     *
     * @return the net calculated pay
     */
    @Override
    public double calculatepay() {
        double grosspay = baserate + bonus;
        double taxamount = grosspay * taxDeductionPercentage;
        return grosspay - taxamount;
    }
}
