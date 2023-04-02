import java.util.*;

class Student
{
    String name;
    int aqe;

    public void info(String name)
    {
        System.out.println("Name : "+name);
    }

    public void info(int age)
    {
        System.out.println("Age : "+age);
    }

    public void info(String name,int age)
    {
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
    }
}
 
public class Polymorphism
{
    public static void main(String args[])
    {
        Student s = new Student();
        s.info("Alpha");
        System.out.println("");
        s.info(21);
        System.out.println("");
        s.info("Alpha",21);

    }
}