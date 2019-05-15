package day15_string_manipulation;

public class GoogleSearchTest {
public static void main(String[] args) {
	String item = "java";
	String pageTitle = item + " - Google Search";
	
	//Test if page title starts with item
	if(pageTitle.startsWith(item)) {
		System.out.println("Page title check passed!");
	} else {
		System.out.println("Page title check failed!");
	}
}
}
