package com.tecspeak.basics;

enum Signal {
    RED("Stop", 30),
    BLUE("Go", 40),
    YELLOW("Wait", 5);
    private String action;
    private int time;

    public String getAction() {
        return action;
    }

    public int getTime() {
        return time;
    }

    Signal(String action, int time) {
        this.action=action;
       this.time=time;
    }
}

public class EnumSignal {
    public static void main(String[] args) {
        Signal s= Signal.RED;
        System.out.println(s.getAction());
        System.out.println(s.getTime());
        System.out.println();
    }
}
