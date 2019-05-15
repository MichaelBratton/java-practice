package day27;

import java.util.Arrays;

public class EqualsMethod {
public static void main(String[] args) {
	String[] arr1 = {"one", "two", "three", "four"};
	String[] arr2 = {"one", "two", "three", "four"};
	String[] arr3 = {"One", "Two", "Three", "Four"};
	System.out.println(Arrays.equals(arr1, arr2));
	System.out.println(Arrays.equals(arr1, arr3));
	
}
}
