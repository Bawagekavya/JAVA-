// Hierarchical Inheritance : multiple subclass inherits from one superclass

package com.xwork.inheritanceTypes.Internal;

public class Vehicle {

    public String brand;
    public String color;

    public void details()
    {
        System.out.println("created details method");
        System.out.println("Vehicle brand:" + brand);
        System.out.println("Vehicle color :" +color);
    }
}
