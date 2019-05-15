package day35_practice_day;

import java.util.*;

public class UniqueArray {
	public static void main(String[] args) {
System.out.println(Arrays.toString(unique(new int[] {1,1,2,4,2,546,3,3,36,5,5,5,5,5})));
	}

public static int[] unique(int[] nums) {
	
	int count = 0;
	int c = 0;
	for(int i = 0; i<nums.length;i++) {
		c = 0;
	for(int j = 0; j<nums.length;j++) {
		if(nums[i]==nums[j]&& i!=j) {
			c++;
		}
	}
	if (c==0) {
		count++;
	}
	}
	int x = 0;
	int[] unq = new int[count];
	for(int i = 0; i<nums.length;i++) {
		c = 0;
	for(int j = 0; j<nums.length;j++) {
		if(nums[i]==nums[j] && i!=j) {
			c++;
		}
	}
	if (c==0) {
		unq[x] = nums[i];
		x++;
	}
	}
	
	return unq;
}
}
