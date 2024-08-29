package com.java.pizza;

public class Pizza {

    public String name = "Gold corn pizza";
    public double cost=200;

    public Pizza()
    {
        System.out.println("created pizza using no-arg constructor...");
    }

    public void display()
    {
        System.out.println("Pizza Name :" + name);
        System.out.println("Pizza Cost :" + cost);

    }
}
