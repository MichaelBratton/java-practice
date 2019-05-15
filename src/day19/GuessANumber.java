package day19;
import java.util.*;
public class GuessANumber {
public static void main(String[] args) {
	System.out.println("### WELCOME TO GUESS A NUMBER GAME ###");
	Scanner scan = new Scanner(System.in);
	Random random = new Random();//is used to generate random numbers
	int secretNumber = random.nextInt(101);
	int guessNumber;
	int attempt = 0;
	
	do {
		System.out.println("Guess a number:");
		guessNumber = scan.nextInt();
		if (guessNumber > secretNumber) {
			System.out.println("Your number is too large!");
		} else if (guessNumber < secretNumber) {
			System.out.println("Your number is too small!");
		}
		attempt++;
	}while(guessNumber != secretNumber && attempt <5); 
	if (guessNumber == secretNumber) {
	System.out.println("CONGRADULATIONS YOU WON!!! ");
	} else {
		System.out.println("You lose!!!");
	}
}
}
