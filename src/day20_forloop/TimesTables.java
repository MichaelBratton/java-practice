package day20_forloop;

import java.util.*;

public class TimesTables {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number:");
		int num = scan.nextInt();
		if (num > 10) {
			System.out.println("Invalid!");
			return;
		}
		for (int x = 1; x <= 10; x++) {
			switch (num) {
			case 1:
            System.out.println(num+" x "+x+" = "+(num*x));
				break;
			case 2:
				System.out.println(num+" x "+x+" = "+(num*x));
				break;
			case 3:
				System.out.println(num+" x "+x+" = "+(num*x));
				break;
			case 4:
				System.out.println(num+" x "+x+" = "+(num*x));
				break;
			case 5:
				System.out.println(num+" x "+x+" = "+(num*x));
				break;
			case 6:
				System.out.println(num+" x "+x+" = "+(num*x));
				break;
			case 7:
				System.out.println(num+" x "+x+" = "+(num*x));
				break;
			case 8:
				System.out.println(num+" x "+x+" = "+(num*x));
				break;
			case 9:
				System.out.println(num+" x "+x+" = "+(num*x));
				break;
			case 10:
				System.out.println(num+" x "+x+" = "+(num*x));
				break;
			}
		}
	}
}
