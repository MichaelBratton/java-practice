package day09_stringequals_conditionals;

import java.util.*;

public class Canada {
	public static void main(String[] args) {
		String input;
		Scanner in = new Scanner(System.in);
		System.out.println("What is the capitol of Canada");
		input = in.nextLine();
		if (input.equalsIgnoreCase("Ottawa")) {
			System.out.println("Your answer is correct!");
		} else {
			System.out.println("Your answer is incorrect! " + input + " is not the capitol of Canada");
		}
		in.close();
	}
}
