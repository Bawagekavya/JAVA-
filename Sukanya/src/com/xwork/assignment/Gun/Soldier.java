// LOCAL VARIABLE

package com.xwork.assignment.Gun;

public class Soldier {

    public void save() {

        Shoot shoot = new Shoot();
        System.out.println(shoot.name);
        System.out.println(shoot.CountryMade);
        System.out.println(shoot.type);
        shoot.fire();
        shoot.display();
    }

}
