package MyPackage.InterfaceExample;

/**
 * Created by loveleen.saini on 05-Aug-16.
 */

public class Honda implements ICar
{
    public void Make()
    {
        System.out.println("Executing Make method from Honda class.");
    }

    public void Model()
    {
        System.out.println("Executing Model method from Honda class.");
    }

    public void HondaOwnMethod()
    {
        System.out.println("Honda class own method");
    }

}
