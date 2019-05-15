package day31_methods;
import java.util.*;
public class Validator {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("enter username:");
	String username = scan.next();
	System.out.println("enter password:");
	String password = scan.next();
	login(username, password);
}
public static void login(String userName, String password) {
	String validUN = "practice@email.com";
	String validPass = "qwer1234";
	
	if(userName.equals(validUN) && password.equals(validPass)) {
		System.out.println("Login Succesful!\nWelcome "+userName);
	} else {
		System.out.println("Login Failed");
	}
}
}
