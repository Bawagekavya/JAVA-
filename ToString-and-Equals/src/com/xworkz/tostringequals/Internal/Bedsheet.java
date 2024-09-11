package com.xworkz.tostringequals.Internal;

import java.util.Objects;

public class Bedsheet {

    private String brand;
    private String color;
    private int price;
    private double size;
    private String material;
    private String description;


    public Bedsheet(String brand, String color, int price) {
        this.brand = brand;
        this.color = color;
        this.price = price;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Bedsheet{" +
                "brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", size=" + size +
                ", material='" + material + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            if (obj instanceof Bedsheet) {
                Bedsheet bedsheet = (Bedsheet) obj;
                System.out.println("converting ref of sub type to parent type");

                if (this.brand.equals(bedsheet.brand) && this.color.equals(bedsheet.color) && this.price == bedsheet.price) {
                    System.out.println("they are equal");
                    return true;
                } else {
                    System.out.println("they are not equal");
                }
            } else {
                System.out.println("obj is null");
            }
        }

        return super.equals(obj);
    }
}


