package run;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.csv.CsvSchema;
import com.mashape.unirest.http.exceptions.UnirestException;

import core.Farnsworth;
import domain.Team;

public class saveTeamsToCsv {

	public static void main(String[] args) throws IOException, UnirestException {

		Farnsworth farnsworth = new Farnsworth();
		List<Team> teams = farnsworth.getTeams();
		List<Team> csvTeams = new ArrayList<>();
		Map<Team, Team> teamsProcessed = new HashMap<>();

		for (Team team : teams) {
			Team opponent = farnsworth.findOpponent(team);
			if(!teamsProcessed.containsKey(opponent)) {
				csvTeams.add(team);
				csvTeams.add(opponent);
				teamsProcessed.put(team, opponent);
			}
			
		}
		
		// set correct directory as output
        File csvOutputFile = new File("C:/Users/jorda/Documents/TeamsToPlay.csv");
        
        csvTeams.add(new Team());

        

        CsvMapper mapper = new CsvMapper();
        mapper.configure(JsonGenerator.Feature.IGNORE_UNKNOWN, true);
        CsvSchema schema = CsvSchema.builder().setUseHeader(true)
                .addColumn("name")
                .addColumn("statsUrl")
                .addColumn("ppg")
                .addColumn("ft")
                .addColumn("AdjO")
                .addColumn("AdjD")
                .addColumn("fg")
                .addColumn("pyth")
                .addColumn("rank")
                .addColumn("luck")
                .addColumn("sos")
                .addColumn("tp")
                .addColumn("conference")
                .addColumn("bracket")
                .addColumn("totalScore")
                .build();

        ObjectWriter writer = mapper.writerFor(Team.class).with(schema);

        writer.writeValues(csvOutputFile).writeAll(csvTeams);

        System.out.println("Users saved to csv file under path: " + csvOutputFile.getAbsolutePath());

		
		

	}

}
