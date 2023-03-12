package domain;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * @Life of Sherba
 * @01/24/15
 */
@JsonPropertyOrder({"name", "statsUrl", "ppg", "ft", "AdjO", "AdjD", "fg", "pyth", "rank", "luck", "sos", "tp", "conference", "bracket", "totalScore", "team"})
public class Team implements Serializable
{
   
    private static final long serialVersionUID = 7885660292799095583L;
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
    private String statsUrl;
    private int seed;
    


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
        name = "BYE";
        bracket = "Test";
        totalScore = 0;
        sos = 0;
        seed = 0;
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
        seed = 0;
        
        
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
        seed = 0;
        
        
    }
    
    public int getSeed() {
		return seed;
	}

	public void setSeed(int seed) {
		this.seed = seed;
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
    
    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPpg(double ppg) {
		this.ppg = ppg;
	}

	public void setFt(double ft) {
		this.ft = ft;
	}

	public void setAdjO(double adjO) {
		AdjO = adjO;
	}

	public void setAdjD(double adjD) {
		AdjD = adjD;
	}

	public void setFg(double fg) {
		this.fg = fg;
	}

	public void setPyth(double pyth) {
		this.pyth = pyth;
	}

	public void setRank(double rank) {
		this.rank = rank;
	}

	public void setLuck(double luck) {
		this.luck = luck;
	}

	public void setSos(double sos) {
		this.sos = sos;
	}

	public void setConference(String conference) {
		this.conference = conference;
	}

	public void setBracket(String bracket) {
		this.bracket = bracket;
	}

	public void setTp(double tp) {
		this.tp = tp;
	}
	
	public String getStatsUrl() {
		return statsUrl;
	}

	public void setStatsUrl(String statsUrl) {
		this.statsUrl = statsUrl;
	}

    
    
   
}
