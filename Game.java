/**
 * @Steven Jordan
 * @01/24/15
 */
public class Game
{
    
    private Team team1;
    private Team team2;
    private String winner = "You lose!  You get nothing!";

    /**
     * Constructor for objects of class Game
     */
    public Game(Team team1, Team team2, String winner)
    {
        this.team1 = team1;
        this.team2 = team2;
        this.winner = winner;
        
    }
    public Game(Team team1, Team team2)
    {
        this.team1 = team1;
        this.team2 = team2;
        
        
    }


   
    public Team getTeam1()
    {
        return team1;
    }
    
    public Team getTeam2()
    {
        return team2;
    }
    
    public String getWinner()
    {
        return winner;
    }
    
    public void setWinner(String winner)
    {
        this.winner = winner;
    }
}
