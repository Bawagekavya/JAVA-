package com.xwork.practise.store;

import com.xwork.practise.data.SideDish;

public class SideDishRunner {

    public static void main(String[] args) {

        SideDish sidedish = new SideDish("Sprouts",456,"Mung bean");
        sidedish.show();

        SideDish sidedish1 = new SideDish("Roasted carrots",968,"vilmorin mikado");
        sidedish1.show();

        SideDish sidedish2 = new SideDish("Rice",847,"Brown rice");
        sidedish2.show();

        SideDish sidedish3 = new SideDish("Buttery biscuits",280,"Short cakes");
        sidedish3.show();

        SideDish sidedish4 = new SideDish("Dauohinoise Potatoes",375,"King edwars potato");
        sidedish4.show();
    }
}
