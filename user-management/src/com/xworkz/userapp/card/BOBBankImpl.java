package com.xworkz.userapp.card;

public abstract  class BOBBankImpl implements Card {
    @Override
    public void insert() {
        System.out.println("BOB bank card is inserted");
    }

      public abstract double withDrawlCharges();
}
