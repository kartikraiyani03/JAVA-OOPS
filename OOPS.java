import java.util.*;

class Student
{
    String name;
    int age;
    private float cgpa;
 
    public void info()
    {
        System.out.println("Name : "+this.name);
        System.out.println("Age : "+this.age);
        System.out.println("CGPA : "+this.cgpa);
    }

    public void setcgpa(float cgpa)
    {
        this.cgpa = cgpa;
    }

    public float getcgpa()
    {
        return this.cgpa;
    }
       
    Student(String name, int age, float cgpa)
    {
        this.name = name;
        this.age = age;
        this.cgpa = cgpa;
    }
}
 
public class OOPS
{
    public static void main(String args[])
    {
        Student s1 = new Student("alpha",19,9);
        Student s2 = new Student("beta",20,8);
        Student s3 = new Student("gamma",21,7);

        // s1.name = "abc";
        // s1.age= 19;
        // s1.cgpa = 9.0F;
        
        s1.info();
        System.out.println("");
        s2.info();
        System.out.println("");
        s3.info();


    }
}