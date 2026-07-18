package com.tecspeak.basics;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Objects;

/**
 * Represents a Saving Account, demonstrating the use of Lombok annotations.
 * <p>
 * Uses {@code @Data} for auto-generating getters, setters, equals, hashCode, and toString.
 * Uses {@code @AllArgsConstructor} for generating a constructor with all fields.
 * </p>
 *
 * @author TecSpeak
 */
@Data
@AllArgsConstructor
public class SavingAccount {

    /** The name of the account holder. */
    private String name;

    /** The current balance in the account. */
    private Double balance;

    /** A boolean flag (purpose unspecified). */
    boolean b;

    /**
     * Custom constructor that initializes balance and name, leaving boolean flag default.
     *
     * @param balance the initial balance
     * @param name    the name of the account holder
     */
    public SavingAccount(Double balance, String name) {
        this.balance = balance;
        this.name = name;
    }

    /**
     * Custom equals implementation (overriding Lombok's generation).
     *
     * @param o the object to compare with
     * @return {@code true} if name and balance are equal
     */
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof SavingAccount that)) return false;
        return Objects.equals(name, that.name) && Objects.equals(balance, that.balance);
    }

    /**
     * Custom hashCode implementation (overriding Lombok's generation).
     *
     * @return the hash code based on name and balance
     */
    @Override
    public int hashCode() {
        return Objects.hash(name, balance);
    }

    /**
     * Main method to demonstrate the usage of Lombok-generated methods.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        SavingAccount savingAccount = new SavingAccount(8000.0, "Avdhut");
        System.out.println(savingAccount);
        System.out.println(savingAccount.getName());
        savingAccount.setBalance(9000.0);
        System.out.println(savingAccount.getBalance());

        System.out.println(savingAccount.isB()); // Lombok generates isB() instead of boolean b directly
    }
}
