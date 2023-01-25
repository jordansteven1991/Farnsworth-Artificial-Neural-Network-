package run;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import com.fasterxml.jackson.databind.MappingIterator;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.csv.CsvSchema;

import core.Farnsworth;
import domain.Team;

public class predictFromCsv {

	public static void main(String[] args) throws IOException {

		File file = new File("C:/Users/jorda/Documents/predictions.txt");
		PrintStream stream = new PrintStream(file);

		System.out.println("From now on " + file.getAbsolutePath() + " will be your console");
		System.setOut(stream);

		ObjectMapper mapper = new CsvMapper();

		Farnsworth farnsworth = new Farnsworth();

		CsvSchema schema = CsvSchema.emptySchema().withHeader();

		String content = new String(Files.readAllBytes(Paths.get("C:/Users/jorda/Documents/TeamsToPlay.csv")));
		MappingIterator<Team> it = mapper.readerFor(Team.class).with(schema).readValues(content);
		List<Team> teams = it.readAll();

		for (int i = 0; i < teams.size() - 1; i = i + 2) {
			Team team1 = teams.get(i);
			Team team2 = teams.get(i + 1);
			farnsworth.compareTeams(team1, team2);
			String winner = farnsworth.predictWinner(team1, team2);
			String name1 = team1.toString();
			String name2 = team2.toString();
			double total1 = team1.getTotalScore();
			double total2 = team2.getTotalScore();
			System.out.println(name1 + ": " + total1);
			System.out.println(name2 + ": " + total2);
			System.out.println(winner);
		}

	}

}
