package com.tecspeak.basics.abstractandinterface.animalsKingdom;

public class AnimalKingdom {
    public static void main(String[] args) {
        Cow cow=new Cow();
        cow.eat();
        cow.sound();
        cow .walk();
        System.out.println("-----------------------------");
        Egle egle=new Egle();
        egle.fly();
        egle.hunt();
        egle.sound();
        egle.eat();
    }
}
