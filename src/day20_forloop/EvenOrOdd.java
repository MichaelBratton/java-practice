package day20_forloop;

public class EvenOrOdd {
public static void main(String[] args) {
	System.out.println("Even:");
	for(int x = 1; x<=100;x++) {
		if (x%2 == 0) {
			System.out.print(" "+x);
		}
	}
	
	System.out.println("\nOdd:");
	for(int x = 1; x<=100;x++) {
		if (x%2 == 1) {
			System.out.print(" "+x);
		}
	}
}
}
