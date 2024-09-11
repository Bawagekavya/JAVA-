package com.xworkz.tostringequals.Internal;

public class Grinder {

    private String brand;
    private String color;
    private int price;
    private double size;
    private String material;
    private String description;

    public Grinder(String brand, String color, int price) {
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
        return "Grinder{" +
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
        if (obj != null)
        {
            if (obj instanceof Grinder)
            {
                Grinder grinder = (Grinder) obj;
                System.out.println("converting  ref of sub type to parent type");

                if (this.brand.equals(grinder.brand) && this.color.equals(grinder.color) && this.price == grinder.price) {
                    System.out.println("check weather instance are matching ");
                    return true;
                }
                else {
                    System.out.println("they are not equal");
                }

            }
            else {
                System.out.println("obj is null");
            }
        }

        return super.equals(obj);
    }

}

