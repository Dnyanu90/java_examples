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
    SUNDAY("off", 0) ,
    MONDAY("working", 1),
    TUESDAY("working", 2),
    WEDNESDAY("working", 3),
    THURSDAY("working", 4),
    FRIDAY("working", 5),
    SATURDAY("halfday", 6);

    private String weekDayType;
    private int dayInWeek;

    Day(String weekDayType, int dayInWeek) {
        this.weekDayType = weekDayType;
        this.dayInWeek = dayInWeek;
    }

    public String getWeekDayType() {
        return weekDayType;
    }
}



