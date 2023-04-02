import java.util.*;

 class Shape
 {
   public void area()
   {
     System.out.println("Area");
   }
 }

  // Single level Inheritence---------------

  class Triangle extends Shape
  {
    public void are(int l,int h)
    {
        System.out.println(1/2*l*h);
    }
  }

  // Multi level Inheritence--------------

  class EquiletrelTriangle extends Triangle
  {
    public void area(int l,int h)
    {
        System.out.println(1/2*l*h);
    }
  }

  // Herarichle inheritence----------------
  
  class Circle extends Shape
  {
    public void area(int r)
    {
        System.out.println((3.14)*r*r);
    }
  }
 
public class inheritence
{
    public static void main(String args[])
    {
      Circle c = new Circle();
      
         c.area(4);
    
    }
}
