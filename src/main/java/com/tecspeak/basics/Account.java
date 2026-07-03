package com.tecspeak.basics;

public class Account {
    private String userName;
    private double balance;

    public Account(double balance, String userName) {
        this.balance = balance;
        this.userName = userName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String toString() {
        return "Account{" +
                "balance=" + balance +
                ", userName='" + userName + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Account account=new Account(10000,"dnynaeswar");
        System.out.println(account);
    }
}
