package com.xworkz.userapp;

import com.xworkz.userapp.card.BOBBankImpl;
import com.xworkz.userapp.card.CanaraBankImpl;
import com.xworkz.userapp.card.Card;

public class Runner {

    public static void main(String[] args) {

        //
        Card c = new CanaraBankBangalore();
        c.insert();

        Card c1 = new BOBBankImpl() {
            @Override
            public void swipe() {

            }

            @Override
            public double withDrawlCharges() {
                return 0;
            }
        };
        c1.insert();
    }
}
