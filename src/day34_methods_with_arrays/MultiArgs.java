package day34_methods_with_arrays;

public class MultiArgs {
public static void main(String[] args) {
	printWords("red", "blue");
	System.out.println();
	System.out.println(sum(10,7,9));
}
public static void printWords(String... words) {
	for(String word: words) {
		System.out.println(word+"");
	}
}
public static int sum(int... nums) {
	int sum = 0;
	for(int num: nums) {
		sum+=num;
	}
	return sum;
}

}
