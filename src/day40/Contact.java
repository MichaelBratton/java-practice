package day40;

public class Contact {
String name;
String phoneNumber;
String email;
public void call() {
System.out.println("Calling "+name+"...");	
}
public void text() {
	System.out.println("Sending text to "+phoneNumber+"| Name: "+name);
}
public void email() {
	System.out.println("Sending email to "+name+" | "+email);
}
}
