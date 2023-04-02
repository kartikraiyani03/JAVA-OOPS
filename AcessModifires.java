import java.util.*;

class Account 
{
  public String name;
  protected String email;
  private String password;
  
  public void info()
  {
    System.out.println("Acoount Name : "+this.name);
    System.out.println("Acoount Email : "+this.email);
    System.out.println("Acoount Password : "+this.getPassword());
  }

  Account()
  {
    this.name = name;
    this.email = email;
    this.password = password;
  }

  public String getPassword()
  {
    return this.password;
  }

  public void setPassword(String password)
  {
    this.password = password;
  }
}

public class AcessModifires 
{
    public static void main(String args[]) 
    {
      Account acc = new Account();
      System.out.println("");

      acc.name = "abc_123";
      acc.email = "abc123@gmail.com";
      acc.setPassword("abc@123");
      
      System.out.println(acc.getPassword());
      acc.info();
      System.out.println("");
        
    }
}