package day15_string_manipulation;

public class StartsWithEndsWith {
public static void main(String[] args) {
	String word = "eclipse";
	System.out.println(word.startsWith("e"));
	System.out.println(word.startsWith("ec"));
	System.out.println(word.startsWith("eC"));
	System.out.println(word.endsWith("e"));
	System.out.println(word.endsWith("se"));
	System.out.println(word.endsWith("E"));
	
	
	String name = "Mr. Jackson";
	if (name.startsWith("Mr.")) {
		System.out.println("Man");
	} else if (name.startsWith("Mrs.")) {
		System.out.println("Married Woman");
	} else if (name.startsWith("Ms.")) {
		System.out.println("Woman");
	} else if (name.startsWith("Dr.")) {
		System.out.println("Doctor");
	} else {
		System.out.println("Unknown Status!");
	}
}
}
