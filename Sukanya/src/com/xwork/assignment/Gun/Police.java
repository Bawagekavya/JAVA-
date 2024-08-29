//  PARAMETER
package com.xwork.assignment.Gun;

public class Police {


    public void encounter(Shoot shoot)
    {
        if(shoot != null)
        {
            System.out.println(shoot.name);
            System.out.println(shoot.CountryMade);
            System.out.println(shoot.type);
            shoot.fire();
            shoot.display();
        }else
        {
            System.out.println("shoot is null");
        }



    }
}
