package domain;
import java.util.*;
/**
 * @Steven Jordan
 * @02/02/2015
 */
public class Weight
{
    // instance variables - replace the example below with your own
    private double value;
    private Random rand = new Random();

   
    public Weight(double value)
    {
        this.value = value;
    }
    
    public Weight()
    {
       // int x = rand.nextInt(100) + 1;
       // double y = rand.nextDouble();
        value = 50.0;
        
    }
    
    public double getWeight()
    {
        return value;
    }
    
    public void setWeight(double newValue)
    {
        value = newValue;
    }
    
    public String toString()
    {
        return "" + value;
    }

   
}
