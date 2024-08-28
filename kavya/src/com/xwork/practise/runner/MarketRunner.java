package com.xwork.practise.runner;

import com.xwork.practise.data.SmartPhone;
import com.xwork.practise.data.ShowRoom;
import com.xwork.practise.data.Market;

public class MarketRunner {

    public static void main(String[] args) {

        Market market = new Market();
        market.use = "To read";
        market.brand="Redmi";
        market.cost=87650;
        market.color="Black";
        market.display();

        ShowRoom showroom = new Market();
        showroom.use="reels";
        showroom.brand="Nokia";
        showroom.cost=5653;
        showroom.color="white";
        showroom.display();

        SmartPhone smartPhone = new SmartPhone();
        smartPhone.use="to write";
        smartPhone.brand="Real me";
        smartPhone.cost=90786;
        smartPhone.color="Red";
        smartPhone.display();

    }







}
