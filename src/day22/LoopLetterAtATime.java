package day22;
import java.util.*;
public class LoopLetterAtATime {
	public static void main(String[] args) {
		System.out.println("Enter word:");
Scanner scan = new Scanner(System.in);
String word = scan.next();
for (int x = 0; x<word.length();x++) {
	System.out.println(word.charAt(x));
}
System.out.println("Enter word:");
word = scan.next();
int count = 0;
do {
	System.out.println(word.charAt(count));
	count++;
}while(count<word.length());
}
}