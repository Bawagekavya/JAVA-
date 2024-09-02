package com.xwork.constructor.store;

public class SuperMarket extends Market{

    public String name;
    public String location;
    public String shops;
    public String type;

    public SuperMarket()
    {
        System.out.println("created supermarket using no-arg const...");
    }

    public SuperMarket(String name, String location, String shops, String type)
    {
        System.out.println("created constructor.......");
        this.name = name;
        this.location = location;
        this.shops = shops;
        this.type = type;
    }

    Market market = new Market("D-Mart", "vijaynagar","fruit","Bazar");

    public void show()
    {
        if(market != null)
        {
            System.out.println("======");
            market.display();
        }
        else
        {
            System.out.println("SuperMarket is null");
        }
    }
}
