package com.xwork.inheritanceTypes.External;

import com.xwork.inheritanceTypes.Internal.Dog;

public class AnimalRunner {

    public static void main(String[] args) {

        Dog dog =new Dog();
        dog.Bark();
        dog.show();
        dog.name="Chico";
        dog.Color="White";
        dog.Details();
    }
}
