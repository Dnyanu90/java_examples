package com.tecspeak.basics.abstractAndInterface.animalsKingdom;

abstract class Animal {
    void eat() {
        System.out.println(STR."\{this.getClass().getSimpleName()} is Eating");
    }
    abstract void sound();

}
