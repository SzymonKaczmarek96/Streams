package org.example;

import java.io.IOException;

public abstract class Account implements Transactional {
    public Account() {
        ID = 1;
    }

    private final int ID;

    private double balance;

    private String type;

    private Owner owner;

    private AccountStatus accountStatus;

    public Account(int ID, double balance, String type, Owner owner, AccountStatus accountStatus) {
        this.ID = ID;
        this.balance = balance;
        this.type = type;
        this.owner = owner;
        this.accountStatus = accountStatus;
    }

    @Override
    public double withdraw(double amount) {
        if (amount <= 0 || amount > balance) {
            throw new InvalidAmountException();
        }
        balance -= amount;
        return balance;
    }

    @Override
    public double deposit(double amount) {
        balance += amount;
        return balance;
    }

    public abstract void connect();






    public int getID() {
        return ID;
    }

    public double getBalance() {
        return balance;
    }

    public String getType() {
        return type;
    }

    public Owner getOwner() {
        return owner;
    }

    public AccountStatus getName() {
        return accountStatus;
    }


}
