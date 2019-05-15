package day30_methods;
import java.util.*;
public class Methods {
public static void main(String[] args) {
	introduce();
	middle();
}
public static void middle() {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter 2 numbers");
	int num1 = scan.nextInt();
	int num2 = scan.nextInt();
	if(num1<num2) {
		for(int i = num1;i<=num2;i++) {
			System.out.print(i+" ");
		}
	} else {
for(int i = num2;i<=num2;i++) {
	System.out.print(i+" ");
		}
	}
}
public static void introduce() {
	Scanner scan = new Scanner(System.in);
	System.out.println("What is your name?");
	String name = scan.next();
	System.out.println("Hello "+name+" nice to meet you!");
}


}
