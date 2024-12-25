package com.xwork.collection.queue;

import javafx.print.Collation;

import java.util.Collection;
import java.util.PriorityQueue;

public class PriorityQueues {

    public static void main(String[] args) {

        Collection collection1 =  new PriorityQueue();
        collection1.add(34564);
        collection1.add(74673226);
        collection1.add(368475);
        collection1.add(67329);
        collection1.add(97323);
        collection1.add(24364);
        collection1.add(3426);
        collection1.add(37603);
        collection1.add(874542);
        collection1.add(978142);
        System.out.println("PriorityQueue Collection 1:" + collection1);


    }
}
