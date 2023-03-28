package Exe07Feb;

//You are developing a system to help the staff of a football/soccer club's web site report on matches. Data is received from a variety of sources and piped into a single stream after being cleaned up.
//
//        1. Output descriptions of the players based on their shirt number
//        The team only ever plays a 4-3-3 formation and has never agreed with the 1965 change to the rules allowing for substitutions, never mind enlarged squads.
//
//        The player descriptions are as follows:
//
//        1 -> "goalie"
//        2 -> "left back"
//        3 & 4 "center back"
//        5 -> "right back"
//        6, 7, & 8 -> "midfielder"
//        9 -> "left wing"
//        10 -> "striker"
//        11 -> "right wing"
//        Implement the static FootballMatchReports.onField() method to output a player description based on their shirt number.
//
//        FootballMatchReports.onField(10);
//// => "striker"
//        2. Raise an alert if an unknown shirt number is encountered
//        Modify the FootballMatchReports.onField() method to throw an IllegalArgumentException when a shirt number outside the range 1-11 is processed.
//

import java.util.Scanner;

public class MatchReports {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int nrTricou= scanner.nextInt();

        MatchReports matchReports = new MatchReports();
        System.out.println(matchReports.numarJucatori(nrTricou));
//int i = 1;
//while (i<12){
//    System.out.println(scrable2.NumarJucatori(i));
//i++;
//        }


    }
    public String numarJucatori(int valoare){
        switch (valoare){
            case 1:
                return "goalie";
            case 2:
                return "left back";
            case 3:
            case 4:
                return  "center back";

            case 5:
                return  "right back";

            case 6:
            case 7:
            case 8:
                return "midfielder";

            case 9:
                return "left wing";

            case 10:
                return "striker";

            case 11:
                return "right wing";

            default:
                throw new IllegalArgumentException();




        }
    }
}
