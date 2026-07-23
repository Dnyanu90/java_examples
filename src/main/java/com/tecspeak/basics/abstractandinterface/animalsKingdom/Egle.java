package com.tecspeak.basics.abstractandinterface.animalsKingdom;

public class Egle extends Animal implements Flyable ,Huntable {
    @Override
    public void fly(){
        System.out.println("Egle can fly");
    }

    @Override
    public void hunt() {
        System.out.println("Eagle hunts small animals");
    }

    @Override
    void sound() {
        System.out.println("Eagle screeches");
    }

    @Override
    void eat() {
        super.eat();
//        System.out.println("egle Eat Meat");
    }
}
