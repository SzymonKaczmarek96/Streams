package org.example;

public class PersonalAccount extends Account{
    public PersonalAccount(int ID, double balance, String type, Owner owner, AccountStatus name) {
        super(ID, balance, type, owner, name);
    }

    public PersonalAccount(){}

    @Override
    public void connect() {
        System.out.println("Connected to your personal account");
    }

}
