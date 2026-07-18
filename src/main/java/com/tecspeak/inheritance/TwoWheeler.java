package com.tecspeak.inheritance;

/**
 * Represents a two-wheeled vehicle.
 * <p>
 * Extends {@link Vehicle} by adding a wheels property.
 * </p>
 *
 * @author TecSpeak
 */
public class TwoWheeler extends Vehicle {

    /** The number of wheels (typically 2). */
    private int wheels;

    /**
     * Constructs a TwoWheeler with the specified brand and defaults to 0 wheels.
     *
     * @param brand the vehicle's brand
     */
    public TwoWheeler(String brand) {
        super(brand);
    }

    /**
     * Constructs a TwoWheeler with the specified brand and number of wheels.
     *
     * @param brand  the vehicle's brand
     * @param wheels the number of wheels
     */
    public TwoWheeler(String brand, int wheels) {
        super(brand);
        this.wheels = wheels;
    }

    /**
     * Returns the number of wheels.
     *
     * @return the wheel count
     */
    public int getWheels() {
        return wheels;
    }

    /**
     * Sets the number of wheels.
     *
     * @param wheels the new wheel count
     */
    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    /**
     * Returns a string representation of the TwoWheeler.
     *
     * @return formatted string containing the wheels property
     */
    @Override
    public String toString() {
        return "TwoWheeler{" +
                "brand='" + getBrand() + '\'' + // Included inherited brand
                ", wheels=" + wheels +
                '}';
    }
}
