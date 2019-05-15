package day24;

public class CheckFirstAndLastValue {
public static void main(String[] args) {
	//checks to see if first and last values of array are equal
	int[] nums = {12,41,213, 21, 42, 12};
	boolean equals = nums[0] == nums[nums.length-1];
	System.out.println(equals);
}
}
