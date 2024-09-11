package com.xwork.java.polymorphismRunner;

import com.xwork.java.polymorphism.Market;
import com.xwork.java.polymorphism.SuperMarket;

public class MarketRunner {

    public static void main(String[] args) {

        Market market = new SuperMarket();
        market.buy();

    }
}
