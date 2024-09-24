// Default methods in interface

package com.xwork.java.internal;

public interface RailwayStation {

    void trainNo();

    default void bookTickets()      // Default method : no need to override
        {
            System.out.println("bookTickets in railwayStation");
            return ;
        }
}
