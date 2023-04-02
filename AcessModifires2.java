import java.util.*;

class AM
{
    public int a = 5;
    protected int b = 34;
    int c = 23;
    private int d = 56;

    public void infoa()
    {
        System.out.println(a);
    }
    public void infob()
    {
        System.out.println(b);
    }
    public void infoc()
    {
        System.out.println(c);
    }
    public  void infod()
    {
        System.out.println(d);
    }

}

public class AcessModifires2
{
    public static void main(String args[])
    {
        AM am = new AM();

        System.out.println(am.a);
        System.out.println(am.b);
        System.out.println(am.c);
        // System.out.println(am.d);

    }
}