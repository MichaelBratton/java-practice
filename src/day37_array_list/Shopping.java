package day37_array_list;
import java.util.*;
public class Shopping {
public static void main(String[] args) {
	ArrayList<String> items = new ArrayList<>();
	items.add("Guuci Slippers");
	items.add("Fedni Rug");
	items.add("Supreme Brick");
	items.add("Louis Vuiton Towel");
	items.add("Armani Pen");
	
	int count = items.size();
	System.out.println("Total count: "+count);
	System.out.println(items.toString());
	System.out.println(items.get(0)+" | "+items.get(count-1));
	items.remove("Supreme Brick");
	System.out.println(items.toString());
	
	for(String item: items) {
		System.out.println(item);
		
		items.clear();
		System.out.println(items.toString());
		
	}
}
}
