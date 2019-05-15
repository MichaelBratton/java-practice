package day32_methods;

public class ArrayParams {
public static void main(String[] args) {
	int[] arr = {9, 8, 7, 6, 5, 4, 3, 2};
	printArray(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10});
	printArray(arr);
	printTwoArrays(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10},arr);
	printTwoArrays(new int[] {3, 2, 1}, arr);
	
}
public static void printArray(int[] nums) {
	for(int num: nums) {
		System.out.print(num+", ");
	}
	System.out.println();
}
public static void printTwoArrays(int[] arr1, int[] arr2) {
	if(arr1.length>arr2.length) {
		printArray(arr1);
		printArray(arr2);
	} else{
		printArray(arr2);
		printArray(arr1);
	
	}

}
}
