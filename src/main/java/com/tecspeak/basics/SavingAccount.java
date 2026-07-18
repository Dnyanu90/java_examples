package com.tecspeak.basics;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Objects;

@Data
@AllArgsConstructor
public class SavingAccount {
    private String name;
    private Double balance;
    boolean b;

    public SavingAccount(Double balance, String name) {
        this.balance = balance;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof SavingAccount that)) return false;
        return Objects.equals(name, that.name) && Objects.equals(balance, that.balance);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, balance);
    }

    public static void main(String[] args) {
        SavingAccount savingAccount = new SavingAccount(8000.0, "Avdhut");
        System.out.println(savingAccount);
        System.out.println(savingAccount.getName());
        savingAccount.setBalance(9000.0);
        System.out.println(savingAccount.getBalance());

        System.out.println(savingAccount.b);
    }
}
