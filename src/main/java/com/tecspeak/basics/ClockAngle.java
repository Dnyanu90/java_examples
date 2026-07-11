package com.tecspeak.basics;

public class ClockAngle {
    public static void getAngle(int hour, int minute) {
        hour = hour % 12;
        double hourAngle = hour * 30 + minute * 0.5;
        double minuteAngle = minute * 6;

        double angle = Math.abs(hourAngle - minuteAngle);
        System.out.println(Math.min(angle, 360 - angle));
        System.out.println(Math.max(angle, 360 - angle));

    }

    public static void main(String[] args) {
        getAngle(6,00);

    }

}