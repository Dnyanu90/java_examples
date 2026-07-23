package com.tecspeak.basics.abstractandinterface.animalsKingdom;

abstract class Animal {
    void eat() {
        System.out.println(this.getClass().getSimpleName()+" is Eating");
    }
    abstract void sound();

}
