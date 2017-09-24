import java.util.*;
import java.io.*;
/**
 * @Steven Jordan
 * @02/01/2013
 */
public class Brain 
{
    // instance variables - replace the example below with your own
    private Neuron neuron1 = new Neuron();
    private Neuron neuron2 = new Neuron();
    private Neuron neuron3 = new Neuron();
    private Neuron neuron4 = new Neuron();
    private Neuron neuron5 = new Neuron();
    private Neuron neuron6 = new Neuron();
    private Neuron neuron7 = new Neuron();
    private Neuron neuron8 = new Neuron();
    private Neuron neuron9 = new Neuron();
    private Neuron neuron10 = new Neuron();
    private Neuron neuron11 = new Neuron();
    private Neuron neuron12 = new Neuron();
    private Neuron neuron13 = new Neuron();
    private Neuron neuron14 = new Neuron();
    private Neuron neuron15 = new Neuron();
    private Neuron neuron16 = new Neuron();
    private Neuron neuron17 = new Neuron();
    private Neuron neuron18 = new Neuron();
    private Input input1;
    private Input input2;
    private Input input3;
    private Input input4;
    private Input input5;
    private Input input6;
    private Input input7;
    private Input input8;
    private LinkedList<Input> inputs = new LinkedList<Input>();
    private LinkedList<Neuron> neurons = new LinkedList<Neuron>();
    private Database database;
    
    private MyStack results = new MyStack();
    
    public Brain() throws IOException
    {
         input1 = new Input();
        input2 = new Input();
        input3 = new Input();
         input4 = new Input();
         input5 = new Input();
         input6 = new Input();
         input7 = new Input();
         input8 = new Input();
  //      database = new Database();
        neurons.add(neuron1);
        neurons.add(neuron2);
        neurons.add(neuron3);
        neurons.add(neuron4);
        neurons.add(neuron5);
        neurons.add(neuron6);
        neurons.add(neuron7);
        neurons.add(neuron8);
        neurons.add(neuron9);
        neurons.add(neuron10);
        neurons.add(neuron11);
        neurons.add(neuron12);
        neurons.add(neuron13);
        neurons.add(neuron14);
        neurons.add(neuron15);
        neurons.add(neuron16);
        neurons.add(neuron17);
        neurons.add(neuron18);
        
       
    }
    
      public Brain(File file) throws IOException
    {
//         input1 = new Input();
//         input2 = new Input();
//         input3 = new Input();
//         input4 = new Input();
//         input5 = new Input();
//         input6 = new Input();
//         input7 = new Input();
//         input8 = new Input();
       
        database = new Database(file);
        neurons.add(neuron1);
        neurons.add(neuron2);
        neurons.add(neuron3);
        neurons.add(neuron4);
        neurons.add(neuron5);
        neurons.add(neuron6);
        neurons.add(neuron7);
        neurons.add(neuron8);
        neurons.add(neuron9);
        neurons.add(neuron10);
        neurons.add(neuron11);
        neurons.add(neuron12);
        neurons.add(neuron13);
        neurons.add(neuron14);
        neurons.add(neuron15);
        neurons.add(neuron16);
        neurons.add(neuron17);
        neurons.add(neuron18);
       try
       {
            for(Neuron temp : neurons)
            {
                double x = database.getWeight();
                temp.setWeight(x);
            }
        }catch (Exception e){
            System.err.println("Caught Exception: " +  e.getMessage());
            
        }
    
                

        
    }
    

    
    public Brain(double weight1, double weight2, double weight3, double weight4, double weight5,double weight6,
                 double weight7,double weight8,double weight9,double weight10, double weight11, double weight12, 
                 double weight13, double weight14, double weight15, double weight16, double weight17, double weight18)
    {
        input1 = new Input();
        input2 = new Input();
        input3 = new Input();
        input4 = new Input();
        input5 = new Input();
        input6 = new Input();
        input7 = new Input();
        input8 = new Input();
        
        neuron1.setWeight(weight1);
        neuron2.setWeight(weight2);
        neuron3.setWeight(weight3);
        neuron4.setWeight(weight4);
        neuron5.setWeight(weight5);
        neuron6.setWeight(weight6);
        neuron7.setWeight(weight7);
        neuron8.setWeight(weight8);
        neuron9.setWeight(weight9);
        neuron10.setWeight(weight10);
        neuron11.setWeight(weight11);
        neuron12.setWeight(weight12);
        neuron13.setWeight(weight13);
        neuron14.setWeight(weight14);
        neuron15.setWeight(weight15);
        neuron16.setWeight(weight16);
        neuron17.setWeight(weight17);
        neuron18.setWeight(weight18);
        
        neurons.add(neuron1);
        neurons.add(neuron2);
        neurons.add(neuron3);
        neurons.add(neuron4);
        neurons.add(neuron5);
        neurons.add(neuron6);
        neurons.add(neuron7);
        neurons.add(neuron8);
        neurons.add(neuron9);
        neurons.add(neuron10);
        neurons.add(neuron11);
        neurons.add(neuron12);
        neurons.add(neuron13);
        neurons.add(neuron14);
        neurons.add(neuron15);
        neurons.add(neuron16);
        neurons.add(neuron17);
        neurons.add(neuron18);
        
        
        
    }
    
    
    
    public void activateNeurons()
    {
        Input result = new Input();
        for(Input input : inputs)
        {
            if (input.getInput() < 1)
            {
                double r = neuron1.fire(input.getInput());
                result.setInput(r);
            }
            
           if (input.getInput() < 30 && input.getInput() >= 1)
            {
                double r = neuron2.fire(input.getInput());
                result.setInput(r);
            }
            
            if (input.getInput() < 35 && input.getInput() >= 30)
            {
                double r = neuron3.fire(input.getInput());
                result.setInput(r);
            }
            
            if (input.getInput() < 40 && input.getInput() >= 35)
            {
                double r = neuron4.fire(input.getInput());
                result.setInput(r);
            }
            
            if (input.getInput() < 45 && input.getInput() >= 40)
            {
                double r = neuron5.fire(input.getInput());
                result.setInput(r);
            }
            
            if (input.getInput() < 55 && input.getInput() >= 50)
            {
                double r = neuron6.fire(input.getInput());
                result.setInput(r);
            }
            
            if (input.getInput() < 65 && input.getInput() >= 60)
            {
                double r = neuron7.fire(input.getInput());
                result.setInput(r);
            }
            
            if (input.getInput() < 70 && input.getInput() >= 65)
            {
                double r = neuron8.fire(input.getInput());
                result.setInput(r);
            }
            
            if (input.getInput() < 75 && input.getInput() >= 70)
            {
                double r = neuron9.fire(input.getInput());
                result.setInput(r);
            }
            
            if (input.getInput() < 80 && input.getInput() >= 75)
            {
                double r = neuron10.fire(input.getInput());
                result.setInput(r);
            }
            
            if (input.getInput() < 85 && input.getInput() >= 80)
            {
                double r = neuron11.fire(input.getInput());
                result.setInput(r);
            }
            
            if (input.getInput() < 90 && input.getInput() >= 85)
            {
                double r = neuron12.fire(input.getInput());
                result.setInput(r);
            }
            
            if (input.getInput() < 100 && input.getInput() >= 90)
            {
                double r = neuron13.fire(input.getInput());
                result.setInput(r);
            }
            
            if (input.getInput() < 110 && input.getInput() >= 100)
            {
                double r = neuron14.fire(input.getInput());
                result.setInput(r);
            }
            
            if (input.getInput() < 130 && input.getInput() >= 110)
            {
                double r = neuron15.fire(input.getInput());
                result.setInput(r);
            }
            
            if (input.getInput() < 1000 && input.getInput() >= 130)
            {
                double r = neuron16.fire(input.getInput());
                result.setInput(r);
            }
            
            if (input.getInput() < 2000 && input.getInput() >= 1000)
            {
                double r = neuron17.fire(input.getInput());
                result.setInput(r);
            }
            
            if (input.getInput() > 2000)
            {
                double r = neuron18.fire(input.getInput());
                result.setInput(r);
            }
            
            results.push(result.getInput());
        }
       
        
    }
    
    public void feedBrain(Input input1,Input input2, Input input3, Input input4,Input input5,Input input6,Input input7,Input input8)
    {
        inputs.clear();
        while(results.empty() == false)
        {
            results.pop();
        }
        this.input1 = input1;
        this.input2 = input2;
        this.input3 = input3;
        this.input4 = input4;
        this.input5 = input5;
        this.input6 = input6;
        this.input7 = input7;
        this.input8 = input8;
        inputs.addLast(input1);
        inputs.addLast(input2);
        inputs.addLast(input3);
        inputs.addLast(input4);
        inputs.addLast(input5);
        inputs.addLast(input6);
        inputs.addLast(input7);
        inputs.addLast(input8);
        activateNeurons();
    }
    
    public void feedBrain(Input input1,Input input2)
    {
        inputs.clear();
        while(results.empty() == false)
        {
            results.pop();
        }
        this.input1 = input1;
        this.input2 = input2;
       
       
        inputs.addLast(input1);
        inputs.addLast(input2);
        
        activateNeurons();
    }
    
    public void feedBrain(Input input1,Input input2, Input input3)
    {
        inputs.clear();
        while(results.empty() == false)
        {
            results.pop();
        }
        this.input1 = input1;
        this.input2 = input2;
        this.input3 = input3;
       
        inputs.addLast(input1);
        inputs.addLast(input2);
        inputs.addLast(input3);
        activateNeurons();
    }
    
     public void feedBrain(Input input1,Input input2, Input input3, Input input4)
    {
        inputs.clear();
        while(results.empty() == false)
        {
            results.pop();
        }
        this.input1 = input1;
        this.input2 = input2;
        this.input3 = input3;
        this.input4 = input4;
       
        inputs.addLast(input1);
        inputs.addLast(input2);
        inputs.addLast(input3);
        inputs.addLast(input3);
        activateNeurons();
    }
    
    public MyStack getResults()
    {
        MyStack temp = new MyStack();
        while(results.empty() == false)
        {
            temp.push(results.pop());
        }
        
        return temp;
    }
    
    public void neuronShuffle()
    {

        Random tempRand = new Random();
        int binary = tempRand.nextInt(2);
        for(Neuron temp : neurons)
        {
            
            if (temp.getState() == 1)
            {
                if(binary == 1)
                {
                    temp.increaseWeight();
                }
                
                else
                {
                    temp.reduceWeight();
                }
            }
        }
        
    }
    
    public LinkedList getNeurons()
    {
        LinkedList<Neuron> usedNeurons = new LinkedList<Neuron>();
        
        for(Neuron temp : neurons)
        {
            
            if (temp.getState() == 1)
            {
                usedNeurons.add(temp);
            }
        }
        
        return usedNeurons;
    }
    
    public void saveWeights() throws IOException
    {
        for(Neuron temp : neurons)
        {
            database.saveWeight(temp.getWeight());
        }
    }
 
}
