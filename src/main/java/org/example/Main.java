package org.example;

import java.io.IOException;

/**
 * Write bank application where you can withdraw and deposit money for specific User. You can have different types of accounts:
 * personal account, and saving account where you hove daily interest. Bank can also have premium accounts that can withdraw money over limit.
 * I want to have historical records of transactions.
 */
public class Main {

    public static void main(String[] args)  {
/*
bank, User, account, saving account, transaction
 */
        Account savingAccount = new SavingAccount(1, 0, "test", new Owner(), AccountStatus.ACTIVE, 0.1);
        savingAccount.getBalance();
        Math.max(2,2);
        Owner owner = new Owner(Privilege.USER);
        if (owner.getPrivilege() == Privilege.USER){

        }

        Transfer transfer1 = new Transfer(new PersonalAccount(), new PersonalAccount(), 2000);
        Transfer transfer2 = new Transfer(new PersonalAccount(), new PersonalAccount(), 3000);
        System.out.println(Statistics.countMoneyForTransfers(transfer1, transfer2));
        double withdraw = savingAccount.withdraw(-10);

    }
}
