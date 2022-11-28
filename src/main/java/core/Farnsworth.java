package core;

import java.util.*;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

import domain.Brain;
import domain.Game;
import domain.Input;
import domain.Team;
import domain.MyStack;
import util.CbsLookup;

import java.io.*;

/**
 * @Steven Jordan @02/01/2015
 * 
 *         cleanup started 11/26/2022
 */
public class Farnsworth {

	private Brain brain1;
	private Brain brain2;
	private Brain brain3;

	private File file1 = new File("weights1.txt");
	private File file2 = new File("weights2.txt");
	private File file3 = new File("weights3.txt");

	// private String winner = "You lose! You get nothing!";

	public Farnsworth() throws IOException {
		brain1 = new Brain(file1);
		brain2 = new Brain(file2);
		brain3 = new Brain(file3);
		// brain4 = new Brain();

	}

	public void compareTeams(Team team1, Team team2) {
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

		brain1.feedBrain(AdjO1, ft1, pyth1);
		brain2.feedBrain(ppg1, fg1, luck1, tp1);
		brain3.feedBrain(AdjD1, rank1, pyth2);

		MyStack results1 = brain1.getResults();
		MyStack results2 = brain2.getResults();
		MyStack results3 = brain3.getResults();

		brain1.feedBrain(AdjO2, ft2, pyth2);
		brain2.feedBrain(ppg2, fg2, luck2, tp2);
		brain3.feedBrain(AdjD2, rank2, pyth1);

		MyStack results4 = brain1.getResults();
		MyStack results5 = brain2.getResults();
		MyStack results6 = brain3.getResults();

		double temp = 0;
		double temp2 = 1;

		while (results1.empty() == false) {
			double x = results1.pop();
			temp = temp + x;
		}

		while (results2.empty() == false) {
			double x = results2.pop();
			temp = temp + x;
		}

		while (results3.empty() == false) {
			double x = results3.pop();
			temp = temp - x;
		}

		team1.addToTotalScore(temp);

		while (results4.empty() == false) {
			double x = results4.pop();
			temp2 = temp2 + x;
		}

		while (results5.empty() == false) {
			double x = results5.pop();
			temp2 = temp + x;
		}

		while (results6.empty() == false) {
			double x = results6.pop();
			temp2 = temp2 - x;
		}

		team2.addToTotalScore(temp2);
	}

	public String predictWinner(Team team1, Team team2) {
		compareTeams(team1, team2);
		if (team1.getTotalScore() > team2.getTotalScore()) {
			return team1.toString();

		} else {
			return team2.toString();
		}
	}

	public void weightShuffle() {
		brain1.neuronShuffle();
		brain2.neuronShuffle();
		brain3.neuronShuffle();
	}

	public void saveWeights() throws IOException {
		brain1.saveWeights();
		brain2.saveWeights();
		brain3.saveWeights();
	}

	public void makeMadness(Game game) {
		Team team1 = game.getTeam1();
		Team team2 = game.getTeam2();

		double ppg1 = team1.getPpg();
		double ppg2 = team2.getPpg();

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

	public List<Team> getTeams() throws IOException, UnirestException {
		Unirest.setTimeouts(0, 0);
		HttpResponse<String> response = Unirest.get("http://kenpom.com").asString();
		Document doc = Jsoup.parse(response.getBody());
		Element table = doc.getElementById("ratings-table");
		Elements bodyContents = table.getElementsByTag("tbody");
		List<Team> teams = new ArrayList<>();
		for (Element rows : bodyContents) {
			Elements trRows = rows.getElementsByTag("tr");
			for (Element rawTeam : trRows) {
				Elements rawTeamFields = rawTeam.getElementsByTag("td");
				Team team = new Team();
				String rankString = rawTeamFields.get(0).html();
				team.setRank(Double.parseDouble(rankString));
				String teamName = rawTeamFields.get(1).getElementsByTag("a").get(0).html();
				team.setName(teamName);
				String conf = rawTeamFields.get(2).getElementsByTag("a").get(0).html();
				team.setConference(conf);
				String adjO = rawTeamFields.get(5).html();
				team.setAdjO(Double.parseDouble(adjO));
				String adjD = rawTeamFields.get(7).html();
				team.setAdjD(Double.parseDouble(adjD));
				String luck = rawTeamFields.get(11).html().replace("+", "");
				team.setLuck(Double.parseDouble(luck));

				// add cbs sports stats
				String baseUrl = "https://www.cbssports.com/college-basketball/teams/%s/%s/stats/";
				String url = "";
				for (CbsLookup value : CbsLookup.values()) {
					if (value.getKey().toLowerCase().equals(team.getName().toLowerCase())) {
						url = String.format(baseUrl, value.name(), value.getValue());
						break;
					}
				}

				HttpResponse<String> cbsResponse = Unirest.get(url).asString();
				Document doc2 = Jsoup.parse(cbsResponse.getBody());

				Element teamStats = doc2
						.getElementsByClass("TableBase-bodyTr TableBase-bodyTr--total TableBase-bodyTr--totalFirst")
						.get(0);
				Elements teamStatFields = teamStats.getElementsByTag("td");
				String ppg = teamStatFields.get(4).html();
				String fg = teamStatFields.get(7).html();
				String tp = teamStatFields.get(10).html();
				String ft = teamStatFields.get(13).html();
				team.setPpg(Double.parseDouble(ppg));
				team.setFg(Double.parseDouble(fg));
				team.setTp(Double.parseDouble(tp));
				team.setFt(Double.parseDouble(ft));
				teams.add(team);
			}
		}

		return teams;
	}

	public Team findOpponent(Team currTeam) {
		// TODO Auto-generated method stub
		return null;
	}

}
