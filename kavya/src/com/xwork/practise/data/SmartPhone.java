package com.xwork.practise.data;

public class SmartPhone {

    public String use;
    public String brand;
    public double cost;
    public String color;

    public SmartPhone()
    {
        System.out.println("created smartphone using no-arg constructor...");
    }

    public void display()
    {
        System.out.println("Smartphone Name:" + use);
        System.out.println("Smartphone Brand:" + brand);
        System.out.println("Smartphone Cost:" + cost);
        System.out.println("Smartphone Color:" + color);
    }
}
