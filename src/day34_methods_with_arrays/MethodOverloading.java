package day34_methods_with_arrays;

public class MethodOverloading {
public static void main(String[] args) {
	sum("hi", "there");
	sum(4, 5);
}
public static void sum(int num1, int num2) {
	System.out.println(num1+num2);
}
public static void sum(String word1, String word2) {
	System.out.println(word1+" "+word2);
}
}
