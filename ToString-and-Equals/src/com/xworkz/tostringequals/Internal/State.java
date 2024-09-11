package com.xworkz.tostringequals.Internal;

public class State {
    private String name;
    private String City;
    private String famousFor;
    private double population;

    public State(String name, String city, String famousFor, double population) {
        this.name = name;
        this.City = city;
        this.famousFor = famousFor;
        this.population = population;
    }

    @Override
    public String toString() {
        return "Country{" +
                "name='" + name + '\'' +
                ", City='" + City + '\'' +
                ", famousFor='" + famousFor + '\'' +
                ", population=" + population +
                '}';
    }

    @Override
    public boolean equals (Object obj)
    {
        if(obj != null)
        {
            if(obj instanceof State) {
                State state = (State) obj;
                System.out.println("converting subclass type to parent type");

                if (this.name.equals(state.name) && this.City.equals(state.City) && this.famousFor.equals(state.famousFor))
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
