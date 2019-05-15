package day20_forloop;

public class IndexOf {
public static void main(String[] args) {
	String word = "amazon";
	char letter = 'a';
	int index = -1;
	for (int x=0;x<word.length();x++) {
		if (word.charAt(x)==letter) {
			index = x;
			break;
		}
		}
	System.out.println("Index: "+index);
}
}
