package com.xwork.studentsapp;

public class University {

    private String name;
    private int students;
    private String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStudents() {
        return students;
    }

    public void setStudents(int students) {
        this.students = students;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "University{" +
                "name='" + name + '\'' +
                ", students=" + students +
                ", address='" + address + '\'' +
                '}';
    }
}
