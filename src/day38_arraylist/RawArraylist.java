package day38_arraylist;
import java.util.*;
public class RawArraylist {
public static void main(String[] args) {
	ArrayList list = new ArrayList();
	list.add("Hello");
	list.add("GoodDay");
	list.add(69);
	list.add(420);
	list.add(3.1415926);
	list.add(1.6);
	list.add(true);
	list.add(false);
	//u dont have to use to string when printing the whole 
	System.out.println(list);
	String allValues = list.toString();
	System.out.println(allValues);
	String firstVal = list.get(0).toString();
	System.out.println(firstVal);
	
}
}
