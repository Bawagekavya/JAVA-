package com.xwork.practise.data;

public class SideDish {

    String name;
    double price;
    String type;

    public SideDish(String name, double price, String type) {
        this.name = name;
        this.price = price;
        this.type = type;
    }

    public void show()
    {
        System.out.println("NAME:"+this.name);
        System.out.println("PRICE:"+this.price);
        System.out.println("TYPE:"+this.type);
    }
}
