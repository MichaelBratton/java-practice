package day38_arraylist;
import java.util.*;
public class AddAll {
public static void main(String[] args) {
	List<String> l1 = new ArrayList<>();
	l1.add("java");
	l1.add("python");
	List<String> l2 = new ArrayList<>();
	l2.add("C#");
	l2.add("C++");
	l2.addAll(l1);
	
}
}
