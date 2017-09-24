/**
 * @Steven Jordan
 * @01/24/15
 */
public class Team
{
   
    private double ppg;                      //Points per game
    private double ft;                       //Free throw percentage
    private double AdjO;                    //Adjusted Offense- points scored per 100 possesions 
    private double AdjD;                    //Adjusted defense- points allowed per 100 possesions
    private double fg;                     //Field goal percentage
    private double pyth;                   //Expected winning percentage
    private double rank;                      //Ap rank
    private double luck;                   //Actual winning percentage - expected one... Do you feel lucky, punk?
    private double sos;                    //Strength of Schedule
    private String name;                   //Team name
    private String conference;
    private String bracket;
    private double totalScore;            //For calculating best overall team
    private double tp;                    //Three point percentage
    

    /**
     * Constructor for objects of class Team
     */
    
    public Team()
    {
        ppg = 0;
        ft = 0;
        AdjO = 0;
        AdjD = 0;
        fg = 0;
        pyth = 0;
        rank = 0;
        luck = 0;
        name = "Test";
        bracket = "Test";
        totalScore = 0;
        sos = 0;
    }
    
    public Team(double ppg, double ft, double AdjO, double AdjD, double fg, double pyth, double rank, double luck, String name, String conference, String bracket)
    {
        this.ppg = ppg;
        this.ft = ft;
        this.AdjO = AdjO;
        this.AdjD = AdjD;
        this.fg = fg;
        this.pyth = pyth;
        this.rank = rank;
        this.luck = luck;
        this.name = name;
        this.bracket = bracket;
        totalScore = 0;
        sos = 0;
        
        
    }
    
    public Team(double ppg, double ft, double AdjO, double AdjD, double fg, double pyth, double rank, double luck,  double tp, String name, String conference, String bracket)
    {
        this.ppg = ppg;
        this.ft = ft;
        this.AdjO = AdjO;
        this.AdjD = AdjD;
        this.fg = fg;
        this.pyth = pyth;
        this.rank = rank;
        this.luck = luck;
        this.name = name;
        this.bracket = bracket;
        totalScore = 0;
        this.tp = tp;
        
        
    }
    
    public void setTotalScore(double totalScore)
    {
        this.totalScore = totalScore;
    }
    
    public double getTotalScore()
    {
        return totalScore;
    }
    
    public void addToTotalScore(double temp)
    {
        totalScore = totalScore + temp;
    }
    
    public double getPpg()
    {
        return ppg;
    }
    
    public double getFt()
    {
        return ft;
    }
    
    public double getAdjO()
    {
        return AdjO;
    }
    
    public double getAdjD()
    {
        return AdjD;
    }
    
    public double getFg()
    {
        return fg;
    }
    
    public double getPyth()
    {
        return pyth;
    }
    
    public double getLuck()
    {
        return luck;
    }
    
    public double getRank()
    {
        return rank;
    }
    
    public double getSos()
    {
        return sos;
    }
    
    public double getTp()
    {
        return tp;
    }
    
    public String toString()
    {
        return name;
    }
    
    public String getConference()
    {
        return conference;
    }
    
    public String getBracket()
    {
        return bracket;
    }
    
    
   
}
