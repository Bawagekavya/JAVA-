// Encapsulation

package com.xwork.java.internal;

public class Student {

    private String name;
    private String USN;
    private String College;
    private int age;

    public String getName() {         // getter methods
        return name;
    }

    public String getUSN() {            // getter methods
        return USN;
    }

    public String getCollege() {        // getter methods
        return College;
    }

    public int getAge() {          // getter methods
        return age;
    }

    public void setName(String name) {           // setter methods
        this.name = name;
    }

    public void setUSN(String USN) {           // setter methods
        this.USN = USN;
    }

    public void setCollege(String college) {        // setter methods
        College = college;
    }

    public void setAge(int age) {              // setter methods
        this.age = age;
    }
}
