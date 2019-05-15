package day38_arraylist;

import java.util.*;

public class ContainsAll {
public static void main(String[] args) {
	List<Integer> nums1 = new ArrayList<>();
	nums1.add(10); nums1.add(20); nums1.add(30); nums1.add(40);
	List<Integer> nums2 = new ArrayList<>();
	nums2.add(30); nums2.add(20); nums2.add(10); nums2.add(40);
	
	if(nums1.containsAll(nums2)) {
		System.out.println("Nums 1 contains all nums 2");
	}
	
}
}
