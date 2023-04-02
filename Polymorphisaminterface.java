import java.util.*;

interface Camera
{
    void Photo();
    void Video();
    // void Snap();
    // void Portrait();
}

interface Sensor
{
    void CameraSensor();
    void XyroSensor();
    // void CallSensor();
}

interface Call
{
    void attend();
    void decline();
}

class CellPhone
{
    public void Photo()
    {
        System.out.println("CellPhone Taking Photo on 2MP");
    }
    public void OnlyCall()
    {
        System.out.println("CellPhone Have Call Facility");
    }
}

class Android extends CellPhone implements Camera, Call, Sensor
{
   public void Photo()
   {
     System.out.println("Android Can Take Photo in Better Quality");
   }
   
   public void Video()
   {
     System.out.println("Android Can Record Best Quality Video");
   }

   public void Snap()
   {
     System.out.println("Android Can Take Snap");
   }

   public void attend()
   {
     System.out.println("Android Have Call Functionality, it Can Attend The call ");
   }

   public void decline()
   {
     System.out.println("Android Have Call Functionality, it can Decline call");
   }

   public void CameraSensor()
   {
     System.out.println("Android have Best Quality Camera Sensor");
   }

   public void XyroSensor()
   {
     System.out.println("Android have XyroSensor");
   }

}

public class Polymorphisaminterface 
{
    public static void main(String args[])
    {
      System.out.println("");

      Camera a = new Android();   // for camera functionality
      // a.atend();  // ----> not valid because of Camera functionality, it is call functionlality

      Android b = new Android();  // for all android functionality
      // b.attend();  // ----> valid statement
      
      System.out.println("");
    }
}