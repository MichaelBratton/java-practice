package day34_methods_with_arrays;

import java.util.*;

public class CountArray {
public static void main(String[] args) {
	int[] nums = {2,2,2,4,4,4,4,5,5,6,6,6,7,8,8,8,9,9,9};
	System.out.println("5's values: "+findOcurences(nums, 5));
	if(findOcurences(nums, 5)>0) {
		System.out.println("We have 5's");
	} else {
		System.out.println("No 5's");
	}
	System.out.println("8's values: "+findOcurences(nums, 8));
	if(findOcurences(nums, 8)>0) {
		System.out.println("We have 8's");
	} else {
		System.out.println("No 8's");
	}
	System.out.println(Arrays.toString(getArray()));
}
public static int findOcurences(int[] arr, int val) {
	int count = 0;
	for(int ar: arr) {
		if(ar == val) {
			count++;
		}
	}
	return count;
}
public static int[] getArray() {
	int [] ray = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
	return ray;
}
public static String getRandomArray(int size) {
	Random rand = new Random();
	int[] randomRay = new int[size];
	for (int i = 0; i<size;i++) {
		randomRay[i] = rand.nextInt(2);
	}
	String bin = "";
	for(int i= 0; i<size;i++) {
		bin+=randomRay[i];
	}
	return bin;
	
}
}
