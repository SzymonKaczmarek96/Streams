package org.example;

public class PremiumPersonalAccount extends PersonalAccount implements Transferable{

    private double overdraftLimit;

    public PremiumPersonalAccount(int ID, double balance, String type, Owner owner, AccountStatus name, double overdraftLimit) {
        super(ID, balance, type, owner, name);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void transfer(Account account, double amount) {

    }
}
