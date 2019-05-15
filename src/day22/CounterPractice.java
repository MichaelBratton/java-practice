package day22;
import java.util.*;
public class CounterPractice {
public static void main(String[] args) {
	Scanner scan = new Scanner (System.in);
	System.out.println("Enter start number:");
	int start = scan.nextInt();
	System.out.println("Enter end number:");
	int end = scan.nextInt();
	int num = start;
	String counter = "";
	do {
		counter += num+", ";
		num++;
	}while(num<=end);
	System.out.println(counter);
	}
}
