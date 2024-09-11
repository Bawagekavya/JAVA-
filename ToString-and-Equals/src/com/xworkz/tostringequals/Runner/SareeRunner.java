package com.xworkz.tostringequals.Runner;

import com.xworkz.tostringequals.Internal.Saree;

public class SareeRunner {

    public static void main(String[] args) {

        Saree saree1 = new Saree("Cotton","black",8743,90,"cotton","Saree is a traditional" +
                " attire for women of south asian descent and is a long peice of fabric that is draped around the body");

        Saree saree2 = new Saree("Cotton","blue",8748,90,"leather","Saree is a traditional wear");

        boolean same = saree1.equals(saree2);
        System.out.println("result :" + same);
    }
}
