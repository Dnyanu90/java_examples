package com.tecspeak.inheritance.organizations;

/**
 * Represents a Manager in the organization.
 * <p>
 * Extends {@link Employee} and adds a specific bonus amount to their pay.
 * </p>
 *
 * @author TecSpeak
 */
public class Manager extends Employee {

    /** The bonus amount awarded to the manager. */
    private double bouns;

    /**
     * Constructs a Manager with a name, basic pay, and bonus.
     *
     * @param name     the manager's name
     * @param basicPay the manager's basic pay
     * @param bouns    the bonus amount
     */
    public Manager(String name, double basicPay, double bouns) {
        super(name, basicPay);
        this.bouns = bouns;
    }

    /**
     * Calculates the total pay for the manager.
     * <p>
     * Managers receive their basic pay plus their specified bonus.
     * </p>
     *
     * @return the total calculated pay
     */
    @Override
    public double calculatePay() {
        return getBasicPay() + bouns;
    }
}
