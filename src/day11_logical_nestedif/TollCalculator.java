package day11_logical_nestedif;
import java.util.*;
public class TollCalculator {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	System.out.println("Enter Vehicle Type:");
	int carType = in.nextInt();
	double price=0.0;
	
	System.out.println("Is it rush hour: yes | no");
	String rushHour = in.next();
	
	boolean isRushHour = (rushHour.equalsIgnoreCase("yes"));
	
	
	
	
	if (carType == 1) {
		if (isRushHour) {
			price = 30.0;
		}else {
			price = 5.0;
		}
		} else if (carType == 2) {
        if (isRushHour) {
			price = 55.30;
		} else {
			price = 10.75;
		}
	}
	System.out.println("Price: "+price);
}
}
