package MyPackage.InterfaceExample;

import MyPackage.InterfaceExample.ICar;

/**
 * Created by loveleen.saini on 05-Aug-16.
 */

public class Nissan implements ICar
{
    public void Make()
    {
        System.out.println("Executing Make method from Nissan class.");
    }

    public void Model()
    {
        System.out.println("Executing Model method from Nissan class.");
    }

    public void NissanOwnMethod()
    {
        System.out.println("Nissan class own method");
    }
}
