package day08_casting_conditionals;

import java.util.*;

public class IfElseWithRandoms {
	public static void main(String[] args) {
		Random r = new Random();
		int temperature = r.nextInt(40) + 50;
		System.out.println("Todays temperature is: " + temperature);
		if (temperature >= 70) {
			System.out.println("It a nice day out");
		} else {
			System.out.println("You should put a secong layer on its kinda chilly");
		}
		int teamAScore = r.nextInt(10) + 1;
		int teamBScore = r.nextInt(10) + 1;
		System.out.println("Team A's score: " + teamAScore);
		System.out.println("Team B score: " + teamBScore);
		if (teamAScore > teamBScore) {
			System.out.println("Team A won, go team A!!!");
		} else if (teamAScore < teamBScore) {
			System.out.println("Team B won, go team B!!!");
		} else {
			System.out.println("Team A and Team B tied.");
		}

	}
}
