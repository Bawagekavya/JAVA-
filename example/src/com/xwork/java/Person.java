package com.xwork.java;

public class Person {

    public String name;
    public String email;
    public int age;
    public long mobileNo;

    public Person(String name,String email,int age,long mobileNo)
    {
        this.name=name;
        this.email=email;
        this.age=age;
        this.mobileNo=mobileNo;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", mobileNo=" + mobileNo +
                '}';
    }
}
