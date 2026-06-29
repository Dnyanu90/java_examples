package com.tecspeak.inheritance;

public class TwoWheeler extends Vehicle{

    private int wheels;

    public TwoWheeler(String brand) {
        super(brand);
    }

    public TwoWheeler(String brand, int wheels) {
        super(brand);
        this.wheels = wheels;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    @Override
    public String toString() {
        return "TwoWheeler{" +
                "wheels=" + wheels + '}';
    }
}
