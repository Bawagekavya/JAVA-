package com.xwork.practise.runner;

import com.xwork.practise.data.Bulb;
import com.xwork.practise.data.Shop;

public class ShopRunner {

    public static void main(String[] args) {

        Shop shop = new Shop();
        shop.Color="Blue";
        shop.display();

        Bulb bulb = new Shop();
        bulb.Color="Green";
        bulb.display();

    }

}
