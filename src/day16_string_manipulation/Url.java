package day16_string_manipulation;
import java.util.*;
public class Url {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter url:");
	String domain, extension;
	String url = scan.next();
	scan.close();
	if (url.startsWith("www.") && url.charAt(url.length()-4) == '.'){
		int firstDot = url.indexOf(".");
		int secondDot = url.lastIndexOf(".");
		extension = url.substring(secondDot, url.length());
		domain = url.substring(firstDot+1, secondDot);
		
		System.out.println("Domain: "+domain);
		System.out.println("Extension: "+extension);
		
	
	}else {
		System.out.println("Invalid format!");
		return;
	}
}
}