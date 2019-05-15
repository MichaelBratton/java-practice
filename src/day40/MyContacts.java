package day40;

public class MyContacts {
public static void main(String[] args) {
	Contact contact1 = new Contact();
	contact1.name = "Mike Braton";
	contact1.phoneNumber = "(301)-631-4850";
	contact1.email = "brattonmike@mail.com";
	contact1.call();
	contact1.text();
	contact1.email();
}
}
