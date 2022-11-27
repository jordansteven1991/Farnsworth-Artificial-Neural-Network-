
/**
 * Write a description of class MyStack here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 * need to get rid of this later
 */
public class MyStack
{
    // instance variables - replace the example below with your own
    private int top;
    private double[]contents = new double[30];
    private Object[]objects = new Object[30];

    /**
     * Constructor for objects of class MyStack
     */
    public MyStack()
    {
        top = -1;
    }

   public void push(double x)
   {
       top++;
       contents[top] = x;
    }
    
    public void pushx(Object obj)
    {
        top++;
        objects[top] = obj;
    }
    
   public double pop()
   {
       double temp = contents[top];
       top--;
       return temp;
    }
    
     public Object popx()
   {
       Object temp = objects[top];
       top--;
       return temp;
    }
    
    public double peek()
    {
        return contents[top];
    }
    
    public Object peekx()
    {
        return objects[top];
    }
    
    
    public boolean empty()
    {
        if(top == -1)
        {
            return true;
        }
        
        else
        {
            return false;
        }
    }
    
}
