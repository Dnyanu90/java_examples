package com.tecspeak.inheritance;

public class VehicleFactory {
    public static void main(String[] args) {
//        TwoWheeler twoWheeler = new Vehicle("Bajaj");
        Vehicle vehicle = new TwoWheeler("Bajaj", 2);

        if (vehicle != null) {
            System.out.println("Wheels: " + ((TwoWheeler) vehicle).getWheels());
        }
    }
}
