package com.xworkz.tostringequals.Runner;

import com.xworkz.tostringequals.Internal.Jeans;

public class JeansRunner {

    public static void main(String[] args) {

        Jeans jeans1 = new Jeans("Calvin klein","blue",500,28.6,"Fabric", "Cotton will fabric woven with an indigo,gray or mottles white yarn");

        Jeans jeans2 = new Jeans("Calvin klein","black",500,28.6,"Leather","usually have a heavier weight of denim");

        boolean same = jeans1.equals(jeans2);
        System.out.println("result :" + same);
    }
}
