package com.tecspeak.basics;

enum Month {
    JAN("New Year", 31, "Winter"),
    FEB("Valentine", 28, "Winter"),
    MAR("Holi", 31, "Summer"),
    APR("Ram Navami", 30, "Summer"),
    MAY("Maharashtra Day", 31, "Summer"),
    JUN("No festival", 30, "Monsoon"),
    JULY("Guru Pornima", 31, "Monsoon"),
    AUG("Independence Day", 30, "Monsoon"),
    SEP("Ganesh Chaturthi", 31, "Monsoon"),
    OCT("Dussehra", 31, "Winter"),
    NOV("Diwali", 30, "Winter"),
    DEC("Christmas", 31, "Winter");

    private String festival;
    private int days;
    private String season;

    Month(String festival, int days, String season) {
        this.festival = festival;
        this.days = days;
        this.season = season;
    }

    String getFestival() {
        return festival;
    }

    int getDays() {
        return days;
    }

    String getSeason() {
        return season;
    }

    void show() {
        System.out.println(this + " -> " + festival +
                ", Days: " + days + ", Season: " + season);
    }
}


public class MonthsInEnum {
    public static void main(String[] args) {
        Month month=Month.APR;
        month.getDays();
        month.getFestival();
        month.show();
    }

}
