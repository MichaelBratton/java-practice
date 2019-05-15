package day21;
import java.util.*;
public class GiveMe100 {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int num1, num2;
	do {
	System.out.println("Enter num 1:");
	 num1 = scan.nextInt();
	System.out.println("Enter num 2:");
	 num2 = scan.nextInt();
	 System.out.println("Sum: "+(num1+num2));
	 
	} while((num1+num2)<100);
	System.out.println("Good Numbers!");
	
}
}
