package day41_custom_classes;
import java.util.*;
public class WarmUpWithList {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		System.out.println(doubleTheList(list));
	}
	
	
	
	
public static List<Integer> doubleTheList(List<Integer> list){
	for(int i = 0; i<list.size();i++) {
		list.set(i, list.get(i)*2);
	}
	return list;
}
}
