package com.xworkz.account;

import com.xworkz.account.accountapp.BankAccount;
import com.xworkz.account.savings.SavingsAccount;


public class AccountRunner {

    public static void main(String[] args) {

        BankAccount savingsAccount = new SavingsAccount();
        savingsAccount.credit(5000.00);
        double closing = savingsAccount.fetchbalance();
        System.out.println("the closing balance :" + closing);

        BankAccount savingsAccount1 = new SavingsAccount();
        savingsAccount1.debit(0.00);
        double closing1 = savingsAccount1.fetchbalance();
        System.out.println("the closing balance :" + closing1);

    }
}
