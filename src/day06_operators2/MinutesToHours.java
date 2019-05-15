
package day06_operators2;

import java.util.Scanner;

public class MinutesToHours {
public static void main(String[] args) {
	
	Scanner in = new Scanner(System.in);
	
	int hours, minutes, x;
	System.out.println("Enter number of minutes to be converted");
	
	x = in.nextInt();
	
	in.close();
	
	hours = x/60;
	minutes = x%60;
	System.out.println(hours+" hours "+minutes+" minutes.");
	
	
}
}
