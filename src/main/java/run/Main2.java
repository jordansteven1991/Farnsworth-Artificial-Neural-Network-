package run;

import java.io.IOException;
import java.util.List;

import com.mashape.unirest.http.exceptions.UnirestException;

import core.Farnsworth;
import domain.Team;

public class Main2 {

	public static void main(String[] args) throws IOException, UnirestException {
		Farnsworth farnsworth = new Farnsworth();
		List<Team> teams = farnsworth.getTeams();
		
		//for(Team team: teams) {
		//	System.out.println(team.getRank() + "." + team.getName());
		//}

	}

}
