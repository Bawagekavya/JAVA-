package com.xworkz.tostringequals.Runner;

import com.xworkz.tostringequals.Internal.CreditCard;

public class CreditCardRunner {

    public static void main(String[] args) {

        CreditCard creditCard = new CreditCard("Blue","kavya",8477463,"31 dec 2022");

        CreditCard creditCard1 = new CreditCard("Blue","kavya",8477463,"31 dec 2022");

        boolean same = creditCard.equals(creditCard1);
        System.out.println("result:" + same);

    }
}
