package com.xwork.practise.data;

public class Chicken {

    public String type;
    public String color;
    public double price;
    public String richin;
    public String advantage;

    public Chicken()
    {
        System.out.println("created chicken using no-arg constructor");
    }

    public void display()
    {
        System.out.println("Chicken Type:" + type);
        System.out.println("Chicken Color:" + color);
        System.out.println("Chicken Price:" + price);
        System.out.println("Chicken Richin:" + richin);
        System.out.println("Chicken Advantage:" + advantage);

    }
}
