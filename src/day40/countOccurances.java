package day40;
import java.util.*;
public class countOccurances {
public static void main(String[] args) {
	String someWord = "dude";
	List<String> words = Arrays.asList("Yo","dude", "how you been", "dude", "?");
	System.out.println(countO(words, someWord));
}
public static int countO(List<String> list, String word) {
	int count = 0;
	for(String w:list) {
		if(w.equalsIgnoreCase(word)) {
			count++;
		}
	}
		return count;
}

}
