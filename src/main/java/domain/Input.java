package domain;
/**
 * @Life of Sherba
 * @02/02/2015
 */
public class Input
{
    // instance variables - replace the example below with your own
    private double value;
    
    public Input()
    {
        value = 0;
    }

    public Input(double input)
    {
        value = input;
    }

    public double getInput()
    {
        return value;
    }
    
    public void setInput(double input)
    {
        value = input;
    }
    
}
