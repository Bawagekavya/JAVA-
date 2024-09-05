//Multilevel inheritance : one subclass inherits from another subclass

package com.xwork.inheritanceTypes.Internal;

public class Animal {

    public String name;
    public String Color;

    public void Details()
    {
        System.out.println("created bark method");
        System.out.println("Animal name:" + name);
        System.out.println("Animal color:" + Color);

    }
}
