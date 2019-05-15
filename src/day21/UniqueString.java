package day21;
import java.util.*;
public class UniqueString {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter word:");
	String word = scan.next();
	String unique= "";
	for(int x=0;x<word.length();x++) {
		if (!unique.contains(""+word.charAt(x))) {
			unique = unique+word.charAt(x);
		}
	}
	System.out.println(unique);
}
}
