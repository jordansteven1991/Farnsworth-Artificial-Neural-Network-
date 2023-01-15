package run;
import java.io.*;
import java.util.*;

import com.mashape.unirest.http.exceptions.UnirestException;

import core.Farnsworth;
import domain.Game;
import domain.Team;

/**
 * @Steven Jordan @02/04/2015
 * 
 * cleanup started 11/26/2022
 */
public class Trainer {
	public static void main(String[] args) throws IOException, UnirestException {
		

		Farnsworth farnsworth = new Farnsworth();
		
		List<Team> teams = farnsworth.getTeams();
		
		Map<Team, Team> pairedTeams = new HashMap<>();
		List<Game> games = new ArrayList<Game>();
		
		for(Team currTeam : teams) {
			//we have not seen this team before
			if(!pairedTeams.containsKey(currTeam)) {
				Team currOpponent = farnsworth.findOpponent(currTeam);
				if(currOpponent == null) {
					pairedTeams.put(currTeam, new Team());
				}
				//we have not seen this opponent already either
				if(!pairedTeams.containsKey(currOpponent)) {
					pairedTeams.put(currTeam, currOpponent);
					games.add(new Game(currTeam, currOpponent));
				}
			}
		}

		

		int bestRun = 47;
		int gamesRight = 0;

//      boolean right = false;

		for (int z = 0; z < 9999; z++) {
			for (Game temp : games) {
				//farnsworth.makeMadness(temp);

				Team team1 = temp.getTeam1();
				Team team2 = temp.getTeam2();

			
				String winner = farnsworth.predictWinner(team1, team2);
				if (winner.equals(temp.getWinner())) {

					gamesRight++;

				}

				else {
					farnsworth.weightShuffle();
				}


				if (gamesRight > bestRun) {
					farnsworth.saveWeights();
					bestRun = gamesRight;
				}

			}



			System.out.println("Games right: ");
			System.out.println(gamesRight + "\n");

			gamesRight = 0;
		}

		System.out.println("Best Run: ");
		System.out.println(bestRun + "\n");



	}
}
