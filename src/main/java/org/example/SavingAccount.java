package org.example;

public class SavingAccount extends Account {

    private double dailyInterest;

    public SavingAccount(int ID, double balance, String type, Owner owner, AccountStatus name, double dailyInterest) {
        super(ID, balance, type, owner, name);
        this.dailyInterest = dailyInterest;
    }

    @Override
    public void connect() {
        System.out.println("Connected to your saving account");

    }
}
