package com.tecspeak.basics.abstractandinterface.ordersystem;

public class UPIPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("UPI Payment Of " + amount + "Successful");
    }
}
