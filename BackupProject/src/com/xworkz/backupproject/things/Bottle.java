package com.xworkz.backupproject.things;

public class Bottle {
    public  Bottle(){

    }
    private String colour;
    private String brand;
    private int cost;

   private Bottle[]  bottles=new Bottle[3]; //{bottle1,bottle2,null}
int index=0;
    public Bottle(String colour, String brand, int cost) {
        this.colour = colour;
        this.brand = brand;
        this.cost = cost;
    }

    public  void  store(Bottle bottle ){
        bottles[index]=bottle;
        index++;
    }

    public void display(){
        for (int i = 0; i <bottles.length ; i++) {
            Bottle bottle=bottles[i];
            System.out.println("colour is : "+bottle.colour);
            System.out.println("brand is : "+bottle.brand);
            System.out.println("cost is : "+bottle.cost);

        }
    }


}
