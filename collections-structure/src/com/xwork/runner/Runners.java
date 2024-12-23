package com.xwork.runner;

import java.util.ArrayList;
import java.util.Collection;

public class Runners {

    public static void main(String[] args) {

        Collection collection = new ArrayList();
        collection.add(1);
        collection.add("kavya");
        collection.add(2);
        collection.add("Kajal");
        collection.add(3);
        collection.add("vinayak");
        collection.add(4);
        collection.add("vaishnavi");
       // System.out.println(collection);


        Collection collection1 = new ArrayList();
        collection1.add(11);
        collection1.add("someshwari");
        collection1.add(12);
        collection1.add("bhagyashree");
        collection1.add(13);
        collection1.add("sukanya");
        collection1.add(14);
        collection1.add("soumya");

     boolean valueavailable = collection1.contains("sukanya");
        System.out.println("Value Available : " + valueavailable);
        System.out.println(collection1);
        System.out.println("Collection1 Size :"+collection1.size());
      //  collection.addAll(collection1);
      //  System.out.println(collection);



       // collection.forEach(System.out::println);  // printing values one below the other

         // collection.clear();
        //  collection.removeAll(collection);
        //  collection.stream().filter();

    }
}
