package com.xwork.runner.user;

public class UserRunner {

    public static void main(String[] args) {

        System.out.println("Main started");

        User user = new User();
        user.userId=100;

        Object obj[] = new Object[5];
        obj[0] = 24;
        obj[1] = "Kavya";
        System.out.println(obj[0] + " " + obj[1] + " "+ user);

        System.out.println("Main ended");

      //  System.out.println(obj.toString());

    }
}
