package com.tecspeak.basics;

/**
 * Represents a simple user account with a username and balance.
 * <p>
 * Demonstrates basic OOP concepts: encapsulation with private fields,
 * constructor initialization, getters/setters, and overriding {@code toString()}.
 * </p>
 *
 * @author TecSpeak
 */
public class Account {

    /** The name of the account holder. */
    private String userName;

    /** The current balance in the account. */
    private double balance;

    /**
     * Constructs a new Account with the specified balance and username.
     *
     * @param balance  the initial balance of the account
     * @param userName the name of the account holder
     */
    public Account(double balance, String userName) {
        this.balance = balance;
        this.userName = userName;
    }

    /**
     * Returns the current balance of the account.
     *
     * @return the account balance
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Sets the balance of the account.
     *
     * @param balance the new balance to set
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }

    /**
     * Returns the username of the account holder.
     *
     * @return the account holder's name
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Sets the username of the account holder.
     *
     * @param userName the new username to set
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * Returns a string representation of the Account.
     *
     * @return a formatted string containing balance and username
     */
    @Override
    public String toString() {
        return "Account{" +
                "balance=" + balance +
                ", userName='" + userName + '\'' +
                '}';
    }

    /**
     * Main method to demonstrate Account creation and display.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        Account account = new Account(10000, "dnynaeswar");
        System.out.println(account);
    }
}
