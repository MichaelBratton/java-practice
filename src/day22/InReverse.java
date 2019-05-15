package day22;
import java.util.*;
public class InReverse {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter word:");
	String word = scan.next();
	for (int x = word.length()-1;x>=0;x--) {
		System.out.println(word.charAt(x));
	}
}
}
