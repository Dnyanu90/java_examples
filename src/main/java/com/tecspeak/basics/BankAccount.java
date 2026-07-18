package com.tecspeak.basics;

import java.util.Objects;

/**
 * Represents a bank account with account holder name, balance, and account type.
 * <p>
 * Demonstrates OOP concepts including constructor overloading, encapsulation,
 * overriding {@code equals()}, {@code hashCode()}, and {@code toString()}.
 * </p>
 *
 * @author TecSpeak
 */
public class BankAccount {

    /** The name of the account holder. */
    private String name;

    /** The current balance of the account. */
    private double balance;

    /** The type of bank account (e.g., "saving", "current"). */
    private String accountType;

    /**
     * Default constructor that initializes all fields to empty/zero values.
     */
    public BankAccount() {
        this.balance = 0;
        this.name = "";
        this.accountType = "";
    }

    /**
     * Constructs a BankAccount with the specified account type, balance, and name.
     *
     * @param accountType the type of account (e.g., "saving")
     * @param balance     the initial balance
     * @param name        the name of the account holder
     */
    public BankAccount(String accountType, double balance, String name) {
        this.accountType = accountType;
        this.balance = balance;
        this.name = name;
    }

    /**
     * Constructs a BankAccount with a joint name (first + last name).
     *
     * @param accountType the type of account
     * @param balance     the initial balance
     * @param nameOne     the first name of the account holder
     * @param nameTwo     the last name of the account holder
     */
    public BankAccount(String accountType, double balance, String nameOne, String nameTwo) {
        this.accountType = accountType;
        this.balance = balance;
        this.name = nameOne + " " + nameTwo;
    }

    /**
     * Returns the account type.
     *
     * @return the type of account
     */
    public String getAccountType() {
        return accountType;
    }

    /**
     * Sets the account type.
     *
     * @param accountType the account type to set
     */
    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    /**
     * Returns the current balance.
     *
     * @return the account balance
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Sets the account balance.
     *
     * @param balance the new balance to set
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }

    /**
     * Returns the account holder's name.
     *
     * @return the name of the account holder
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the account holder's name.
     *
     * @param name the new name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Returns a string representation of the BankAccount.
     *
     * @return formatted string with account type, name, and balance
     */
    @Override
    public String toString() {
        return "BankAccount{" +
                "accountType='" + accountType + '\'' +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }

    /**
     * Displays the current balance.
     * Prints "Insufficient funds" if the balance is negative or the name is empty.
     */
    public void showBalance() {
        // FIX: Changed == "" to .isEmpty() for proper String comparison
        if (this.balance < 0 || this.name.isEmpty()) {
            System.out.println("Insufficient funds");
        }
        System.out.println(this.balance);
    }

    /**
     * Withdraws the specified amount from the account and prints the new balance.
     *
     * @param amt the amount to withdraw
     */
    public void withdraw(double amt) {
        this.balance = this.balance - amt;
        System.out.println("New Balance" + this.balance);
    }

    /**
     * Checks equality based on name, balance, and account type.
     *
     * @param o the object to compare with
     * @return {@code true} if both accounts have the same name, balance, and type
     */
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        BankAccount account = (BankAccount) o;
        return Double.compare(balance, account.balance) == 0
                && Objects.equals(name, account.name)
                && Objects.equals(accountType, account.accountType);
    }

    /**
     * Returns a hash code based on name, balance, and account type.
     *
     * @return the hash code of this account
     */
    @Override
    public int hashCode() {
        return Objects.hash(name, balance, accountType);
    }

    /**
     * Main method demonstrating BankAccount features including
     * constructor overloading, equals/hashCode, and balance display.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {

        BankAccount account = new BankAccount("saving", 5000, "abc");
        account.showBalance();

        BankAccount accountTwo = new BankAccount();
        accountTwo.showBalance();

        System.out.println(account);

        Integer one = 10;
        Integer two = 10;

        if (one.equals(two)) {
            System.out.println("Equals");
        } else {
            System.out.println("Not Equals");
        }

        BankAccount accountThree = new BankAccount();
        if (accountTwo.equals(accountThree)) {
            System.out.println("Account Equals");
        } else {
            System.out.println("Account Not Equals");
        }

        System.out.println(accountTwo.hashCode());
        System.out.println(accountThree.hashCode());
    }
}
