import java.util.*;

class Student 
{
    String name;
    int age;
    static String school; // Static Defined  For all, No Need to defined Indivisually 
}
 
public class Static
{
    public static void main(String args[])
    {
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();

        s1.name = "Alpha";
        s2.name = "Beta";
        s3.name = "Gamma";

        s1.age = 20;
        s2.age = 21;
        s3.age = 19;
        Student.school = "ABC School";
        System.out.println("");

        System.out.println("Name : "+s1.name);
        System.out.println("Age : "+s1.age);
        System.out.println("School : "+Student.school);
        System.out.println("");
        
        System.out.println("Name : "+s2.name);
        System.out.println("Age : "+s2.age);
        System.out.println("School : "+Student.school);
        System.out.println("");
        
        System.out.println("Name : "+s3.name);
        System.out.println("Age : "+s3.age);
        System.out.println("School : "+Student.school);
        System.out.println("");

    }
}