package com.xwork.casting.external;

import com.xwork.casting.internal.Food;
import com.xwork.casting.internal.Hotel;
import com.xwork.casting.internal.Water;

public class Runner {

    public static void main(String[] args) {

        Water water = new Food();

        Hotel hotel1 = new Hotel();
        hotel1.order(water);
    }
}
