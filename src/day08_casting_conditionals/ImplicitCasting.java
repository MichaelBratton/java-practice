package day08_casting_conditionals;

public class ImplicitCasting {
	public static void main(String[] args) {
		short shortValue = 3455;
		int intValue = shortValue;
		System.out.println("intValue: "+intValue);
		
		double price = 345;
		System.out.println("Price: "+price);
		
		double price1 = 230.50;
		int dollars = (int)price;
		System.out.println("Price: "+price1);
		System.out.println("Dollars: "+ dollars);
		
		
		

	}
}
