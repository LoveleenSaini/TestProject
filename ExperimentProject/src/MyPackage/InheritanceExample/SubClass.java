package MyPackage.InheritanceExample;

/**
 * Created by loveleen.saini on 19-Apr-16.
 */

public class SubClass extends SuperClass
{
    public int subClassPublicVariable;
    private int subClassPrivateVariable;
    public static String subClassStaticString = "Sub Class Static String value";

    public SubClass()
    {
        System.out.println("Sub class constructor executing.");
    }

    public void SubClassPublicMethod()
    {
        System.out.println("Sub class public method executing.");
    }

    private void SubClassPrivateMethod()
    {
        System.out.println("Sub class private method executing.");
    }

    public static void SubClassStaticMethod()
    {
        System.out.println("Sub class static method executing.");
    }
}
