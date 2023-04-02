import java.util.*;

abstract class Parent
{
    Parent()
    {
        System.out.println("Tis is Parent Constructor");
    }
    public void print()
    {
        System.out.println("Hello It's Root User");
    }
    abstract public void info();
}

class child1 extends Parent
{
    child1()
    {
       System.out.println("This is Child1 Constructor ");
    }
    public void info()
    {
        System.out.println("This is Child1 Class");
    }
}

class child2 extends Parent
{
    child2()
    {
        System.out.println("This is Child2 Constructor");
    }
    public void info()
    {
        System.out.println("This is Child2 Class");
    }
}


public class Abstract
{
    public static void main(String args[])
    {
        // Parent p = new Parent(); errore
        child1 c1 = new child1();
        child2 c2 = new child2();
        // c1.info();
        // c2.info();

    }
}