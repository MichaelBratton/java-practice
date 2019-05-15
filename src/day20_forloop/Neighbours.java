package day20_forloop;
import java.util.*;
public class Neighbours {
public static void main(String[] args) {
	Scanner scan = new Scanner (System.in);
	System.out.println("Enter word:");
	String word = scan.next();
	for (int x = 0;x<word.length()-1;x += 2) {
		if (word.charAt(x) == word.charAt(x+1)) {
			System.out.println("Beep "+word.charAt(x));
		}
	}
}
}
