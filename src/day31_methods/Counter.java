package day31_methods;
import java.util.*;
public class Counter {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("enter a number");
	int num = scan.nextInt();
	System.out.println("Count up from one to your number:");
	countUp(num);
	System.out.println("\nCount down from your number to 1:");
	countDown(num);
	
}
public static void countUp(int num) {
	if(num<1) {
		System.out.println("invalid");
	} else {
		for (int i = 1; i<=num;i++) {
			System.out.println(i);
		}
	}
}
public static void countDown(int num) {
	if(num<1) {
		System.out.println("invalid");
	} else {
		for (int i = num; i>0;i--) {
			System.out.println(i);
		}
}
}
}
