package day08_casting_conditionals;

public class CastingPrimitives {
public static void main(String[] args) {
	int i = (int)3.4;
	System.out.println("i: "+i);
	
	double price = 230.50;
	int dollars = (int)price;
	System.out.println("Price: "+price);
	System.out.println("Dollars: "+ dollars);
	
	int count = 244;
	byte byteCount = (byte)count;
	
	System.out.println("ByteCount: "+byteCount);
	
	double num1 = 10.0;
	double num2 = 3.1;
	int sum = (int)(num1/num2);
	System.out.println("Sum: "+sum);
	
	
	
}
}
