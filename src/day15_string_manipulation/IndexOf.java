package day15_string_manipulation;

public class IndexOf {
public static void main(String[] args) {
	String word1 = "github";
	System.out.println(word1.indexOf('t'));
	System.out.println(word1.indexOf("hu"));
	
	
	String word = "Java is cool";
	int x = word.indexOf("i");
	
	System.out.println(word.charAt( x + 1));
	
	
}
}
