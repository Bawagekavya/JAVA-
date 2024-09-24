package com.xwork.java.Runner;

import com.xwork.java.internal.Student;

public class StudentRunner {

    public static void main(String[] args) {

        Student student = new Student();
        student.setName("Kavya");
        student.setUSN("3PD20EC030");
        student.setCollege("PDA college of Engineering, Gulbarga");
        student.setAge(23);

        System.out.println("Student Name :" + student.getName());
        System.out.println("Student USN :" + student.getAge());
        System.out.println("Student College :" + student.getCollege());
        System.out.println("Student Age :" + student.getAge());
    }
}
