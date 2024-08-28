package com.xworkz.account.accountapp;

public class BankAccount {

    public double balance;

    public double fetchbalance(){
        return balance;
    }

   public void credit(double amount) {

       System.out.println("credit method created");
       if (amount > 0)
           balance = balance + amount;
       else
           System.out.println("the closing balance should be grater than 0");

       System.out.println("credit method ended");
   }


       public void debit(double amount){

           System.out.println("debit method created");
           if(amount < balance)
               balance = balance - amount;
           else
               System.out.println("the closing balance is insufficient");

           System.out.println("debit method ended");
      }
}
