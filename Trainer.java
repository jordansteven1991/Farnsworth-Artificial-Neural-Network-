import java.io.*;
import java.util.*;

/**
 * @Steven Jordan @02/04/2015
 * 
 * cleanup started 11/26/2022
 */
public class Trainer {
	public static void main(String[] args) throws IOException {
		// Mid West
		Team kentucky = new Team(74.8, 72.6, 119.7, 85.8, 44.8, .9787, 1, .055, 35.1, "Kentucky", "SEC", "Southern");
		Team purdue = new Team(70.0, 68.5, 108.5, 97.1, 45.3, .7825, 49, .010, 33.5, "Purdue", "Big Ten", "Mid West");
		Team cincy = new Team(62.4, 67.4, 106.7, 93.3, 45.3, .8242, 34, -.027, 33.3, "Cincy", "Big ten", "Mid West");
		Team wvu = new Team(73.9, 66, 111.2, 95.4, 41.2, .8539, 25, .050, 31.8, "WVU", "Big 12", "Mid West");
		Team buffalo = new Team(75.0, 72.2, 109.8, 98.5, 43.5, .7759, 54, .011, 34, "Buffalo", "Mid American",
				"Mid West");
		Team maryland = new Team(69.5, 75.7, 108.5, 94.6, 43.8, .8289, 33, .131, 37.2, "Maryland", "ACC", "East");
		Team valp = new Team(69.8, 68.3, 103.8, 94.3, 45.9, .7499, 63, .070, 37.8, "Valparaiso", "Horizon Leaugue",
				"Mid West");
		Team butler = new Team(69.6, 68.0, 107.5, 91.7, 43.9, .8624, 23, -.014, 35.3, "Butler", "Big East", "Mid West");
		Team texas = new Team(67.9, 72.5, 110.3, 93.3, 43.6, .8725, 20, -.071, 33.9, "Texas", "Big 12", "Mid West");
		Team notreDame = new Team(78.8, 74.0, 122.2, 99.7, 51.0, .9127, 10, .064, 39.2, "Notre Dame", "ACC",
				"Mid West");
		Team northEast = new Team(68.6, 72.5, 106.0, 102.4, 48.6, .5980, 120, .037, 38.8, "North Eastern", "Colonial",
				"Mid West");
		Team wichitaSt = new Team(69.7, 68.8, 113.0, 92.9, 44.6, .9044, 14, .018, 36.2, "Wichita State",
				"Missouri Valley", "Mid west");
		Team indiana = new Team(77.5, 71.5, 116.6, 104.7, 46.6, .7762, 53, -.032, 40.3, "Indiana", "Big Ten",
				"Mid West");
		Team kansas = new Team(71.2, 72, 110.8, 90.5, 44, .9111, 11, .079, 37.5, "Kansas", "Big 12", "Mid West");
		Team newMexSt = new Team(68.5, 69.4, 104.1, 97.9, 46.6, .6674, 88, -.051, 36.8, "New Mexico State",
				"West Athletic", "Mid West");

		Game game1 = new Game(cincy, purdue, "Cincy");
		Game game2 = new Game(wvu, buffalo, "WVU");
		Game game3 = new Game(maryland, valp, "Maryland");
		Game game4 = new Game(butler, texas, "Butler");
		Game game5 = new Game(notreDame, northEast, "Notre Dame");
		Game game6 = new Game(wichitaSt, indiana, "Wichita State");
		Game game7 = new Game(kansas, newMexSt, "Kansas");

		Game game8 = new Game(kentucky, cincy, "Kentucky");
		Game game9 = new Game(wvu, maryland, "WVU");
		Game game10 = new Game(butler, notreDame, "Notre Dame");
		Game game11 = new Game(wichitaSt, kansas, "Wichita State");

		Game game12 = new Game(kentucky, wvu, "Kentucky");
		Game game13 = new Game(notreDame, wichitaSt, "Notre Dame");

		Game game14 = new Game(kentucky, notreDame, "Kentucky");

		// West
		Team wisconsin = new Team(71.9, 76.3, 124.7, 94.3, 48, .9615, 3, .009, 35.7, "Wisconsin", "Big Ten", "West");
		Team ccar = new Team(71.7, 68.8, 103.5, 102.2, 43.9, .5371, 148, .006, 35.6, "Coastal Carolina", "Big South",
				"West");
		Team oregon = new Team(75.6, 76.0, 113.3, 100.6, 46.1, .7972, 46, .127, 36.0, "Oregon", "Pac 12", "West");
		Team okSt = new Team(67.3, 72.6, 109.4, 96.2, 43.9, .8141, 37, -.034, 35.0, "Oklahoma State", "Big 12", "West");
		Team arkansas = new Team(78.0, 72.4, 113.0, 97.7, 44.7, .8416, 29, .047, 35.0, "Arkansas", "SEC", "West");
		Team wofford = new Team(67.0, 68.9, 103.3, 97.5, 45.8, .6617, 90, .141, 37.6, "Wofford", "???", "West");
		Team northCarolina = new Team(77.9, 70.0, 115.3, 95.0, 47.5, .9019, 16, -.034, 34.5, "North Carolina", "ACC",
				"West");
		Team harvard = new Team(64.2, 71.3, 102.0, 94.5, 43.5, .7059, 78, .114, 35.3, "Harvard", "Ivy league", "West");
		Team xavier = new Team(73.6, 72.5, 111.9, 96.1, 47.3, .8518, 26, -.063, 34.9, "Xavier", "Big East", "West");
		Team byu = new Team(83.6, 76.8, 116.7, 101.1, 46.7, .8395, 31, -.042, 38.8, "BYU", "West Coast", "West");
		Team baylor = new Team(69.5, 67.0, 114.8, 94.5, 43.4, .9038, 15, -.018, 37.7, "Baylor", "Big 12", "West");
		Team gaSt = new Team(72.0, 72.7, 108.4, 99.2, 48.0, .7344, 71, -.008, 33.1, "Ga State", "???", "West");
		Team vcu = new Team(72.5, 65.6, 108.1, 93.6, 42.0, .8400, 30, .059, 34.2, "VCU", "Atlantic 10", "West");
		Team ohioState = new Team(75.8, 67.8, 111.6, 94.7, 48.6, .8680, 21, -.051, 37.2, "Ohio State", "Big Ten",
				"West");
		Team arizona = new Team(76.4, 69.9, 116.0, 86.4, 48.9, .9674, 2, -.028, 36.0, "Arizona", "Pac 12", "West");
		Team txso = new Team(68.2, 66.2, 101.7, 104.9, 44.4, .4111, 207, .131, 32.0, "Texas Southern", "???", "West");

		Game game15 = new Game(wisconsin, ccar, "Wisconsin");
		Game game16 = new Game(oregon, okSt, "Oregon");
		Game game17 = new Game(arkansas, wofford, "Arkansas");
		Game game18 = new Game(northCarolina, harvard, "North Carolina");

		// Pick Ole Miss vs BYU
		Team oleMiss = new Team(72.6, 77.8, 114.4, 98.9, 42.6, .8419, 30, -.042, 33.8, "Ole Miss", "SEC", "West");

		Game game19 = new Game(xavier, oleMiss, "Xavier");
		Game game20 = new Game(baylor, gaSt, "Ga State");
		Game game21 = new Game(vcu, ohioState, "Ohio State");
		Game game22 = new Game(arizona, txso, "Arizona");

		Game game23 = new Game(wisconsin, oregon, "Wisconsin");
		Game game24 = new Game(arkansas, northCarolina, "North Carolina");
		Game game25 = new Game(xavier, gaSt, "Xavier");
		Game game26 = new Game(ohioState, arizona, "Arizona");

		Game game27 = new Game(wisconsin, northCarolina, "Wisconsin");
		Game game28 = new Game(xavier, arizona, "Arizona");

		Game game29 = new Game(wisconsin, arizona, "Wisconsin");

		// South
		Team duke = new Team(80.6, 69.1, 122.0, 96.1, 50.2, .9395, 7, .067, 38.6, "Duke", "ACC", "East");
		Team stJohn = new Team(71.2, 69.2, 108.1, 95.7, 44.1, .8019, 42, .058, 35.3, "St John's", "???", "South");
		Team sanDSt = new Team(61.8, 62.9, 102.4, 88.3, 41.9, .8468, 27, .014, 32.0, "San Diego St", "Mountain West",
				"South");
		Team utah = new Team(72.1, 69.9, 113.0, 90.6, 48.5, .9275, 8, -.056, 40.4, "Utah", "Pac 12", "South");
		Team stephenA = new Team(79.5, 73.4, 113.0, 99.1, 49.1, .8183, 35, .030, 38.6, "Stephen F. Austin", "???",
				"South");
		Team gtown = new Team(70.7, 70.2, 110.3, 93.7, 45.5, .8670, 22, -.002, 34.7, "Georgetown", "Big East", "South");
		Team eastWash = new Team(80.8, 72.3, 110.0, 107.7, 48.0, .5168, 136, .074, 40.3, "Eastern Washington", "???",
				"South");
		Team smu = new Team(69.4, 70.5, 112.3, 94.9, 47.9, .8734, 19, .014, 35.9, "SMU", "AAC", "South");
		Team ucla = new Team(72.0, 67.6, 110.2, 97.4, 44.1, .8056, 41, .026, 36.3, "UCLA", "Pac 12", "South");
		Team iowaState = new Team(78.4, 69.6, 118.9, 97.7, 48.0, .9047, 13, .023, 36.6, "Iowa State", "Big Ten",
				"South");
		Team uab = new Team(68.9, 74.1, 103.8, 100.3, 43.0, .5979, 121, .011, 33.2, "UAB", "CUSA", "South");
		Team iowa = new Team(69.4, 74.5, 111.1, 94.9, 42.7, .8595, 24, -.003, 33.2, "Iowa", "Big Ten", "South");
		Team davidson = new Team(79.9, 71.1, 118.5, 103.1, 47.1, .8320, 32, .037, 39.7, "Davidson", "???", "South");
		Team gonzaga = new Team(79.1, 69.1, 119.4, 93.4, 52.4, .9440, 6, .013, 40.8, "Gonzaga", "West Coast", "South");
		Team ndst = new Team(64.5, 69.3, 101.0, 100.1, 43.0, .5258, 151, .117, 38.0, "North Dakota St", "???", "South");

		Game game30 = new Game(sanDSt, stJohn, "San Diego State");
		Game game31 = new Game(utah, stephenA, "Utah");
		Game game32 = new Game(gtown, eastWash, "Georgetown");
		Game game33 = new Game(smu, ucla, "UCLA");
		Game game34 = new Game(iowaState, uab, "UAB");
		Game game35 = new Game(iowa, davidson, "Iowa");
		Game game36 = new Game(gonzaga, ndst, "Gonzaga");
		Game game37 = new Game(duke, sanDSt, "Duke");
		Game game38 = new Game(utah, gtown, "Utah");
		Game game39 = new Game(ucla, uab, "UCLA");
		Game game40 = new Game(iowa, gonzaga, "Gonzaga");
		Game game41 = new Game(duke, utah, "Duke");
		Game game42 = new Game(ucla, gonzaga, "Gonzaga");
		Game game43 = new Game(duke, gonzaga, "Duke");

		// East
		Team villanova = new Team(76.3, 72.7, 120.8, 92.2, 47.0, .9571, 5, .044, 38.9, "Villanova", "Big East", "East");
		Team laf = new Team(74.2, 76.6, 110.3, 113.1, 48.8, .4284, 195, .078, 41.3, "Lafayette", "???", "East");
		Team lsu = new Team(73.7, 68.9, 106.8, 94.7, 45.6, .8006, 43, -.027, 33.9, "LSU", "SEC", "East");
		Team ncState = new Team(70.4, 68.3, 111.5, 98.2, 43.7, .8111, 38, -.020, 36.1, "NC State", "ACC", "East");
		Team wyoming = new Team(61.7, 70.7, 101.8, 97.0, 46.2, .6373, 102, .084, 32.3, "Wyoming", "???", "East");
		Team uni = new Team(65.4, 72.6, 113.8, 93.2, 48.3, .9080, 12, .010, 39.7, "Northern Iowa", "???", "East");
		Team louisville = new Team(69.2, 66.0, 105.9, 89.4, 42.9, .8756, 18, .027, 30.4, "Louisville", "ACC", "East");
		Team ucIrvine = new Team(67.9, 68.3, 103.9, 98.3, 46.1, .6560, 94, -.007, 39.0, "Uc irvine", "???", "East");
		Team dayton = new Team(69.2, 67.0, 107.2, 94.7, 46.6, .8057, 40, .022, 36.1, "Dayton", "Atlantic", "East");
		Team boise = new Team(70.8, 73.3, 109.4, 96.5, 45.8, .8091, 39, .027, 39.4, "Boise St", "???", "East");
		Team providence = new Team(70.2, 71, 110.7, 95.5, 44.2, .8458, 28, .043, 31, "Providence", "???", "East");
		Team oku = new Team(71.9, 73.5, 109.3, 88.9, 43.6, .9150, 9, -.046, 34.3, "Oklahoma", "Big 12", "Mid West");
		Team albany = new Team(65.5, 76.1, 104.1, 101.6, 44.0, .5678, 132, .060, 36.0, "Albany", "???", "East");
		Team michSt = new Team(71.9, 63.3, 114.1, 96.1, 47.1, .8786, 17, -.053, 38.6, "Michigan St", "Big Ten", "East");
		Team georgia = new Team(68.3, 68.9, 107.0, 93.9, 43.5, .8178, 36, .010, 34.4, "Georgia", "SEC", "East");
		Team virginia = new Team(65.3, 72.3, 112.2, 85.4, 46.3, .9587, 4, .032, 36.1, "Virginia", "ACC", "East");
		Team belmont = new Team(74.5, 69.1, 107.9, 106.5, 47.6, .5363, 149, .071, 38.2, "Belmont", "???", "East");

		Game game44 = new Game(villanova, laf, "Villanova");
		Game game45 = new Game(ncState, lsu, "NC State");
		Game game46 = new Game(uni, wyoming, "Northern Iowa");
		Game game47 = new Game(louisville, ucIrvine, "Louisville");
		Game game48 = new Game(providence, dayton, "Dayton");
		Game game49 = new Game(oku, albany, "Oklahoma");
		Game game50 = new Game(michSt, georgia, "Michigan St");
		Game game51 = new Game(virginia, belmont, "Virginia");
		Game game52 = new Game(villanova, ncState, "NC State");
		Game game53 = new Game(uni, louisville, "Louisville");
		Game game54 = new Game(dayton, oku, "Oklahoma");
		Game game55 = new Game(michSt, virginia, "Michigan St");
		Game game56 = new Game(ncState, louisville, "Louisville");
		Game game57 = new Game(oku, michSt, "Michigan St");
		Game game58 = new Game(louisville, michSt, "Michigan St");

		Game game59 = new Game(kentucky, wisconsin, "Wisconsin");
		Game game60 = new Game(michSt, duke, "Duke");
		Game game61 = new Game(wisconsin, duke, "Duke");

		Farnsworth farnsworth = new Farnsworth();

		LinkedList<Game> games = new LinkedList<Game>();
		// MyStack games = new MyStack();

		games.add(game1);
		games.add(game2);
		games.add(game3);
		games.add(game4);
		games.add(game5);
		games.add(game6);
		games.add(game7);
		games.add(game8);
		games.add(game9);
		games.add(game10);
		games.add(game11);
		games.add(game12);
		games.add(game13);
		games.add(game14);
		games.add(game15);
		games.add(game16);
		games.add(game17);
		games.add(game18);
		games.add(game19);
		games.add(game20);
		games.add(game21);
		games.add(game22);
		games.add(game23);
		games.add(game24);
		games.add(game25);
		games.add(game26);
		games.add(game27);
		games.add(game28);
		games.add(game29);
		games.add(game30);
		games.add(game31);
		games.add(game32);
		games.add(game33);
		games.add(game34);
		games.add(game35);
		games.add(game36);
		games.add(game37);
		games.add(game38);
		games.add(game39);
		games.add(game40);
		games.add(game41);
		games.add(game42);
		games.add(game43);
		games.add(game44);
		games.add(game45);
		games.add(game46);
		games.add(game47);
		games.add(game48);
		games.add(game49);
		games.add(game50);
		games.add(game51);
		games.add(game52);
		games.add(game53);
		games.add(game54);
		games.add(game55);
		games.add(game56);
		games.add(game57);
		games.add(game58);
		games.add(game59);
		games.add(game60);
		games.add(game61);

		int bestRun = 47;
		int gamesRight = 0;

//      boolean right = false;

		for (int z = 0; z < 9999; z++) {
			for (Game temp : games) {
				// boolean right = false;

				farnsworth.makeMadness(temp);

				Team team1 = temp.getTeam1();
				Team team2 = temp.getTeam2();

				// String winner = farnsworth.predictWinner(team1,team2);
				// while(right == false)
				// {
				String winner = farnsworth.predictWinner(team1, team2);
				if (winner.equals(temp.getWinner())) {

					// right= true;
					gamesRight++;

				}

				else {
					// right = false;
					// games.add(temp);
					farnsworth.weightShuffle();
				}

//                     String name1 = team1.toString();
//                     String name2 = team2.toString();
//                     double total1 = team1.getTotalScore();
//                     double total2 = team2.getTotalScore();
//                     System.out.println(name1 + ": " + total1);
//                     System.out.println(name2 + ": " + total2);
//                     System.out.println("\n");
//                     System.out.println(winner);
//                     System.out.println("\n");
				// farnsworth.saveWeights();
				// }
				if (gamesRight > bestRun) {
					farnsworth.saveWeights();
					bestRun = gamesRight;
				}

			}

//         if (bestRun != 0)
//             {
//                 if (gamesRight > bestRun)
//                 {
//                     farnsworth.saveWeights();
//                     bestRun = gamesRight;
//                 }

//             }
//         else
//         {
//           //  bestRun = gamesRight;
//           //  farnsworth.saveWeights();
//           bestRun = 47;
//           if (gamesRight > bestRun)
//                 {
//                     farnsworth.saveWeights();
//                     bestRun = gamesRight;
//                 }
//         }

			System.out.println("Games right: ");
			System.out.println(gamesRight + "\n");

			gamesRight = 0;
		}

		System.out.println("Best Run: ");
		System.out.println(bestRun + "\n");

//     System.out.println("Best round: ");
//         System.out.println(bestRun);

	}
}
