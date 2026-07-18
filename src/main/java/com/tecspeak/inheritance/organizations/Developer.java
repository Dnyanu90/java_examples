package com.tecspeak.inheritance.organizations;

/**
 * Represents a Software Developer.
 * <p>
 * Extends {@link Employee} and adds programming language specialization.
 * </p>
 *
 * @author TecSpeak
 */
public class Developer extends Employee {

    /** The primary programming language the developer uses. */
    private String language;

    /**
     * Constructs a Developer with name, basic pay, and primary language.
     *
     * @param name     the developer's name
     * @param basicPay the developer's basic pay
     * @param language the primary programming language
     */
    public Developer(String name, double basicPay, String language) {
        super(name, basicPay);
        this.language = language;
    }

    /**
     * Updates the developer's primary programming language.
     *
     * @param language the new programming language
     */
    // FIX: Renamed 'getlanguage' to 'updateLanguage' because it acts as a setter/updater
    public void updateLanguage(String language) {
        this.language = language;
    }

    /**
     * Sets the developer's primary programming language.
     *
     * @param language the new programming language
     */
    public void setLanguage(String language) {
        this.language = language;
    }

    /**
     * Calculates the pay for a developer.
     * <p>
     * Developers receive their base pay plus a fixed bonus of 5000.
     * </p>
     *
     * @return the total calculated pay
     */
    @Override
    public double calculatePay() {
        return getBasicPay() + 5000;
    }
}