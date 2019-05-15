package day08_casting_conditionals;

import java.util.*;

public class IfElseWithScanner {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("What percent did you get on the test?");
		int yourPercentage = in.nextInt();
		int passingScore = 65;
		if (yourPercentage > passingScore) {
			System.out.println("Congradulations you passed the test!");

		} else {
			System.out.println("you failed.");
		}

		in.close();
	}
}
