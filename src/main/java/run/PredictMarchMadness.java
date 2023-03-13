package run;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.fasterxml.jackson.databind.MappingIterator;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.csv.CsvSchema;

import core.Farnsworth;
import domain.Game;
import domain.Team;

public class PredictMarchMadness {

	public static void main(String[] args) throws IOException {

		Farnsworth farnsworth = new Farnsworth();
		ObjectMapper mapper = new CsvMapper();

		CsvSchema schema = CsvSchema.emptySchema().withHeader();

		String content = new String(Files.readAllBytes(Paths.get("C:/Users/jorda/Documents/TeamsToPlay.csv")));
		MappingIterator<Team> it = mapper.readerFor(Team.class).with(schema).readValues(content);
		List<Team> teams = it.readAll();
		List<Team> westBracket = new ArrayList<>();
		List<Team> eastBracket = new ArrayList<>();
		List<Team> midwestBracket = new ArrayList<>();
		List<Team> southBracket = new ArrayList<>();

		for (int i = 0; i < teams.size(); i++) {
			Team team = teams.get(i);
			if (team.getBracket().toLowerCase().equals("west")) {
				westBracket.add(team.getSeed()-1, team);
			} else if (team.getBracket().toLowerCase().equals("east")) {
				eastBracket.add(team.getSeed()-1, team);
			} else if (team.getBracket().toLowerCase().equals("south")) {
				southBracket.add(team.getSeed()-1, team);
			} else {
				midwestBracket.add(team.getSeed()-1, team);
			}

		}
		
		//set number of unique brackets to spit out
		int numOfUniqueBrackets = 7;
		int currentNumOfUniqueBrackets = 0;
		
		boolean isDone = false;
		
		List<String> completedBrackets = new ArrayList<>();
		
		while(!isDone) {
			//create list to capture winners
			List<Team> allWinners = new ArrayList<>();
			
			List<Team> westWinners = getBracketRegionWinners(westBracket, farnsworth);
			List<Team> eastWinners = getBracketRegionWinners(eastBracket, farnsworth);
			List<Team> southWinners = getBracketRegionWinners(southBracket, farnsworth);
			List<Team> midwestWinners = getBracketRegionWinners(midwestBracket, farnsworth);

			Team westWinner = westWinners.get(westWinners.size() - 1);
			Team eastWinner = eastWinners.get(eastWinners.size() - 1);
			Team southWinner = southWinners.get(southWinners.size() - 1);
			Team midwestWinner = midwestWinners.get(midwestWinners.size() - 1);

			Game finalFourGame1 = new Game(westWinner, eastWinner);
			Team finalTeam1 = farnsworth.predictGameReturnTeam(finalFourGame1, true);
			Game finalFourGame2 = new Game(southWinner, midwestWinner);
			Team finalTeam2 = farnsworth.predictGameReturnTeam(finalFourGame2, true);

			Game finale = new Game(finalTeam1, finalTeam2);
			Team marchMadnessWinner = farnsworth.predictGameReturnTeam(finale, true);
			
			//collect winners
			allWinners.addAll(westBracket);
			allWinners.addAll(eastBracket);
			allWinners.addAll(southWinners);
			allWinners.addAll(midwestBracket);
			allWinners.add(finalTeam1);
			allWinners.add(finalTeam2);
			allWinners.add(marchMadnessWinner);
			
			String completionString = allWinners.stream().map(Object::toString)
                    .collect(Collectors.joining(", "));
			
			//add only unique results
			if(!completedBrackets.contains(completionString)) {
				completedBrackets.add(completionString);
				currentNumOfUniqueBrackets++;
			}
			
			//stop looping when we have 
			if(currentNumOfUniqueBrackets == numOfUniqueBrackets) {
				isDone = true;
			}
		}
		
		for(String bracket : completedBrackets) {
			System.out.println(bracket);
		}

		

	}

	private static List<Team> getBracketRegionWinners(List<Team> bracketRegion, Farnsworth farnsworth) {

		// collect all winners to compare each bracket iteration
		List<Team> winners = new ArrayList<>();

		// round 1
		Game game1 = new Game(bracketRegion.get(0), bracketRegion.get(15));
		Team game1Winner = farnsworth.predictGameReturnTeam(game1, true);
		winners.add(game1Winner);

		Game game2 = new Game(bracketRegion.get(7), bracketRegion.get(8));
		Team game2Winner = farnsworth.predictGameReturnTeam(game2, true);
		winners.add(game2Winner);

		Game game3 = new Game(bracketRegion.get(4), bracketRegion.get(11));
		Team game3Winner = farnsworth.predictGameReturnTeam(game3, true);
		winners.add(game3Winner);

		Game game4 = new Game(bracketRegion.get(3), bracketRegion.get(12));
		Team game4Winner = farnsworth.predictGameReturnTeam(game4, true);
		winners.add(game4Winner);

		Game game5 = new Game(bracketRegion.get(5), bracketRegion.get(10));
		Team game5Winner = farnsworth.predictGameReturnTeam(game5, true);
		winners.add(game5Winner);

		Game game6 = new Game(bracketRegion.get(2), bracketRegion.get(13));
		Team game6Winner = farnsworth.predictGameReturnTeam(game6, true);
		winners.add(game6Winner);

		Game game7 = new Game(bracketRegion.get(6), bracketRegion.get(9));
		Team game7Winner = farnsworth.predictGameReturnTeam(game7, true);
		winners.add(game7Winner);

		Game game8 = new Game(bracketRegion.get(1), bracketRegion.get(14));
		Team game8Winner = farnsworth.predictGameReturnTeam(game8, true);
		winners.add(game8Winner);

		// round 2
		Game game9 = new Game(game1Winner, game2Winner);
		Team game9Winner = farnsworth.predictGameReturnTeam(game9, true);
		winners.add(game9Winner);

		Game game10 = new Game(game3Winner, game4Winner);
		Team game10Winner = farnsworth.predictGameReturnTeam(game10, true);
		winners.add(game10Winner);

		Game game11 = new Game(game5Winner, game6Winner);
		Team game11Winner = farnsworth.predictGameReturnTeam(game11, true);
		winners.add(game11Winner);

		Game game12 = new Game(game7Winner, game8Winner);
		Team game12Winner = farnsworth.predictGameReturnTeam(game12, true);
		winners.add(game12Winner);

		// round 3
		Game game13 = new Game(game9Winner, game10Winner);
		Team game13Winner = farnsworth.predictGameReturnTeam(game13, true);
		winners.add(game13Winner);

		Game game14 = new Game(game11Winner, game12Winner);
		Team game14Winner = farnsworth.predictGameReturnTeam(game14, true);
		winners.add(game14Winner);

		// round 4
		Game game15 = new Game(game13Winner, game14Winner);
		Team game15Winner = farnsworth.predictGameReturnTeam(game15, true);
		winners.add(game15Winner);

		// get winner
		return winners;
	}

}
