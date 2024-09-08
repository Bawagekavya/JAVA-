package com.xwork.casting.internal;

public class Hotel {

    public void order(Water water)
    {
        System.out.println("created order in hotel");
        water.drink();


        if (water instanceof Food)
        {
            System.out.println("water is instance of food");

            Food food = (Food)water;
            food.Eat();
        }
    }
}
