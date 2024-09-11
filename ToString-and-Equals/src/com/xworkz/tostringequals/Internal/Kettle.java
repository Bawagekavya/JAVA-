package com.xworkz.tostringequals.Internal;

public class Kettle {

    private String brand;
    private String color;
    private int price;
    private double size;
    private String material;
    private String description;

    public Kettle(String brand, String color, int price, double size, String material, String description) {
        super();
        this.brand = brand;
        this.color = color;
        this.price = price;
        this.size = size;
        this.material = material;
        this.description = description;
    }

    @Override
    public String toString() {
        return "Kettle{" +
                "brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", size=" + size +
                ", material='" + material + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    @Override
    public boolean equals (Object obj)
    {
        if(obj != null)
        {
            if(obj instanceof Kettle) {
                Kettle kettle = (Kettle) obj;
                System.out.println("converting subclass type to parent type");

                if (this.brand.equals(kettle.brand) && this.color.equals(kettle.color) && this.price == kettle.price)
                {
                    System.out.println("check the given ref are equal or not");
                    return true;
                }
                else {
                    System.out.println("both are not equal");
                }
            }
            else {
                System.out.println("obj is null");
            }

        }
        return super.equals(obj);
    }
}
