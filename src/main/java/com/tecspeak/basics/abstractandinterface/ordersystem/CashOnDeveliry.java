package com.tecspeak.basics.abstractandinterface.ordersystem;

public class CashOnDeveliry implements Payment {

    @Override
    public void pay(double amount) {
        System.out.println("Cod Payment Of RS: " + amount + " Sucussful ");
    }
}
