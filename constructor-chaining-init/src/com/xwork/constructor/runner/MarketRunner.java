package com.xwork.constructor.runner;

import com.xwork.constructor.store.Market;
import com.xwork.constructor.store.OnlineMarket;
import com.xwork.constructor.store.SuperMarket;

public class MarketRunner {

    public static void main(String[] args) {

        Market market = new Market("DMart", "Rajajinagar","Dryfruit","Bazar");
        market.display();

        SuperMarket superMarket = new SuperMarket();
        superMarket.show();

        OnlineMarket onlineMarket = new OnlineMarket();
        onlineMarket.description();

    }
}
