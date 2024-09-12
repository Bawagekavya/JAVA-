package com.xwork.java;


import java.time.LocalDate;
import java.time.LocalDateTime;


public class DayExample {


    public static void main(String[] args) {


        LocalDate date = LocalDate.now();
        System.out.println("Present date : " + date);

        LocalDate pastDays = date.minusDays(2);
        System.out.println("past date (2days) : " + pastDays);

        LocalDate futureDays = date.plusDays(10);
        System.out.println("Future date (10 days) :" + futureDays);

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("Present date time :" + localDateTime);

        LocalDateTime pastDateTime = localDateTime.minusDays(2847);
        System.out.println("Past date time  (2847 days):" + pastDateTime);

        LocalDateTime futureDateTime = localDateTime.plusDays(9875);
        System.out.println("Future date time (9875 days) :" + futureDateTime);







    }
}
