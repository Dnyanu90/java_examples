package com.tecspeak.inheritance;

/**
 * Represents a generic vehicle with a brand name.
 * <p>
 * Serves as a base class for specific vehicle types.
 * </p>
 *
 * @author TecSpeak
 */
public class Vehicle {

    /** The brand or manufacturer of the vehicle. */
    private String brand;

    /**
     * Constructs a Vehicle with the specified brand.
     *
     * @param brand the vehicle's brand
     */
    public Vehicle(String brand) {
        this.brand = brand;
    }

    /**
     * Returns the vehicle brand.
     *
     * @return the brand name
     */
    public String getBrand() {
        return brand;
    }

    /**
     * Sets the vehicle brand.
     *
     * @param brand the new brand name
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * Returns a string representation of the Vehicle.
     *
     * @return formatted string containing the brand
     */
    @Override
    public String toString() {
        return "Vehicle{" +
                "brand='" + brand + '\'' + // Fixed missing single quote
                '}';
    }
}
