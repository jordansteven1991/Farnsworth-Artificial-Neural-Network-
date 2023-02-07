package run;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.databind.MappingIterator;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.csv.CsvSchema;

import core.Farnsworth;
import domain.Game;
import domain.Team;

public class TrainFromCsv {

	public static void main(String[] args) throws IOException {

		ObjectMapper mapper = new CsvMapper();

		Farnsworth farnsworth = new Farnsworth();

		CsvSchema schema = CsvSchema.emptySchema().withHeader();

		String content = new String(Files.readAllBytes(Paths.get("C:/Users/jorda/Documents/TeamsToPlay.csv")));
		MappingIterator<Team> it = mapper.readerFor(Team.class).with(schema).readValues(content);
		List<Team> teams = it.readAll();

		// after finding winners, create games so we can adjust weights and look at
		// predictions again without finding the winners again
		List<Game> gamesToTrain = new ArrayList<>();

		for (int i = 0; i < teams.size() - 1; i = i + 2) {
			Team team1 = teams.get(i);
			Team team2 = teams.get(i + 1);

			String winnerName = farnsworth.findWinner(team1, team2);
			// if no winner is found it's likely the game hasn't been played yet and should
			// be skipped
			if (winnerName == null) {
				continue;
			}

			gamesToTrain.add(new Game(team1, team2, winnerName));

		}

		// set the number to beat when training
		int bestRun = 115;
		int currentBestRun = 0;

		// set number of times to train the list of games
		int trainingSets = 80000;

		// number of games to check in case you only want to do more standard teams
		int numOfGames = gamesToTrain.size();

		for (int i = 0; i < trainingSets; i++) {
			farnsworth.weightShuffle();
			//pass true to add random chance
			farnsworth.predictFromCsv(false);
			List<String> predictLog = Files.readAllLines(Paths.get("C:/Users/jorda/Documents/predictions.txt"));
			int numberOfCorrectPicks = 0;

			for (int j = 0; j < numOfGames; j++) {
				Game game = gamesToTrain.get(j);
				if (predictLog.contains("Winner: " + game.getWinner().trim())) {
					numberOfCorrectPicks++;
				}
			}

			System.out.println("numberOfCorrectPicks: " + numberOfCorrectPicks);
			if (numberOfCorrectPicks > currentBestRun) {
				currentBestRun = numberOfCorrectPicks;

				if (currentBestRun > bestRun) {
					System.out.println("Current run is higher than best run.  Saving weights");
					farnsworth.saveWeights();
				}
			}
		}

		System.out.println("Number of Games Checked: " + numOfGames);
		System.out.println("Best Number of correct games: " + currentBestRun);

	}

}
