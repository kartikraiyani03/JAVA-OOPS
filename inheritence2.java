import java.util.*;

class Circle
{
  int r;

  Circle(int r)
  {
    System.out.println("Cicrle Constructor with radius "+r);
    System.out.println("");
}

public double area(int r)
{
    return 3.14*r*r;
}
}

class Cylinder extends Circle
{
    
    Cylinder(int r,int h)
    {
        super(r);
        System.out.println("Cylinder Constructor with radius "+r+" and height "+h);
        System.out.println("");
    }
    
    
    public double volume(int r,int h)
    {
        return 3.14*r*r*h;
    }
}

class Cone extends Cylinder
{
    int l;
    
    Cone(int r,int h,int l)
    {
        super(r,h);
     System.out.println("Cone Comstructor with radius "+r+" and length "+l);
     System.out.println("");
    }
    
    
    public double volume(int r,int l)
    {
        return 3.14*r*l;
    }
}

public class inheritence2
{
    public static void main(String args[])
    {
        Cone c = new Cone(1,2,3);
       System.out.println("Cone Volume "+c.volume(1,3));
    }
}