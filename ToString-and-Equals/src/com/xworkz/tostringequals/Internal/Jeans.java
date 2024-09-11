package com.xworkz.tostringequals.Internal;


public class Jeans {

    private String brand;
    private String color;
    private int price;
    private double size;
    private String material;
    private String description;

    public Jeans(String brand, String color, int price, double size, String material, String description) {
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
        return "Jeans [ brand=" +brand +"  , color =" +color +", price= " +price +"," +
                " size=" +size +", material=" +material +", description =" +description +"]";
    }


    @Override
    public boolean equals(Object obj)
    {
        if(obj != null) {
            if (obj instanceof Jeans) {
                Jeans jeans = (Jeans) obj;
                System.out.println("use instanceof to convert subclass type to parent type");

                if (this.brand.equals(jeans.brand) && this.price == jeans.price && this.size == jeans.size) {
                    System.out.println("check the two given ref are equal or not");
                    return true;
                } else {
                    System.out.println("both are not equals");
                }
            } else {
                System.out.println("obj is null");
                }

        }
        return super.equals(obj);


    }
}
