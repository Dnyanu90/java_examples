package com.tecspeak.inheritance;

/**
 * Represents an abstract employee with a name and a base pay rate.
 * <p>
 * Demonstrates inheritance and abstract classes. Subclasses must provide
 * their own implementation of the {@code calculatepay()} method.
 * </p>
 *
 * @author TecSpeak
 */
public abstract class Employee {

    /** The employee's name. */
    protected String name;

    /** The base rate of pay. */
    protected double baserate;

    /**
     * Constructs a new Employee with a name and base rate.
     *
     * @param name     the employee's name
     * @param baserate the employee's base pay rate
     */
    public Employee(String name, double baserate) {
        this.name = name;
        this.baserate = baserate;
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
     * Sets the employee's base rate.
     *
     * @param baserate the new base rate
     */
    public void setBaserate(double baserate) {
        this.baserate = baserate;
    }

    /**
     * Calculates the employee's pay.
     *
     * @return the calculated pay amount
     */
    public abstract double calculatepay();
}
