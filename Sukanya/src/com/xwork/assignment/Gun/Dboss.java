// INSTANCE

package com.xwork.assignment.Gun;

public class Dboss {

    Shoot shoot = new Shoot();

    public void actor()
    {
        if(shoot != null)
        {
            shoot.fire();
            shoot.display();
        }else
        {
            System.out.println("shoot is null");
        }
    }
}
