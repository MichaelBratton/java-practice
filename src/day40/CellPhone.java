package day40;

public class CellPhone {
String brand; //null
double screenSize;
String color;
double price;
public void call() {
	System.out.println("Calling....");
}
public void text() {
	System.out.println("Sending text......");
}
public static void main(String[] args) {
	CellPhone cell1 = new CellPhone();
	System.out.println(cell1.brand);
	System.out.println(cell1.screenSize);
	cell1.brand = "Nokia 6300";
	cell1.screenSize = 2.0;
	cell1.color = "Silver";
	cell1.price = 76.16;
	System.out.println(cell1.brand);
	System.out.println(cell1.screenSize);
	System.out.println(cell1.color);
	System.out.println(cell1.price);
	CellPhone cell2 = new CellPhone();
	
	
}
}
