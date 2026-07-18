package com.tecspeak.basics;

/**
 * Calculates the angle between the hour and minute hands of a clock.
 * <p>
 * The hour hand moves at 0.5 degrees per minute (30 degrees per hour),
 * and the minute hand moves at 6 degrees per minute.
 * Both the smaller and larger angles are computed.
 * </p>
 *
 * @author TecSpeak
 */
public class ClockAngle {

    /**
     * Calculates and prints both the acute and obtuse angles between
     * the hour and minute hands of a clock.
     * <p>
     * Handles 24-hour format by converting to 12-hour format.
     * </p>
     *
     * @param hour   the hour value (supports 24-hour format)
     * @param minute the minute value (0-59)
     */
    public static void getAngle(int hour, int minute) {
        hour = hour % 12;
        double hourAngle = hour * 30 + minute * 0.5;
        double minuteAngle = minute * 6;

        double angle = Math.abs(hourAngle - minuteAngle);
        System.out.println(Math.min(angle, 360 - angle));
        System.out.println(Math.max(angle, 360 - angle));

    }

    /**
     * Main method to demonstrate clock angle calculation.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
//        getAngle(6,00);

        getAngle(21, 00);

    }

}