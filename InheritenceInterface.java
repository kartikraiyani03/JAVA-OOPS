import java.util.*;

interface Sensor
{
    void XyroSensor();
    void CallSensor();
}

interface CameraSensor extends Sensor
{
    void sony();
    void canon();
}

class Android implements CameraSensor
{
    public void XyroSensor()
    {
        System.out.println("Android have XyroSensor");
    }
    public void CallSensor()
    {
        System.out.println("Android have CallSensor");
    }
    public void sony()
    {
        System.out.println("Android can have Sony CameraSensor");
    }
    public void canon()
    {
        System.out.println("Android can have canon CameraSensor");
    }
}
 
public class InheritenceInterface
{
    public static void main(String args[])
    {
        System.out.println("");

        Android a = new Android();
        a.sony();
        
        System.out.println("");

    }
}