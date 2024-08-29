package com.xwork.tools.Tools;

public class WashingMachine {

    public String brand="samsung";
    public String type="automatic washing machine";
    public String capacity = "7 kg";

    public WashingMachine()
    {
        System.out.println("created washingmachine using no-arg constructor");
    }

    public void rinse()
    {
        System.out.println("created rinse");
    }

    public void show()
    {
        System.out.println("WashingMachine Brand :" + brand);
        System.out.println("WashingMachine Type :" + type);
        System.out.println("WashingMachine Capacity :" + capacity);
    }

}
