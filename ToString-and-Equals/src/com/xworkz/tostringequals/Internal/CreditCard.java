package com.xworkz.tostringequals.Internal;

import java.util.Objects;

public class CreditCard {

    private String color;
    private String name;
    private long number;
    private String expirydate;

    public CreditCard(String color, String name, long number, String expirydate) {
        this.color = color;
        this.name = name;
        this.number = number;
        this.expirydate = expirydate;
    }

    @Override
    public String toString() {
        return "CreditCard{" +
                "color='" + color + '\'' +
                ", name='" + name + '\'' +
                ", number=" + number +
                ", expirydate='" + expirydate + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null)
        {
            if(obj instanceof CreditCard)
            {
                CreditCard creditCard = (CreditCard)obj;
                System.out.println("converting subclass type to parent type");

                if(this.number==creditCard.number && this.name.equals(creditCard.name) && this.expirydate.equals(creditCard.expirydate))
                {
                    System.out.println("they are equal");
                    return true;
                }
                else
                {
                    System.out.println("they are not equal");
                }
            }
            else {
                System.out.println("obj is null");
            }

        }
        return super.equals(obj);
    }
}
