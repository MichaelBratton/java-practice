package day39_arraylist;
import java.util.*;
public class UniqueValues {
public static void main(String[] args) {
	
	List<Integer> nums = new ArrayList<>();
	nums.add(10); nums.add(7); nums.add(10); nums.add(10); nums.add(5); nums.add(10); 
	nums.add(4); nums.add(10); nums.add(10); nums.add(3); nums.add(5); nums.add(10); 
	List<Integer> distinct = new ArrayList<>();
	//distinct values including dupes but only once
	for(Integer num: nums) {
		if(!distinct.contains(num)) {
			distinct.add(num);
		}
	}
	System.out.println("Distinct values: "+distinct.toString());
	List<Integer> unique = new ArrayList<>();
	//unique non duplicate values
	boolean unq = true;
	for(int i = 0;i<nums.size();i++) {
		unq = true;
		for(int j = 0;j<nums.size();j++) {
			if(i != j && nums.get(i)==nums.get(j)) {
				unq = false;
			}
			}
		if(unq) {
			unique.add(nums.get(i));
		}
	}
	System.out.println("Unique values: "+unique.toString());
}
}
