// Parameter
package com.java.pizza;

public class Bhagyashree {

    public void deliver(Pizza pizza) {
        if (pizza != null)
        {
            System.out.println(pizza.name);
            System.out.println(pizza.cost);
            pizza.display();
        }
        else
        {
            System.out.println("pizza is null");
        }
    }
}
