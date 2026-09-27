package com.tecspeak.basics;

import java.util.Locale;

enum Signal {
    RED("Stop", 30){
        void behave(){
            System.out.println("Stop Immediately");
        }
    },
    BLUE("Go", 40){
        void behave(){
            System.out.println("Go Fast");
        }
    },
    YELLOW("Wait", 5){
        void behave(){
            System.out.println("Slow Down");
        }

    };
    abstract  void behave();
    private String action;
    private int time;

    void show(){
        System.out.println(action +" For "+time+" seconds");
    }

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
    static  void ProcessSignal(String input){
        try{
            Signal s=Signal.valueOf(input.toUpperCase());
            s.show();
            s.behave();
            System.out.println(s.getAction());
            System.out.println(s.getTime());
        }catch (IllegalArgumentException e){
            System.out.println("Invalid Siganl Name!");
        }catch (Exception e){
            System.out.println("Unknows Errors");
        }finally {
            System.out.println("----Process End----");
        }
    }
    public static void main(String[] args) {

        ProcessSignal("Yellow");

    }
}
