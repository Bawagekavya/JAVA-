package com.xwork.runner;

public class Runner {

    public static void main(String[] args) {

        int[] numbers = {78,56,870,35,23,7};
        for(int number : numbers){
            if(number % 2 == 0){
            System.out.println("Number is even:" + number) ;
            }

            else {
                System.out.println("Number is odd :"+number);
            }

        }

        // Arrays.stream(i).filter(value -> value%2==0).foreach(System.out::println);

    }
}
