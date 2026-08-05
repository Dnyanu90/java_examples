package com.tecspeak.basics;

public class JavaEnums {
    public static void main(String[] args) {
        Day today=Day.SUNDAY;
       for (Day d:today.values()){
           System.out.println(d.getWeekDayType());
       }
    }
}

enum Day{
    SUNDAY("Holiday") ,
    MONDAY("working"),
    TUESDAY("working"),
    WEDNESDAY("working"),
    THURSDAY("working"),
    FRIDAY("working"),
    SATURDAY("Holiday");

    private String weekDayType;

    Day(String weekDayType) {
        this.weekDayType = weekDayType;
    }

    public String getWeekDayType() {
        return weekDayType;
    }
}



