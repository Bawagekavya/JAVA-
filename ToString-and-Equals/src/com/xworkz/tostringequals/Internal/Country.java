package com.xworkz.tostringequals.Internal;

public class Country {

    private String name;
    private String City;
    private String famousFor;
    private String NationalSong;
    private double population;
    private String NationalAnimal;

    public Country(String name, String city, String famousFor, String nationalSong, double population, String nationalAnimal) {
        this.name = name;
        this.City = city;
        this.famousFor = famousFor;
        NationalSong = nationalSong;
        this.population = population;
        NationalAnimal = nationalAnimal;
    }

    @Override
    public String toString() {
        return "Country{" +
                "name='" + name + '\'' +
                ", City='" + City + '\'' +
                ", famousFor='" + famousFor + '\'' +
                ", NationalSong='" + NationalSong + '\'' +
                ", population=" + population +
                ", NationalAnimal='" + NationalAnimal + '\'' +
                '}';
    }

    @Override
    public boolean equals (Object obj)
    {
        if(obj != null)
        {
            if(obj instanceof Country) {
                Country country = (Country) obj;
                System.out.println("converting subclass type to parent type");

                if (this.name.equals(country.name) && this.City.equals(country.City) && this.NationalSong.equals(country.NationalSong))
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

