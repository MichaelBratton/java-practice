package day24;

public class CharToStar {
public static void main(String[] args) {
	String str = "hello my name is mike";
	char[] letters = str.toCharArray();
	for(char letter: letters) {
		if(letter=='e') {
			System.out.print('*');
		} else {
			System.out.print(letter);
		}
	}
}
}
