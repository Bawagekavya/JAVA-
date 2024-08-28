package com.xwork.practise.data;

public class Sandal {

    String brand;
    int size;
    double cost;
    String color;

    public Sandal(String brand, int size, double cost, String color) {
        this.brand = brand;
        this.size = size;
        this.cost = cost;
        this.color = color;
    }

    public void show()
    {
        System.out.println("BRAND:"+this.brand);
        System.out.println("SIZE:"+this.size);
        System.out.println("COST:"+this.cost);
        System.out.println("COLOR:"+this.color);

    }
}
