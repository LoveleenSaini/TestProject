package MyPackage.InheritanceExample;

/**
 * Created by loveleen.saini on 19-Apr-16.
 */

public class SuperClass
{
    public int superClassPublicVariable;
    private int superClassPrivateVariable;
    public static String superClassStaticString = "Super Class Static String value";

    public SuperClass()
    {
        System.out.println("Super class constructor executing.");
    }
    public void SuperClassPublicMethod()
    {
        System.out.println("Super class public method executing.");
    }
    private void SuperClassPrivateMethod()
    {
        System.out.println("Super class private method executing.");
    }

    public static void SuperClassStaticMethod()
    {
        System.out.println("Super class static method executing.");
    }
}
