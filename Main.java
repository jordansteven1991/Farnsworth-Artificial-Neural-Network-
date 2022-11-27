
import java.io.*;
import java.util.*;
/**
 * Write a description of class Trainer here.
 * 
 * @Steven Jordan
 * @02/04/2015
 */
public class Main
{
    public static void main(String[] args)throws IOException
    {
        
        //South
        Team unc = new Team(84.9,70.5,122.0,92.0,47.1,27.92,3,.006,36.6,"North Carolina","ACC","East");
        Team txso = new Team(74.4,73.4,103.6,107.3,43.1,.4111,208,.131,29.6,"Texas Southern","???","West");
        Team arkansas = new Team(79.8,76.2,116.7,101.0,46.1,15.66,36,.093,36.4,"Arkansas","SEC","West");
        Team shall = new Team(73.3,64.3,109.9,95.9,45.0,13.96,53,.071,33.8,"Seton Hall","Big East","South");
        Team middtenn = new Team(75.0,69.8,111.6,97.0,49.0,14.65,48,.012,36.6,"Middle Tennessee","CUSA","South");
        Team minnesota = new Team(75.3,70.7,109.6,92.9,43.5,16.70,33,.028,34.5,"Minnesota","Big Ten","South");
        Team butler = new Team(76.3,74.0,118.0,97.9,47.8,20.91,26,-.001,36.3,"Butler","Big East","South");
        Team winthrop = new Team(79.7,72.0,106.6,101.6,45.7,4.97,110,.029,37.3,"Winthrop","Big East","South");
        Team cincy = new Team(74.5,68.3,114.3,91.9,45.4,22.31,23,.029,34.3,"Cincinatti","Big East","South");
        Team ksu = new Team(71.7,68.9,112.1,94.5,45.8,17.56,29,-.040,36.1,"KSU","Big East","South");
      //  Team wake = new Team(76.3,74.0,120.8,103.6,47.8,17.17,30,-.035,36.3,"Wake Forest","Big East","South");
        
        Team ucla = new Team(90.4,74.5,122.7,99.8,51.9,22.95,18,.024,40.5,"UCLA","Big East","South");
        Team kent = new Team(76.9,71.9,104.4,102.7,42.8,1.74,141,.022,31.8,"Kent State","Big East","South");
        Team day = new Team(76.5,68.9,112.3,96.6,47.0,15.70,35,-.011,38.7,"Dayton","Big East","South");
        Team wich = new Team(82.1,73.4,119.6,93.2,47.3,26.40,9,-.014,40.8,"Wichita State","Big East","South");
        Team uk = new Team(85.9,70.1,119.2,91.9,47.7,27.30,4,.008,35.3,"Kentucky","Big East","South");
        Team nku = new Team(76.1,67.6,106.7,105.3,45.9,1.38,146,.082,35.3,"North Kentucky","Big East","South");
        
        //West
        Team gonzaga = new Team(84.6,73.8,120.7,87.7,51.8,33.04,1,.016,38.2,"Gonzaga","Big East","West");
        Team sdst = new Team(77.6,77.6,110.8,112.1,45.9,-1.32,187,.029,36.3,"South Dakota St","Big East","West");
        Team northw = new Team(71.1,75.1,111.3,95.7,43.6,15.59,38,.021,34.1,"Northwestern","Big East","West");
        Team vandy = new Team(71.3,77.6,112.4,96.1,43.1,16.30,34,-.035,37.7,"Vandy","Big East","West");
        Team notredame = new Team(78.0,79.9,118.9,97.9,46.1,21.00,25,.021,38.6,"Notredame","Big East","West");
        Team princeton = new Team(72.1,73.4,109.4,96.9,45.2,12.50,59,.025,38.3,"Princeton","Big East","West");
        Team wvu = new Team(82.0,67.8,116.5,89.7,45.8,26.84,5,-.043,36.1,"West Virginia","Big East","West");
        Team bucknell = new Team(76.1,67.9,109.1,100.3,48.1,8.73,79,.018,37.7,"Bucknell","Big East","West");
        Team maryland = new Team(74.2,69.8,113.7,98.7,45.1,14.95,44,.064,36.3,"Maryland","Big East","West");
        Team xavier = new Team(74.6,68.8,114.8,99.5,45.4,15.30,39,.030,34.0,"Xavier","Big East","West");
        Team fsu = new Team(82.5,69.2,116.7,94.1,48.3,22.63,21,.023,35.6,"FSU","Big East","West");
        Team fgcu = new Team(79.4,70.2,109.6,104.6,50.2,5.00,109,.051,35.0,"Florida Gulf","Big East","West");
        Team smc = new Team(72.0,74.8,119.0,94.3,49.6,24.61,14,.034,39.9,"St Marys","Big East","West");
        Team vcu = new Team(74.7,70.7,110.1,95.7,46.1,14.35,50,.036,33.4,"VCU","Big East","West");
        Team arizona = new Team(76.3,75.8,117.6,94.8,47.6,22.73,20,.064,39.8,"Arizona","Big East","West");
        Team northdakota = new Team(80.5,71.8,102.9,103.2,48.3,-.32,173,.047,38.7,"North Dakota","Big East","West");
        
      //East
        Team villanova = new Team(77.7,79.4,122.8,92.0,49.7,30.78,2,.016,37.0,"Villanova","Big East","East");
        Team msm = new Team(68.3,67.2,99.4,103.3,44.6,-3.96,212,.072,36.1,"Mount Saint Mary's","Big East","East");
        Team wisc = new Team(71.9,64.4,113.6,91.2,45.2,22.38,22,0,35.5,"Wisconsin","Big East","East");
        Team vt = new Team(79.3,73.4,117.4,102.5,49.0,14.85,45,.061,40.3,"Virginia Tech","Big East","East");
        Team uva = new Team(66.6,70.8,113.6,87.1,46.4,26.59,7,-.051,39.3,"Virginia","Big East","East");
        Team uncw = new Team(85.2,69.2,117.8,105.4,48.2,12.42,60,.051,36.6,"UNC Wil","Big East","East");
        Team uf = new Team(78.3,72.6,115.9,89.5,45.0,26.42,8,-.046,36.2,"Florida","Big East","East");
        Team etsu = new Team(79.9,70.4,108.0,96.5,45.0,11.53,64,.002,36.2,"East Tenn","Big East","East");
        Team smu = new Team(78.7,73.9,120.1,94.8,45.4,25.26,11,.020,36.3,"SMU","Big East","East");
        Team usc = new Team(78.7,73.9,112.5,100.2,45.4,12.31,61,.078,36.3,"USC","PAC 10","East");
        Team prov = new Team(70.3,69.1,108.1,95.2,44.7,12.90,56,.027,36.8,"Providence","PAC 10","East");
        
        Team baylor = new Team(72.7,71.7,117.3,92.3,47.1,25.02,12,.002,35.9,"Baylor","Big East","East");
        Team newmex = new Team(78.9,71.2,110.0,102.8,46.8,7.29,89,.057,33.7,"New Mexico St","Big East","East");
        Team southc = new Team(72.1,69.0,105.5,88.5,41.4,17.06,31,-.004,33.8,"South Carolina","Big East","East");
        Team marquette = new Team(82.5,77.9,121.0,103.4,48.7,17.57,28,-.062,43.0,"Marquette","Big East","East");
        Team duke = new Team(80.7,75.8,121.0,96.0,47.7,24.97,13,.027,37.6,"Duke","Big East","East");
        Team troy = new Team(78.4,72.2,109.9,107.3,45.7,2.66,130,-.037,36.2,"Troy","Big East","East");
        
        //Midwest
        Team kansas = new Team(82.7,66.6,120.8,94.9,48.7,25.90,10,.074,40.5,"Kansas","Big 12","Mid west");
        Team ucdavis = new Team(70.5,66.5,97.9,102.1,43.7,-3.91,215,.117,35.4,"UC Davis","Big 12","Mid west");
        Team miami = new Team(69.4,71.8,110.3,93.5,45.3,16.83,30,.030,35.9,"Miami","ACC","Mid west");
        Team michst = new Team(71.7,66.4,110.6,95.7,46.8,14.95,41,-.012,37.6,"Mich St","Big Ten","Mid west");
        Team iowast = new Team(80.9,69.6,119.6,96.5,46.9,23.08,17,-.010,40.2,"Iowa St","ACC","Mid west");
        Team nevada = new Team(80.0,70.3,114.7,101.1,45.0,13.61,54,.059,38.5,"Nevada","ACC","Mid west");
        Team purdue = new Team(80.1,76.4,116.9,92.8,48.0,24.12,15,-.023,40.6,"Purdue","ACC","Mid west");
        Team vermont = new Team(73.6,70.2,110.8,98.9,49.6,11.90,61,.060,36.9,"Vermont","ACC","Mid west");
        Team creighton = new Team(82.1,68.2,115.7,96.1,50.8,19.59,27,.009,39.9,"Creighton","ACC","Mid west");
        Team uri = new Team(73.4,65.7,110.6,95.1,45.2,15.51,36,-.024,34.0,"Rhode Island","ACC","Mid west");
        Team oregon = new Team(79.1,71.1,117.6,94.1,48.1,23.50,16,.036,37.8,"Oregon","ACC","Mid west");
        Team iona = new Team(80.5,77.0,110.2,106.3,45.5,3.97,118,.011,39.7,"Iona","ACC","Mid west");
        Team mich = new Team(74.8,77.5,121.7,99.1,48.3,22.57,20,-.031,38.1,"Michigan","ACC","Mid west");
        Team okst = new Team(85.5,78.7,124.8,102.7,46.4,22.07,24,-.056,40.1,"OK St","ACC","Mid west");
        Team louisville = new Team(77.5,68.5,117.1,90.5,45.5,26.60,6,-.011,35.8,"Louisville","ACC","Mid west");
        Team jackst = new Team(69.7,71.2,105.5,104.7,45.7,.76,155,.029,37.2,"Jacksonvile State","ACC","Mid west");
        
 //       Game game1 = new Game(miami,michst);
        Game game1 = new Game(gonzaga,purdue);
//    Game game2 = new Game(purdue,uk);
//          Game game3 = new Game(unc,uk);
//          Game game4 = new Game(gonzaga,xavier);
//           Game game5 = new Game(butler,unc);
//          Game game6 = new Game(southc,baylor);
//          Game game7= new Game(ucla,uk);
//          Game game8 = new Game(wisc,uf);
//         Game game9 = new Game(uk,nku);
//         Game game13 = new Game(texas,uni);
//         Game game14 = new Game(texasAM,greenBay);
//         Game game15 = new Game(oregonSt,vcu);
//         Game game16 = new Game(oku,calBaker);
//         Game game17 = new Game(usc,providence);
//         Game game18 = new Game(indiana,chatt);
//         Game game19 = new Game(unc,fgc);
//         Game game20 = new Game(uk,stonyBrook);
//         Game game21 = new Game(notreDame,michigan);
//         Game game22 = new Game(wvu,sfAustin);
//         Game game23 = new Game(wisc,pitt);
//         Game game24 = new Game(xavier,weberSt);
        
        
//         Game game23 = new Game(kansas,austinPeay);
//         Game game24 = new Game(kansas,austinPeay);
//         Game game25 = new Game(kansas,austinPeay);
//         Game game26 = new Game(kansas,austinPeay);
//         Game game27 = new Game(kansas,austinPeay);
//         Game game28 = new Game(kansas,austinPeay);
//         Game game29 = new Game(kansas,austinPeay);
//         Game game30 = new Game(kansas,austinPeay);
//         Game game31 = new Game(kansas,austinPeay);
//         Game game32 = new Game(kansas,austinPeay);
//         Game game33 = new Game(kansas,austinPeay);
//         Game game34 = new Game(kansas,austinPeay);
//         Game game35 = new Game(kansas,austinPeay);
//         Game game36 = new Game(kansas,austinPeay);
//         Game game37 = new Game(kansas,austinPeay);
//         Game game38 = new Game(kansas,austinPeay);
//         Game game39 = new Game(kansas,austinPeay);
//         Game game40 = new Game(kansas,austinPeay);
//         Game game41 = new Game(kansas,austinPeay);
//         Game game42 = new Game(kansas,austinPeay);
//         Game game43 = new Game(kansas,austinPeay);
//         Game game44 = new Game(kansas,austinPeay);
//         Game game45 = new Game(kansas,austinPeay);
//         Game game46 = new Game(kansas,austinPeay);
//         Game game47 = new Game(kansas,austinPeay);
//         Game game48 = new Game(kansas,austinPeay);
//         Game game49 = new Game(kansas,austinPeay);
//         Game game50 = new Game(kansas,austinPeay);
        
        
        
        
        Farnsworth farnsworth = new Farnsworth();
        
 
   


        
    
        
        
        
       
        LinkedList<Game> games = new LinkedList<Game>();
        //MyStack games = new MyStack();
        
        games.add(game1);
//       games.add(game2);
//         games.add(game3);
//         games.add(game4);
//          games.add(game5);
//         games.add(game6);
//         games.add(game7);
//         games.add(game8);
// //         games.add(game9);
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
//         games.add(game21);
//         games.add(game22);
//          games.add(game23);
//          games.add(game24);
//         games.add(game25);
//         games.add(game26);
//         games.add(game27);
//         games.add(game28);
//         games.add(game29);
//         games.add(game30);
//         games.add(game31);
//         games.add(game32);
//         games.add(game33);
//         games.add(game34);
//         games.add(game35);
//         games.add(game36);
//         games.add(game37);
//         games.add(game38);
//         games.add(game39);
//         games.add(game40);
//         games.add(game41);
//         games.add(game42);
//         games.add(game43);
//         games.add(game44);
//         games.add(game45);
//         games.add(game46);
//         games.add(game47);
//         games.add(game48);
//         games.add(game49);
//         games.add(game50);
//         games.add(game51);
//         games.add(game52);
//         games.add(game53);
//         games.add(game54);
//         games.add(game55);
//         games.add(game56);
//         games.add(game57);
//         games.add(game58);
//         games.add(game59);
//         games.add(game60);
//         games.add(game61);
        
        
     
   //     int gamesRight = 0;
      
            for(Game temp : games)
            {
                
                farnsworth.makeMadness(temp);
                Team team1 = temp.getTeam1();
                Team team2 = temp.getTeam2();
                
                String winner = farnsworth.predictWinner(team1,team2);
                String name1 = team1.toString();
                String name2 = team2.toString();
                double total1 = team1.getTotalScore();
                double total2 = team2.getTotalScore();
                System.out.println(name1 + ": " + total1);
                System.out.println(name2 + ": " + total2);
                    
                System.out.println("\n");
                
                System.out.println(winner);
                System.out.println("\n");
                
                
                
            
            }
        
       
        
    }
              
        
}
