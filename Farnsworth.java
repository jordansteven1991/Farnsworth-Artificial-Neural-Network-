import java.util.*;
import java.io.*;
/**
 * @Steven Jordan
 * @02/01/2015
 */
public class Farnsworth
{
    
    private Brain brain1;
    private Brain brain2;
    private Brain brain3;
    private Brain brain4;
    private File file1 = new File("C:/Users/The Ledgend/Desktop/Farnsworth 2.0/weights1.txt");
    private File file2 = new File("C:/Users/The Ledgend/Desktop/Farnsworth 2.0/weights2.txt");
    private File file3 = new File("C:/Users/The Ledgend/Desktop/Farnsworth 2.0/weights3.txt");
    
    private int[]madnessFactor = new int[64];
  
    //private String winner = "You lose!  You get nothing!";

    
    public Farnsworth() throws IOException
    {
        brain1 = new Brain(file1);
        brain2 = new Brain(file2);
        brain3 = new Brain(file3);
        //brain4 = new Brain();
        
    }
    
    public void compareTeams(Team team1, Team team2)
    {
        Input ppg1 = new Input(team1.getPpg());
        Input ppg2 = new Input(team2.getPpg());
        Input ft1 = new Input(team1.getFt());
        Input ft2 = new Input(team2.getFt());
        Input AdjO1 = new Input(team1.getAdjO());
        Input AdjO2 = new Input(team2.getAdjO());
        Input AdjD1 = new Input(team1.getAdjD());
        Input AdjD2 = new Input(team2.getAdjD());
        Input fg1 = new Input(team1.getFg());
        Input fg2 = new Input(team2.getFg());
        Input pyth1 = new Input(team1.getPyth());
        Input pyth2 = new Input(team2.getPyth());
        Input rank1 = new Input(team1.getRank());
        Input rank2 = new Input(team2.getRank());
        Input luck1 = new Input(team1.getLuck());
        Input luck2 = new Input(team2.getLuck());
        Input tp1 = new Input(team1.getTp());
        Input tp2 = new Input(team2.getTp());
        
        brain1.feedBrain(AdjO1,ft1,pyth1);
        brain2.feedBrain(ppg1,fg1,luck1,tp1);
        brain3.feedBrain(AdjD1,rank1,pyth2);
        
        MyStack results1 = brain1.getResults();
        MyStack results2 = brain2.getResults();
        MyStack results3 = brain3.getResults();
        
        
        
        brain1.feedBrain(AdjO2,ft2,pyth2);
        brain2.feedBrain(ppg2,fg2,luck2,tp2);
        brain3.feedBrain(AdjD2,rank2,pyth1);
        
        MyStack results4 = brain1.getResults();
        MyStack results5 = brain2.getResults();
        MyStack results6 = brain3.getResults();
       
        double temp = 0;
        double temp2 = 1;
        
        while(results1.empty() == false)
        {
            double x = results1.pop();
            temp = temp + x;
        }
     
        while(results2.empty() == false)
        {
            double x = results2.pop();
            temp = temp + x;
        }
        
        while(results3.empty() == false)
        {
            double x = results3.pop();
            temp = temp - x;
        }

        team1.addToTotalScore(temp);

        
        while(results4.empty() == false)
        {
            double x = results4.pop();
            temp2 = temp2 + x;
        }
        
        while(results5.empty() == false)
        {
            double x = results5.pop();
            temp2 = temp + x;
        }
        
        while(results6.empty() == false)
        {
            double x = results6.pop();
            temp2 = temp2 - x;
        }
        
        team2.addToTotalScore(temp2);
    }
    
    public String predictWinner(Team team1, Team team2)
    {
        if(team1.getTotalScore() > team2.getTotalScore())
        {
            return team1.toString();
            
        }
        else
        {
            return team2.toString();
        }
    }
    
    public void weightShuffle()
    {
        brain1.neuronShuffle();
        brain2.neuronShuffle();
        brain3.neuronShuffle();
    }
    
    public void saveWeights() throws IOException
    {
        brain1.saveWeights();
        brain2.saveWeights();
        brain3.saveWeights();
    }
    
    public void makeMadness(Game game)
    {
        Team team1 = game.getTeam1();
        Team team2 = game.getTeam2();
        
        double ppg1 = team1.getPpg();
        double ppg2 = team2.getPpg();
        double luck1 = team1.getLuck();
        double luck2 = team2.getLuck();
        
        Random rand1 = new Random();
        Random rand2 = new Random();
        
        double total1 = ppg1 * rand1.nextInt(100);
        double total2 = ppg2 * rand2.nextInt(100);
        
        team1.setTotalScore(total1);
        team2.setTotalScore(total2);
    }
//     public Stack getNeurons()
//     {
//        
//     }
        

   
}
