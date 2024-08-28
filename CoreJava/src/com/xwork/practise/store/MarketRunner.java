package com.xwork.practise.store;

import com.xwork.practise.data.Market;

public class MarketRunner {

    public static void main(String[] args) {

        Market market = new Market("Bigbazar", "Gulbarga");
        market.show();

        Market market1 = new Market("superbazar", "bangalore");
        market1.show();

        Market market2 = new Market("mayabazar", "bidar");
        market2.show();

        Market market3 = new Market("Dmart", "Bhalki");
        market3.show();

        Market market4 = new Market("fishmarket", "yadgir");
        market4.show();

    }
}
