package com.xworkz.tostringequals.Runner;

import com.xworkz.tostringequals.Internal.Country;

public class CountryRunner {

    public static void main(String[] args) {


        Country country = new Country("India","Gulbarga","Dal","Jana Gana Mana",64746362,"Tiger");

        Country country1 = new Country("India" ,"Gulbarga","Dal","Jana Gana Mana",64746362,"Tiger");

        boolean same = country1.equals(country);
        System.out.println("result :" + same);

    }
}
