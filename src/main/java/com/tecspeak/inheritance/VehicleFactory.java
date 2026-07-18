package com.tecspeak.inheritance;

/**
 * A factory-like class to demonstrate polymorphic object creation.
 *
 * @author TecSpeak
 */
public class VehicleFactory {

    /**
     * Main method demonstrating downcasting from Vehicle to TwoWheeler.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
//        TwoWheeler twoWheeler = new Vehicle("Bajaj"); // Invalid in Java
        Vehicle vehicle = new TwoWheeler("Bajaj", 2);

        if (vehicle != null) {
            // Downcasting is required to access subclass-specific methods
            System.out.println("Wheels: " + ((TwoWheeler) vehicle).getWheels());
        }
    }
}
