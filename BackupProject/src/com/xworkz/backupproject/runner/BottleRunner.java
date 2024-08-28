package com.xworkz.backupproject.runner;

import com.xworkz.backupproject.things.Bottle;

public class BottleRunner {

    public static void main(String[] args) {

        Bottle bottle = new Bottle();

        Bottle bottle1 = new Bottle("red", "milton", 80);
        Bottle bottle2 = new Bottle("blue", "pigeon", 100);
        Bottle bottle3 = new Bottle("black", "bisleri", 120);

        bottle.store(bottle1);
        bottle.store(bottle2);
        bottle.store(bottle3);
        bottle.display();

    }
}
