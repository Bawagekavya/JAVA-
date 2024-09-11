package com.xwork.java.chaining;

import  com.xwork.java.chaining.District;


public class DistrictRunner {

    public static void main(String[] args) {

        District district = new District();

        District district1 = new District("Gulbarga","Turdal");
        district1.display();

        District district2 = new District("Bhalki");


    }
}
