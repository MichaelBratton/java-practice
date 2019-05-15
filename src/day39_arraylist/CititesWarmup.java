package day39_arraylist;
import java.util.*;
public class CititesWarmup {
public static void main(String[] args) {
	ArrayList<String> cities = new ArrayList<>();
    
    cities.add("Tokyo");
    cities.add("New York");
    cities.add(0,"Paris");
    cities.add("Pittsburgh");
    cities.add(1,"Berlin");
    cities.add("Madrid");
    cities.add("Moscow");
    cities.add("Istanbul");
    cities.add("Washington D.C.");
    cities.add("Amsterdam");
    cities.add("Lima");
    cities.add("Zurich");
    cities.add("Singapore");
    cities.add("Milan");
    cities.add("Toronto");
    cities.add("London");
    //print all using for each
    for(String city:cities) {
    	System.out.print(city+" | ");
    }
    //
    System.out.println();
    //print all using for loop
    for(int i = 0; i<cities.size(); i++) {
    	System.out.print(cities.get(i)+" | ");
    }
    System.out.println();
    //print all as uppercase
    System.out.println(cities.toString().toUpperCase());
    
    //convert all values to uppercase
    for(int i = 0; i<cities.size(); i++) {
    	cities.set(i, cities.get(i).toUpperCase());
    }
    System.out.println(cities.toString());
    
    //find the longest and shortest city
    String longest = "";
    String shortest = cities.get(0);
    for(int i = 0; i<cities.size(); i++) {
    	if(cities.get(i).length()>longest.length()) {
    		longest = cities.get(i);
    	}
    	if(cities.get(i).length()<shortest.length()) {
    		shortest = cities.get(i);
    	}
    }
    System.out.println("Longest city name: "+longest);
    System.out.println("Shortest city name: "+shortest);
    
    //assign all cities with length of 6 or more to new arraylist
    
    List<String> longC = new ArrayList<>();
    for(String city: cities) {
    	if(city.length()>=6) {
    		longC.add(city);
    	}
    }
    System.out.println(longC.toString());
    
    
}
}
