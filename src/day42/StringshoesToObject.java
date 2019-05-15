package day42;
import java.util.*;
public class StringshoesToObject {
public static void main(String[] args) {
	String data = "Bruno Magli, 9.5";
	String[] arrData = data.split(",");
	Shoes shoe = new Shoes();
	shoe.setShoeData(arrData[0], Double.parseDouble(arrData[1]));
	shoe.displayShoeData();
	
	Shoes shoe2 = new Shoes();
	Scanner scan = new Scanner(System.in);
	System.out.println("What is your size?");
	shoe2.size = scan.nextDouble();
	System.out.println("What brand would you like?");
	shoe2.brand = scan.next();
	shoe2.displayShoeData();
}
}
