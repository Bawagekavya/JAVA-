package com.xworkz.tostringequals.Runner;

import com.xworkz.tostringequals.Internal.Gun;

public class GunRunner {

    public static void main(String[] args) {

        Gun gun = new Gun("Mossberg", "Red", 9987, 5, "plastic", "No.1 brand ");

        Gun gun1 = new Gun("Mossberg", "Red", 9987, 5, "Leather", "No.3 brand");

        boolean same = gun.equals(gun1);
        System.out.println("result:" + same);
    }
}
