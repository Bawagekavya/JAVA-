package com.xwork.runner.user;

public class Student {

    public static void main(String[] args) {

        Object[] obj1 = new Object[2];
        obj1[0] = "kavya";
        obj1[1] = "Kajal";

        Object[] obj = new Object[2];
        obj[0] = obj1;
        obj[1] = "Vinayak";

        for(Object ref : obj){
            System.out.println((String) ref );
        }
    }




}
