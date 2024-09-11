package com.xworkz.tostringequals.Runner;

import com.xworkz.tostringequals.Internal.Kettle;

public class KettleRunner {

    public static void main(String[] args) {

        Kettle kettle1 = new Kettle("Prestige","black",1039,9,"steel","used to make milk hot");

        Kettle kettle2 = new Kettle("Prestige","black",1039,9,"plastic","used to hot milk");

        boolean same = kettle1.equals(kettle2);
        System.out.println("result "+ same);
    }
}
