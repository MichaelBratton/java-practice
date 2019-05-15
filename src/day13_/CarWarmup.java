package day13_;

import java.util.*;

public class CarWarmup {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int carType, avgP;
		double startPrice;
		String carOptions, carOrigin;
		System.out.println("What kind of car are you looking to buy?");
		System.out.println("\n1 = American \n2 = Japanese \n3 = Russian \n4 = Italian");
		carType = in.nextInt();
		switch (carType) {
		case 1:
			avgP = 45000;
			carOrigin = "American";
			carOptions = "Your options are: \nMustang \nChevrolet \nCadillac \n";
			break;
		case 2:
			avgP = 30000;
			carOrigin = "Japanese";
			carOptions = "Your options are: \nToyota \nHonda \nSubaru \n";
			break;
		case 3:
			avgP = 2000;
			carOrigin = "Russian";
			carOptions = "Your options are: \nVolga \nZiguli \nZaporozetso \n";
			break;
		case 4:
			avgP = 80000;
			carOrigin = "Italian";
			carOptions = "Your options are: \nFerrari \nLamborghini \nPorsche \n";
			break;
		default:
			System.out.println("not valid cartype!");
			return;

		}
System.out.println("You selected a "+carOrigin+" car, "+carOptions+"And your average price is"+avgP);
	}
}
