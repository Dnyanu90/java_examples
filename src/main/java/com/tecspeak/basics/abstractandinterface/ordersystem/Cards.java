package com.tecspeak.basics.abstractandinterface.ordersystem;

public class Cards implements Payment{
    @Override
    public void pay(double amount) {
        System.out.println("Cards Payment Of "+amount+" Successful");
    }
}
