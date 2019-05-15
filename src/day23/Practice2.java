package day23;
import java.util.*;
public class Practice2 {
public static void main(String[] args) {
	String word = "";
	String str = "";
	Scanner scan = new Scanner(System.in);
	for (int x = 0;x<6;x++) {
		System.out.println("Enter word:");
		word = scan.next();
		if(word.equalsIgnoreCase("java")) {
			continue;
		} else {
			str = ""+str+word+", ";
		}
	}
	
}
}
