// Non static method
package com.java.pizza;

public class Jyoti {

    Pizza pizza = new Pizza();

    public  void eat()
    {
        if(pizza != null)
        {
            pizza.display();
        }
        else
        {
            System.out.println("pizza is null");
        }
    }
}
