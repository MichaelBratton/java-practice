package day37_array_list;
import java.util.*;
public class MyCities {
public static void main(String[] args) {
	ArrayList<String> cities = new ArrayList<>();
	cities.add("Moscow");
	cities.add("D.C");
	cities.add("Baku");
	cities.add("New York");
	
	System.out.println(cities.toString());
	
	for(String city: cities) {
		System.out.print(city+" | ");
	}
	System.out.println();
	
	for(int i = 0; i < cities.size();i++) {
		System.out.print(cities.get(i)+" | ");
	}
	
}
}
