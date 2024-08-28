package com.xwork.practise.runner;

import com.xwork.practise.data.Chicken;
import com.xwork.practise.data.Hotel;
import com.xwork.practise.data.Hen;
import com.xwork.practise.data.Store;
import com.xwork.practise.data.Food;
import com.xwork.practise.data.Meat;

public class MeatRunner {

    public static void main(String[] args) {

        Meat meat = new Meat();
        meat.type="chicken noodle soup";
        meat.color="Yellow";
        meat.price=987;
        meat.richin="vitamin b12";
        meat.advantage="Promoting heart health ";
        meat.display();

        Food food = new Meat();
        food.type="chicken biryani";
        food.color="white";
        food.price=789;
        food.richin="zinc";
        food.advantage="strenghtening bones";
        food.display();

        Store store = new Food();
        store.type="chikken curry";
        store.color="Red";
        store.price=876;
        store.richin="tryptophan";
        store.advantage="Building muscule";
        store.display();


        Hen hen = new Store();
        hen.type="chicken pasta bake";
        hen.color="Reddish ";
        hen.price=457;
        hen.richin="iron";
        hen.advantage="Aiding in weight loss";
        hen.display();


        Hotel hotel = new Hen();
        hotel.type="chinease chicken curry";
        hotel.color="yellow";
        hotel.price=568;
        hotel.richin="copper";
        hotel.advantage="Brain function";
        hotel.display();


        Chicken chicken = new Hotel();
        chicken.type="chicken chasseur";
        chicken.color="Reddish ";
        chicken.price=987;
        chicken.richin="chlorine";
        chicken.advantage="heart health";
        chicken.display();





    }
}
