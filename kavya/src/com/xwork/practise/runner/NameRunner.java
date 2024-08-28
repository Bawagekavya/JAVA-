package com.xwork.practise.runner;

import com.xwork.practise.data.Halwa;
import com.xwork.practise.data.Owner;
import com.xwork.practise.data.Name;

public class NameRunner {

    public static void main(String[] args) {

        Name name = new Name();
        name.type="carrot halwa";
        name.cost=89;
        name.color="orange";
        name.display();

        Owner owner = new Name();
        owner.type="karachi halwa";
        owner.cost=39;
        owner.color="red";
        owner.display();

        Halwa halwa = new Owner();
        halwa.type="kozhikodan halwa";
        halwa.cost=90;
        halwa.color="blue";
        halwa.display();



    }
}
