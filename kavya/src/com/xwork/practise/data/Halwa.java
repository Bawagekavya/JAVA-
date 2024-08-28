package com.xwork.practise.data;

public class Halwa {

    public String type;
    public double cost;
    public String color;

    public Halwa()
    {
        System.out.println("created halwa using no-arg constructor");
    }

    public void display()
    {
        System.out.println("Halwa Type :" + type);
        System.out.println("Halwa Cost :" + cost);
        System.out.println("Halwa Color :" + color);
    }
}
