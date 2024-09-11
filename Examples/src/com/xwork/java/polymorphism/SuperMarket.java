package com.xwork.java.polymorphism;

public class SuperMarket extends Market{

    public SuperMarket()
    {
        System.out.println("created super market with no-arg constructor");
    }

    @Override
    public void buy()
    {
        System.out.println("running buy in super market");
    }
}
