package day11_logical_nestedif;

import java.util.*;

public class LogInTests {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String validUN = "cybertek@mail.com";
		String validPW = "WoodenSpoon123";
		String pass, user;

		System.out.println("Enter Username:");
		 user = in.nextLine();
		System.out.println("Enter Password:");
		 pass = in.nextLine();
		
		if (validUN.equalsIgnoreCase(user) && validPW.equals(pass)) {
			System.out.println("Login Succesful, Welcome!");
		} else if (validUN.equalsIgnoreCase(user) && !validPW.equals(pass)) {
			System.out.println("Valid Username, Invalid password");
		} else if (!validUN.equalsIgnoreCase(user) && validPW.equals(pass)) {
			System.out.println("Invalid Username, Valid password");
		} else if (!validUN.equalsIgnoreCase(user) && !validPW.equals(pass)) {
			System.out.println("Invalid Username, Invalid Password");
		}

	}
}
