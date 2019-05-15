package day23;

public class ArrayOfStrings {
	public static void main(String[] args) {
		String[] words = new String[5];
		String[] words2 = { "hello", "my", "name", "is", "mike" };
		for (int x = 0; x < words2.length; x++) {
			System.out.print(words2[x]);
			System.out.print(" ");
		}
	}
}
