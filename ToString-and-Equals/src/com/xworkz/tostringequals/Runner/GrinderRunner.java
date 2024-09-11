package com.xworkz.tostringequals.Runner;

import com.xworkz.tostringequals.Internal.Grinder;

public class GrinderRunner {

    public static void main(String[] args) {

        Grinder grinder1 = new Grinder("Prestige","blue",1098);

        Grinder grinder2 = new Grinder("Prestige", "blus",8585);

        boolean same = grinder1.equals(grinder2);
        System.out.println("result :" + same);
    }
}
