package day36_wrapper_classes;
import java.util.*;
public class ArrayListExample {
public static void main(String[] args) {
	ArrayList<String> languages = new ArrayList<>();
	languages.add("java");
	languages.add("English");
	languages.add("Russian");
	languages.add("Html");
	
	languages.remove(0);
	
	System.out.println(languages.toString());
}
}
