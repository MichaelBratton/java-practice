package day36_wrapper_classes;
import java.util.*;
public class ArrayListIntro {
public static void main(String[] args) {
	//create an arraylist 
	String[] str = new String [5];
	ArrayList<String> names = new ArrayList<>();
	
	int[] numsArray = new int[5];
	ArrayList<Integer> nums = new ArrayList<>();
	
	names.add("Jeffery");
	names.add("Charles");
	names.add("Mike");
	names.add("Alex");
	names.add("SAM");
	System.out.println(names.get(0));
	System.out.println(names.get(1));
	System.out.println(names.get(2));
	
	System.out.println("Names count: "+names.size());
	System.out.println("Numbers count: "+nums.size());
	
	nums.add(10);
	nums.add(100);
	nums.add(1000);
	nums.add(10000);
	nums.add(100000);
	nums.add(1000000);
	nums.add(10000000);
	
	
}
}
