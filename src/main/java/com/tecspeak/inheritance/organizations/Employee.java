package com.tecspeak.inheritance.organizations;

/**
 * Represents an abstract employee in an organization.
 * <p>
 * This is the base class for different roles (e.g., Developer, Manager).
 * It dictates that every employee must have a method to calculate their pay.
 * </p>
 *
 * @author TecSpeak
 */
public abstract class Employee {

    /** The employee's name. */
    private String name;

    /** The employee's base salary or pay rate. */
    private double basicPay;

    /**
     * Constructs an Employee with a name and basic pay.
     *
     * @param name     the employee's name
     * @param basicPay the base salary
     */
    public Employee(String name, double basicPay) {
        this.name = name;
        this.basicPay = basicPay;
    }

    /**
     * Returns the employee's name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the employee's name.
     *
     * @param name the new name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Returns the employee's basic pay.
     *
     * @return the basic pay
     */
    public double getBasicPay() {
        return basicPay;
    }

    /**
     * Sets the employee's basic pay.
     *
     * @param basicPay the new basic pay
     */
    public void setBasicPay(double basicPay) {
        this.basicPay = basicPay;
    }

    /**
     * Calculates the total pay for the employee.
     *
     * @return the calculated pay amount
     */
    public abstract double calculatePay();
}
