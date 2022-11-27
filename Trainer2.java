import java.io.*;
import java.util.*;

/**
 * @Steven Jordan @02/18/2015
 * 
 * cleanup started 11/26/2022
 */
public class Trainer2 {
	public static void main(String[] args) throws IOException {
		Team duke = new Team(80.3, 69.2, 120.6, 95.1, 49.8, .9391, 8, .065, 37.8, "Duke", "ACC", "East");
		Team virginia = new Team(68.3, 74.6, 117.8, 83.9, 47.3, .9803, 2, .62, "Virginia", "ACC", "East");

		Team usc = new Team(67.0, 65.1, 99.1, 98.5, 41.9, .5158, 153, .38, .5645, "USC", "Pac 12", "West");
		Team colorado = new Team(67.5, 72.6, 102.4, 93.6, 44.9, .7378, 76, -.81, .6061, "Colorado", "Pac 12", "West");

		Team auburn = new Team(68.7, 66.4, 103.6, 101.9, 41.0, .5479, 141, .024, 34.1, "Auburn", "SEC", "East");
		Team tennessee = new Team(64.6, 68.9, 105.1, 97.3, 43.6, .7084, 99, .057, 34.8, "Tennessee", "SEC", "East");

		// Team northCarolina = new Team(79.4,72.3,115.3,93.2,46.4,.9206,10,.01,"North
		// Carolina","ACC","East");
		Team northCarolina = new Team(78.3, 68.8, 114.2, 95.6, 47.1, .8857, 16, -.038, 32.8, "North Carolina", "ACC",
				"East");
		Team ohioState = new Team(80.0, 70.0, 113.8, 95.8, 50.9, .8791, 22, -.49, .5322, "Ohio State", "Big Ten",
				"East");
		Team maryland = new Team(72.5, 74.7, 109.3, 93.5, 44.5, .8572, 30, .90, .5786, "Maryland", "ACC", "East");

		Team lsu = new Team(75.5, 71.7, 105.0, 91.1, 45.9, .8372, 35, -.01, "LSU", "SEC", "Southern");

		Team southCarolina = new Team(67.7, 72.7, 101.0, 89.5, 41.7, .8004, 44, -.125, 29.8, "South Carolina", "SEC",
				"Southern");
		Team vandy = new Team(69.5, 71.1, 110.6, 98.7, 46.8, .7873, 48, -.123, 36.8, "Vandy", "SEC", "Southern");

		Team clemson = new Team(63.1, 65.1, 101.0, 94.9, 41.4, .6718, 103, .65, "Clemson", "ACC", "East");
		Team ncState = new Team(72.5, 67.4, 111.5, 100.3, 45, .7713, 57, -.066, 37.2, "NC State", "ACC", "East");

		Team notreDame = new Team(81.9, 72.3, 123.8, 100.7, 52.1, .9152, 13, .29, "Notre Dame", "ACC", "East");
		Team bostonC = new Team(65.0, 69.5, 103.6, 98.7, 43.4, .6358, 115, -.33, "Boston College", "ACC", "East");

		Team alabama = new Team(67.3, 72.7, 106.6, 94.6, 44.2, .7968, 47, -.008, 31.1, "Alabama", "SEC", "East");
		Team kentucky = new Team(74.3, 69.1, 114.6, 80.1, 45.7, .9839, 1, .59, "Kentucky", "SEC", "Southern");

		Team louisville = new Team(72.0, 66.6, 108.4, 87.0, 43.6, .9267, 10, .028, 30.4, "Louisville", "ACC", "East");
		Team georgia = new Team(69.9, 67.9, 107.1, 93.2, 44.9, .8306, 33, .019, 36.0, "Georgia", "SEC", "Southern");

		Team missState = new Team(62.8, 69.6, 100.2, 100, 42.9, .5054, 159, -.008, 31.9, "Miss St", "SEC", "Southern");

		Team arkansas = new Team(80.3, 72.8, 112.2, 96.8, 45.3, .8451, 29, .012, 35.7, "Arkansas", "SEC", "Southern");

		Team syracuse = new Team(69.6, 65.2, 104.2, 95.5, 44.0, .7306, 78, -.013, 31.1, "Syracuse", "ACC", "East");

		Team baylor = new Team(70.0, 66.9, 114.9, 93.9, 43.4, .9113, 13, -.019, 37.1, "Baylor", "Big 12", "Mid West");

		Team kansas = new Team(72.2, 70.2, 114.2, 91.6, 44.2, .9271, 10, .136, 40.9, "Kansas", "Big 12", "Mid West");

		Team vcu = new Team(73.7, 63.2, 109.4, 93.0, 43.3, .8661, 24, .072, 35.3, "VCU", "Atlantic 10", "East");
		Team georgeWash = new Team(67.7, 67.9, 103.6, 94.4, 44.6, .7442, 71, .077, 32.3, "George Washington",
				"Atlantic 10", "East");

		Team okSt = new Team(68.0, 71.7, 108.3, 90.6, 43.6, .8855, 18, .013, 33.3, "Oklahoma State", "Big 12",
				"Mid West");
		Team tcu = new Team(69.2, 59.7, 102.4, 92.3, 43.9, .7678, 61, -.080, 33.6, "TCU", "Big 12", "Mid West");

		Team villanova = new Team(74.8, 70.6, 115.9, 90.3, 46.4, .9463, 7, .028, 36.8, "Villanova", "Big East",
				"Mid West");
		Team butler = new Team(71.8, 67.4, 108.3, 90.7, 44.4, .8839, 19, .008, 34.9, "Butler", "Big East", "Mid West");

		Team wvu = new Team(75.6, 65.7, 107.9, 91.7, 41.2, .8655, 24, .048, 29.4, "WVU", "Not Sure", "East");
		Team iowaState = new Team(80.0, 68.8, 118.0, 99.2, 48.8, .8810, 20, -.007, 35.8, "Iowa State", "Big Ten",
				"East");

		Team oleMiss = new Team(74.3, 79.4, 114.4, 98.9, 43.8, .8419, 30, -.042, 34.5, "Ole Miss", "SEC", "Southern");

		Team miami = new Team(68.6, 73.0, 109.6, 99.2, 43.6, .7605, 62, .009, 35.6, "Miami", "ACC", "East");
		Team rice = new Team(62.4, 72.7, 97.7, 104.2, 40.9, .3250, 247, -.009, 35.4, "Rice", "CUSA", "Mid West");

		Team harvard = new Team(64.2, 71.3, 102.0, 94.5, 43.5, .7059, 78, .114, 35.3, "Harvard", "Ivy league", "West");
		Team yale = new Team(67.6, 71.1, 104.7, 96.5, 44.4, .7206, 74, .029, 37, "Yale", "IVY League", "NA");
		;
		Team txso = new Team(68.2, 66.2, 101.7, 104.9, 44.4, .4111, 207, .131, 32.0, "Texas Southern", "???", "West");

		Farnsworth farnsworth = new Farnsworth();
		// Game game1 = new Game(virginia,duke,"Duke");
//         Game game1 = new Game(baylor,kansas,"Kansas");
//         Game game2 = new Game(kansas,baylor,"Kansas");
//         Game game3 = new Game(baylor,kansas,"Kansas");
//         Game game4 = new Game(kansas,baylor,"Kansas");
//         Game game5 = new Game(baylor,kansas,"Kansas");
//         Game game6 = new Game(kansas,baylor,"Kansas");

		for (int i = 0; i < 5; i++) {

			Game game1 = new Game(txso, yale, "Yale");
			Game game2 = new Game(yale, txso, "Yale");
//         Game game3 = new Game(vcu,georgeWash,"VCU");
//         Game game4 = new Game(georgeWash,vcu,"VCU");
//         Game game5 = new Game(auburn,georgia,"Auburn");
//         Game game6 = new Game(georgia,auburn,"Auburn");
//         Game game7 = new Game(tcu,okSt,"TCU");
//         Game game8 = new Game(okSt,tcu,"TCU");
//         Game game9 = new Game(iowaState,wvu,"Iowa State");
//         Game game10 = new Game(wvu,iowaState,"Iowa State");
//         Game game11 = new Game(duke,syracuse,"Duke");
//         Game game12 = new Game(syracuse,duke,"Duke");
//         Game game13 = new Game(arkansas,oleMiss,"Arkansas");
//         Game game14 = new Game(oleMiss,arkansas,"Arkansas");
//         Game game15 = new Game(alabama,vandy,"Vandy");
//         Game game16 = new Game(vandy,alabama,"Vandy");
//         Game game17 = new Game(villanova,butler,"Villanova");
//         Game game18 = new Game(butler,villanova,"Villanova");
//         Game game19 = new Game(ncState,louisville,"NC State");
//         Game game20 = new Game(louisville,ncState,"NC State");

			LinkedList<Game> games = new LinkedList<Game>();
			// MyStack games = new MyStack();

			games.add(game1);
			games.add(game2);
//         games.add(game3);
//         games.add(game4);
//         games.add(game5);
//         games.add(game6);
//         games.add(game7);
//         games.add(game8);
//         games.add(game9);
//         games.add(game10);
//         games.add(game11);
//         games.add(game12);
//         games.add(game13);
//         games.add(game14);
//         games.add(game15);
//         games.add(game16);
//         games.add(game17);
//         games.add(game18);
//         games.add(game19);
//         games.add(game20);

			boolean right = false;

			for (Game temp : games) {
				right = false;

				Team team1 = temp.getTeam1();
				Team team2 = temp.getTeam2();

				// farnsworth.compareTeams(team1,team2);
				// String winner = farnsworth.predictWinner(team1,team2);
				while (right == false) {
					String winner = farnsworth.predictWinner(team1, team2);
					if (winner.equals(temp.getWinner())) {

						right = true;
						String name1 = team1.toString();
						String name2 = team2.toString();
						double total1 = team1.getTotalScore();
						double total2 = team2.getTotalScore();
						System.out.println(name1 + ": " + total1);
						System.out.println(name2 + ": " + total2);

						System.out.println("\n");
						System.out.println(winner);
						System.out.println("\n");
						// farnsworth.saveWeights();

					}

					else {
						right = false;
						// games.add(temp);
						farnsworth.weightShuffle();
					}
				}

			}

		}
		farnsworth.saveWeights();

	}
}
