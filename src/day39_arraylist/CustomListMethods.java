package day39_arraylist;
import java.util.*;
public class CustomListMethods {
	public static void main(String[] args) {
		ArrayList<Integer> numsList = new ArrayList<>();
		numsList.add(10);
		numsList.add(10);
		numsList.add(7);
		numsList.add(8);
		numsList.add(8);
		numsList.add(3);
		numsList.add(4);
		numsList.add(8);
		printList(numsList);

		List<Double> doubleList = new ArrayList<>();
		doubleList.add(10.33);
		doubleList.add(10.22);
		doubleList.add(7.34);
		doubleList.add(8.99);
		doubleList.add(8.12);
		doubleList.add(3.55);
		doubleList.add(4.76);
		doubleList.add(8.08);
		
		System.out.println( sumList(doubleList) );
		double sum  = sumList(doubleList);
		System.out.println("Sum: " + sum);
		System.out.println(randomList(15));
		
	}

	public static void printList(ArrayList<Integer> nums) {
		for (Integer n : nums) {
			System.out.print(n + " ");
		}
		System.out.println();
	}

	public static double sumList(List<Double> dList) {
		double sum = 0.0;
		for (double d : dList) {
			sum += d;
		}
		return sum;
	}
public static List<Integer> randomList(int size){
	Random rand = new Random();
	List<Integer> nums = new ArrayList<>();
	for(int i = 0; i<size;i++) {
		nums.add(rand.nextInt(25));
	}
	return nums;
}

}

