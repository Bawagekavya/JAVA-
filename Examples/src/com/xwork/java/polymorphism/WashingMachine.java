//Run-time

package com.xwork.java.polymorphism;

public class WashingMachine {

    private String color;
    private String brand;
    private double capacity;
    private String type;

    public WashingMachine(String color, String brand) {
        this.color = color;
        this.brand = brand;
        System.out.println("WashingMachine color:" + color);
        System.out.println("WashingMachine brand:" + brand);
    }

    public WashingMachine(String type, double capacity) {
        this.type = type;
        this.capacity = capacity;
        System.out.println("WashingMachine type:" + type);
        System.out.println("WashingMachine capacity:" + capacity);
    }

    public void display(String color, String brand)
    {
        System.out.println("WashingMachine color:" + color);
        System.out.println("WashingMachine brand:" + brand);
    }

    public void display(String type, double capacity)
    {
        System.out.println("WashingMachine type:" + type);
        System.out.println("WashingMachine capacity:" + capacity);
    }
}
