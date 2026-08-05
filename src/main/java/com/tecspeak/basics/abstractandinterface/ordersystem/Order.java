package com.tecspeak.basics.abstractandinterface.ordersystem;

public class Order {
    private double amount;
    private Payment payment;

    public  Order(double amount, Payment payment) {
        this.amount = amount;
        this.payment = payment;
    }
    public  void placeOrder() {
        System.out.println("Order Palced RS " + amount);
        payment.pay(amount);

    }
}
