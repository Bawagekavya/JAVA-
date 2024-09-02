package com.xwork.constructor.store;

import com.sun.org.apache.xml.internal.resolver.helpers.PublicId;

public class Market {

    public String name;
    public String location;
    public String shops;
    public String type;

    public Market()

    {
        System.out.println("created market using no-arg constructor");
    }

    public Market(String name, String location, String shops, String type)
    {
        System.out.println("created market using string, string, string, string const..");
        this.name = name;
        this.location = location;
        this.shops = shops;
        this.type = type;
    }

    public void display()
    {
        System.out.println("Market Name:" + this.name);
        System.out.println("Market Location:" + this.location);
        System.out.println("Market Shops:" + this.shops);
        System.out.println("Market Type:" + this.type);
    }
}
