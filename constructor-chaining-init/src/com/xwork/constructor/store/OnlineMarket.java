package com.xwork.constructor.store;

public class OnlineMarket {

    public String name;
    public String location;
    public String shops;
    public String type;

    public OnlineMarket()
    {
        System.out.println("created supermarket using no-arg const...");
    }

    public OnlineMarket(String name, String location, String shops, String type)
    {
        System.out.println("created constructor.......");
        this.name = name;
        this.location = location;
        this.shops = shops;
        this.type = type;
    }

    Market market = new Market("MarketBazar", "Kengeri","chocolates","Bazar");

    public void description() {
        if (market != null) {
            System.out.println("======");
            market.display();
        } else {
            System.out.println("SuperMarket is null");
        }
    }
}
