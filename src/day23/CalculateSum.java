package day23;
import java.util.*;
public class CalculateSum {
public static void main(String[] args) {
	int num = 0;
	int sum = 0;
	Scanner scan = new Scanner(System.in);
	for (int x =0; x<6;x++) {
		System.out.println("Enter a number");
		num = scan.nextInt();
		if(num<=0) {
			continue;
			}
		sum+=num;	
	}
	System.out.println("Total sum: "+sum);
}
}
