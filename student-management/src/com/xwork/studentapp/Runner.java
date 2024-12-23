package com.xwork.studentapp;

public class Runner extends Book{

    public static void main(String[] args) {

        Runner runner = new Runner();
        runner.setId(1);
        runner.setBookName("Too good to be true");
        runner.setAuthor("Xyz");
       System.out.println(runner.toString());

    }
}
