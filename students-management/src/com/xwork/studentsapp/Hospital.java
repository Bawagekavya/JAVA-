package com.xwork.studentsapp;

public class Hospital {

    private String name;
    private int beds;
    private int doctors;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBeds() {
        return beds;
    }

    public void setBeds(int beds) {
        this.beds = beds;
    }

    public int getDoctors() {
        return doctors;
    }

    public void setDoctors(int doctors) {
        this.doctors = doctors;
    }

    @Override
    public String toString() {
        return "Hospital{" +
                "name='" + name + '\'' +
                ", beds=" + beds +
                ", doctors=" + doctors +
                '}';
    }
}
