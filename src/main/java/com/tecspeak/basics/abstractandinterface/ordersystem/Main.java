package com.tecspeak.basics.abstractandinterface.ordersystem;

public class Main {
    public static void main(String[] args) {
        Payment upi = new UPIPayment();
        Order order1 = new Order(250, upi);
        order1.placeOrder();

        System.out.println("----------------------------");
        Payment cod = new CashOnDeveliry();
        Order order2 = new Order(435, cod);
        order2.placeOrder();

        System.out.println("----------------------------");
        Payment cards = new Cards();
        Order order3 = new Order(294, cards);
        order3.placeOrder();
        System.out.println("----------------------------");

    }
}
