package day28;

import java.util.Arrays;

public class MultiDimensionalAarraysFootballTeams {
public static void main(String[] args) {
	String[][] teams1 = new String[2][6];
	//or
	String[][] teams = {{"Irina", "Zarif", "Cihan", "Habibi", "Adel", "Bojan"},{"Olimjon", "Mirshod", "Usman", "Nursultan", "Roman", "Dmitriy"}};
//find the homie bojan
	System.out.println(teams[0][5]);
	//print how many teams
	System.out.println("number of teams:"+teams.length);
	//number of ppl in either team
	System.out.println("team1: "+teams[0].length);
	System.out.println("team2: "+teams[1].length);
	//print whole array
	System.out.println(Arrays.deepToString(teams));
	//print only team one 
	System.out.println(Arrays.toString(teams[0]));
	
	
}
}
