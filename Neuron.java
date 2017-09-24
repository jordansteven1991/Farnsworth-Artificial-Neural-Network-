import java.util.*;
/**
 * Write a description of class Neuron here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Neuron
{
    // instance variables - replace the example below with your own
    private Weight weight;
    private double input;
    private Random rand = new Random();
    private int state;

    public Neuron()
    {
        weight = new Weight();
        input = 0;
        state = 0;
    }
    
    
    public Neuron(double input)
    {
        weight = new Weight(input);
        input = 0;
    }

    
    public double fire(double input)
    {
        input = input * (weight.getWeight());
        this.input = input;
        state = 1;
        
        return input;
    }
    
    public void reduceWeight()
    {
        state = 0;
        //double x = rand.nextDouble();
        double w = weight.getWeight();
        
        w = w - .5;
        
        weight.setWeight(w);
    }
    
    public void increaseWeight()
    {
        state = 0;
        //double x = rand.nextDouble();
        double w = weight.getWeight();
        
        w = w + .5;
        
        weight.setWeight(w);
    }
    
    public void setWeight(double newWeight)
    {
        weight.setWeight(newWeight);
    }
    
    public double getWeight()
    {
        return weight.getWeight();
    }
    
    
    public int getState()
    {
        return state;
    }
    
}
