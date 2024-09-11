package com.xworkz.tostringequals.Internal;

import java.util.Objects;

public class Saree {

    private String brand;
    private String color;
    private int price;
    private double size;
    private String material;
    private String description;

    public Saree(String brand, String color, int price, double size, String material, String description) {
        this.brand = brand;
        this.color = color;
        this.price = price;
        this.size = size;
        this.material = material;
        this.description = description;
    }

    @Override
    public String toString() {
        return "Saree{" +
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

        if(obj != null)
        {
            if(obj instanceof Saree)
            {
                Saree saree = (Saree)obj;
                System.out.println("converting ref of subtype to parent type");

                if(this.brand.equals(saree.brand) && this.price==saree.price && this.size==saree.size)
                {
                    System.out.println("they are equal");
                    return true;
                }
                else {
                    System.out.println("they are not equal");
                }
            }
            else
            {
                System.out.println("obj is null");
            }

        }

        return super.equals(obj);
    }

}
