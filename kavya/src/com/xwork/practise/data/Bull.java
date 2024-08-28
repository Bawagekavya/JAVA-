package com.xwork.practise.data;

public class Bull {

    public String name;
    public String color;
    public String gender;
    public double cost;

    public Bull()
    {
        System.out.println("created bull using no-arg constructor..");
    }

    public void display()
    {
        System.out.println("Bull name :" + name);
        System.out.println("Bull Color :" + color);
        System.out.println("Bull Gender :" + gender);
        System.out.println("Bull Cost :" + cost);

    }

}
