package org.example;

public class Transfer {
    private Account from;
    private Account to;
    private double amount;

    public Transfer(Account from, Account to, double amount) {
        this.from = from;
        this.to = to;
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }
}
