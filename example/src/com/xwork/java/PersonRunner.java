package com.xwork.java;

public class PersonRunner {

    public static void main(String[] args) {

        Person person1 =new Person("Kavya","kavyabawage92@gmail.com",22,7259958546L);

        Person person2 =new Person("Bhagyashree","Bhagyabiradar96@gmail.com",23,7353241011L);

        Person person3 =new Person("Sukanya","Sukanyatipgond24@gmail.com",24,9740553104L);

        Person person4 =new Person("Soumya","soumyapujari65@gmail.com",25,9731888104L);

        Person person5 =new Person("Shabari","shabarimantagi76@gmail.com",26,9741140051L);

        Person[] persons = { person1,person2,person3,person4,person5 };

        for(Person person : persons)
        {
            System.out.println(person);
        }

    }
}
