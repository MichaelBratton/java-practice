package day24;

import java.util.Arrays;

public class SumOfNumbers {
	public static void main(String[] args) {
		// create array f ints with length of 3
		int[] nums = new int[3];
		nums[0] = 5;
		nums[1] = 20;
		nums[2] = 10;
		int sum = 0;
		System.out.println(nums);
		System.out.println(Arrays.toString(nums));
		for (int x = 0; x < nums.length; x++) {
			sum += nums[x];
		}
		System.out.println(sum);
		// find largest number in array
		int max = Integer.MIN_VALUE;
		for (int x = 0; x < nums.length; x++) {
			if (nums[x] > max) {
				max = nums[x];
			}
		}
		System.out.println(max);
		// min value
		int min = Integer.MAX_VALUE;
		for (int y = 0; y < nums.length; y++) {
			if (nums[y] < min) {
				min = nums[y];
			}
		}
		System.out.println(min);
	}
}
