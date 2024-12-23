package com.xwork.studentsapp;

public class Shapes {

    private String shapeName;
    private double area;
    private int length;

    public String getShapeName() {
        return shapeName;
    }

    public void setShapeName(String shapeName) {
        this.shapeName = shapeName;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Shapes{" +
                "shapeName='" + shapeName + '\'' +
                ", area=" + area +
                ", length=" + length +
                '}';
    }
}
