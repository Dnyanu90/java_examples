package com.tecspeak.inheritance.organizations;

/**
 * Represents an Intern in the organization.
 * <p>
 * Extends {@link Employee} but does not currently implement any additional
 * properties or logic. Interns simply receive their base pay.
 * </p>
 *
 * @author TecSpeak
 */
public class Intern extends Employee {

    /**
     * Constructs an Intern with a name and basic pay.
     *
     * @param name     the intern's name
     * @param basicPay the intern's basic pay (stipend)
     */
    public Intern(String name, double basicPay) {
        super(name, basicPay);
    }

    /**
     * Calculates the pay for an intern.
     * <p>
     * Interns receive only their basic pay with no bonuses.
     * </p>
     *
     * @return the total calculated pay
     */
    @Override
    public double calculatePay() {
        return getBasicPay();
    }
}
