package com.xwork.plant;

public class Plant {

   private String name;
   private String color;
   private double height;
   private int age;
   private double weight;

   private String type;
   private int lifespan;
   private String uses;
   private String SoilType;
   private String growrate;

   public Plant(String name, String color, double height, int age, double weight)
   {
       System.out.println("created plant");
        this.name = name;
        this.color = color;
        this.height = height;
        this.age = age;
        this.weight = weight;
    }

    public void setStringType (String type)
    {
        this.type=type;
    }

    public void setintlifespan(int lifespan)
    {
        this.lifespan=lifespan;
    }

    public void setStringuses(String uses)
    {
        this.uses=uses;
    }
    public void setSoilType(String SoilType)
    {
        this.SoilType=SoilType;
    }

    public void growrate(String growrate)
    {
        this.growrate=growrate;
    }

    public void display()
    {
        System.out.println("NAME : "+ this.name);
        System.out.println("COLOR :" +this.color);
        System.out.println("HEIGHT :" +this.height);
        System.out.println("AGE :" +this.age);
        System.out.println("WEIGHT :"+ this.weight);
        System.out.println("TYPE :"+this.type);
        System.out.println("LIFESPAN :"+ this.lifespan);
        System.out.println("USES :" +this.uses);
        System.out.println("SOILTYPE :"+ this.SoilType);
        System.out.println("GROWRATE:" +this.growrate);


    }

    public static void main(String[] args) {

       Plant plant1= new Plant("tulip","purple",0.7,18,10.3);
       plant1.setStringType("Loamy");
       plant1.setintlifespan(4);
       plant1.setStringuses("medicinal");
       plant1.setSoilType("medium");
       plant1.growrate("Moderate");

       Plant [] plants = new Plant[1];
       plants[0]=plant1;

       for (Plant plant : plants)
        {
            System.out.println(plant);
            plant.display();

        }
   }
}

