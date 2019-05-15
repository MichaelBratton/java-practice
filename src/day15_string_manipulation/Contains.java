package day15_string_manipulation;
import java.util.*;
public class Contains {
public static void main(String[] args) {
	String phrase = "I Am A Boss";
	System.out.println(phrase.toLowerCase().contains("am"));
	
	
	//check if it is a valid email
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter email:");
	String email = scan.next();
	if (email.endsWith(".com")) {
		if (email.toLowerCase().contains("@yahoo")) {
			System.out.println("Yahoo email");
		} else if (email.toLowerCase().contains("@gmail")) {
			System.out.println("Google email");
		} else if (email.toLowerCase().contains("@hotmail")) {
			System.out.println("Microsoft email");
		} else if (email.toLowerCase().contains("@icloud")) {
			System.out.println("Apple email");
		} else {
			System.out.println("Valid but unkown email");
		}
	} else {
		System.out.println("Invalid email!");
	}
}
}
