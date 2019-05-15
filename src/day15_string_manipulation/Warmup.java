package day15_string_manipulation;

import java.util.*;

public class Warmup {
	public static void main(String[] args) {
		boolean looper = true;
		String again;

		Scanner scan = new Scanner(System.in);

		do {
			System.out.println("Enter emoticon:");
			String emote = scan.next();
			if (emote.length() != 2) {
				System.out.println("Invalid emoticon!");
			} else {
				if (emote.charAt(0) == ':') {
					if (emote.charAt(1) == ')') {
						System.out.println("Smile");
					} else if (emote.charAt(1) == '(') {
						System.out.println("Sad");
					} else if (emote.charAt(1) == '/') {
						System.out.println("Awkward");
					} else if (emote.charAt(1) == 'p') {
						System.out.println("Silly");
					} else {
						System.out.println("Invalid emoticon!");
					}
				} else if (emote.charAt(0) == ';') {
					if (emote.charAt(1) == ')') {
						System.out.println("wink");
					} else if (emote.charAt(1) == '0') {
						System.out.println("Surprised");
					} else {
						System.out.println("Invalid emoticon!");
					}
				} else {
					System.out.println("Invalid emoticon!");
				}
				
			}
			System.out.println("try again?");
			again = scan.next();
			if (again.equalsIgnoreCase("n") || again.equalsIgnoreCase("no")) {
				looper = false;
			}
		} while (looper == true);
		
		}

	}

