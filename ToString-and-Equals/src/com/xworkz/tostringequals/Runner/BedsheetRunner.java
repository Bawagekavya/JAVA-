package com.xworkz.tostringequals.Runner;

import com.xworkz.tostringequals.Internal.Bedsheet;

public class BedsheetRunner {

    public static void main(String[] args) {

        Bedsheet bedsheet1 = new Bedsheet("Cotton","Red",9987);

        Bedsheet bedsheet2 = new Bedsheet("Cotton", "Red",9987);

        boolean same = bedsheet1.equals(bedsheet2);
        System.out.println("result:" + same);
    }
}
