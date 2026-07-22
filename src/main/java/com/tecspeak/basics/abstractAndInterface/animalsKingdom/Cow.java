package com.tecspeak.basics.abstractAndInterface.animalsKingdom;

public class Cow extends Animal implements Walkable{
    void eat(){
        System.out.println("Cow Eat Grass");

    }

    @Override
    void sound() {
        System.out.println("Cow Say Coww");

    }

    @Override
    public void walk() {
        System.out.println("Cow can Walk");

    }
}
