package day08_casting_conditionals;
import java.util.*;
public class VotingEligibility {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int votingAge = 18;
	int userAge;
	System.out.println("How old are you?");
	userAge = in.nextInt();
	if (userAge > votingAge) {
		System.out.println("You have been eligbilbe to vote for "+(userAge-votingAge)+" years");
	} else if (userAge == votingAge) {
		System.out.println("You became eligbile to vote this year, congradulations");
	} else {
		System.out.println("You still need to wait "+(votingAge-userAge)+" to vote.");
	}
	in.close();
	}
}
