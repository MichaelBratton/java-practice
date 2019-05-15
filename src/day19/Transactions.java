package day19;
import java.util.*;
public class Transactions {
public static void main(String[] args) {
	int balance = 100;
	System.out.println("Your balance is: "+balance);
	while (balance>0) {
	Scanner scan = new Scanner(System.in);
	System.out.println("What is transaction amount?");
	int amount = scan.nextInt();
	balance -= amount;
	System.out.println("Your balance is now: "+balance);
	}
}
}
