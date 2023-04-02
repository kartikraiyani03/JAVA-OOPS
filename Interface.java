import java.util.*;

interface Animal
{
    public void walk();
}

class Horse implements Animal
{
    public void walk()
    {
       System.out.println("Walks on 4 legs");
    }
}

class Dog implements Animal
{
    public void walk()
    {
       System.out.println("Walks on 2 legs");
    }
}

public class Interface
{
    public static void main(String args[])
    {
        // Animal a = new Animal(); errore
        Horse h = new Horse();
        // Dog d = new Dog();

        h.walk();

    }
}