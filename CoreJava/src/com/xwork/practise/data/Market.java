package com.xwork.practise.data;

public class Market {

    String name;
    String location;

    public Market(String name,String location)
    {
        this.name=name;
        this.location=location;
    }

    public void show()
    {
        System.out.println("NAME :" +this.name);
        System.out.println("LOCATION:" +this.location);
    }
}
