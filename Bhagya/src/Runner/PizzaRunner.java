package Runner;

import com.java.pizza.*;

public class PizzaRunner {

    public static void main(String[] args) {

        Pizza pizza = new Pizza();
        pizza.display();
        System.out.println("==========");

        Aishwarya aishwarya = new Aishwarya();
        aishwarya.order();
        System.out.println("Local variable");

        Bhagyashree bhagyashree = new Bhagyashree();
        bhagyashree.deliver(pizza);
        System.out.println("parameter");

        Jyoti jyoti = new Jyoti();
        jyoti.eat();
        System.out.println("Non-Static");

        Sukanya.bake();
        System.out.println("static");

        Someshwari someshwari = new Someshwari();
        if(someshwari != null)
        {
            System.out.println(pizza.name);
            System.out.println(pizza.cost);
        }
        else {
            System.out.println("pizza is null");
        }
        System.out.println("Return-type");

    }
}
