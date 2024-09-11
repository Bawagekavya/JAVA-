package com.xworkz.tostringequals.Runner;

import com.xworkz.tostringequals.Internal.Bulb;

public class BulbRunner {

    public static void main(String[] args) {

        Bulb bulb1 = new Bulb("Havells", "Pink", 98, 6, "plastic",
                "Havells is often considered as No.1 LED bulb company");

        Bulb bulb2 = new Bulb("Havells", "Pink", 98, 9, "Plastic", "energy efficient");

        boolean same = bulb1.equals(bulb2);
        System.out.println("result:" + same);
    }


}
