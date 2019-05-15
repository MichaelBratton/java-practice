package day23;
import java.util.*;
public class BruteForce {
public static void main(String[] args) {
	Scanner scan = new Scanner (System.in);
	String expectedUsername = "admin";
	String expectedPassword = "admin123";
	String username = "";
	String password = "";
	int attempts  = 5;
	do {
		if (attempts-- == 0) {
			System.out.println("You have exceeded the max number of attempts");
			System.out.println("The account has been locked!");
			return;
		}
		attempts--;
		System.out.println("Enter username:");
		username = scan.next();
		if (!username.equals(expectedUsername)) {
			System.out.println("Wrong username!");
			System.out.println("Attempts left: "+attempts);
			continue;
		}
		System.out.println("Enter password:");
		password = scan.next();
		if (!password.equals(expectedPassword)) {
			System.out.println("Wrong Password!");
			System.out.println("Attempts left: "+attempts);
			continue;
		}
		
		
	}while(!username.equals(expectedUsername) || !password.equals(expectedPassword));
	System.out.println("Login Succesful");
	
}
}
