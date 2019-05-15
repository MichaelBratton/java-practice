package day28;
import java.io.*;
import java.nio.file.*;
import java.util.*;
public class FastFoodRestaurants {
public static void main(String[] args) throws IOException {
	String[] data = Files.readAllLines(Paths.get("FastFoodRestaurants.csv")).toArray(new String[0]);
	System.out.println(data.length);
	
	//print first row
	System.out.println(data[0]);
	System.out.println(data[1]);
	//print last restaurant
	System.out.println(data[data.length-1]);
	//print each in seperate lines
	int counter = 0;
	for(String dat: data) {
		System.out.println("#"+data[counter]);
		counter++;
	}
	
	
}
}
