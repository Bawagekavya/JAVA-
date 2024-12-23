package com.xwork.collections.student;

import java.util.ArrayList;
import java.util.Collection;

public class Student {

    public static void main(String[] args) {

        Collection collection1 = new ArrayList();
        collection1.add(1);
        collection1.add(2);
        collection1.add(3);
        collection1.add(4);
        collection1.add(5);
        System.out.println("Collection 1:" + collection1);

        Collection collection2 = new ArrayList();
        collection2.add(6);
        collection2.add(7);
        collection2.add(8);
        collection2.add(9);
        collection2.add(10);
        System.out.println("Collection 2:" +collection2);

        collection1.addAll(collection2);
        System.out.println("Adding all  of collection 1 and collection 2:" + collection1);

        boolean valueAvailable = collection1.contains(4);
        System.out.println("Is Value of 4 is available in collection1: "+ valueAvailable);

        boolean containsall = collection2.containsAll(collection1);
        System.out.println("Contains all of collection1 :" + containsall);


        System.out.println("Collection1 size: " + collection1.size());
        System.out.println("Collection2 size: " + collection2.size());

        collection1.remove(4);
        System.out.println("Removing value of 4 from collection: " + collection1);

       boolean removeall =  collection1.removeAll(collection2);
        System.out.println("Removing all of collections 1 from collections 2:"+removeall);
        collection1.clear();
        System.out.println("claer all elements in collection1:"+ collection1);




    }
}
