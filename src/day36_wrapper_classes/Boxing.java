package day36_wrapper_classes;

public class Boxing {
public static void main(String[] args) {
	//AUTOBOXING
	Integer num1 = 1234;
	int n = 5;
	Integer num2 = n;
	//UNBOXING -> object >primitive
	Double d1 = new Double(34.2);
	double d2 = d1;
	System.out.println("d1: "+d1);
	System.out.println("d2: "+d2);
	
	long l1 = new Long(6000000); //unboxing
	Long l2 = new Long(345434543); //unboxing
	Long l3 = l2; // AUTOBOXING
	Long l4 = l3; // AUTOBOXING
	
	System.out.println(Integer.MIN_VALUE);
	System.out.println(Integer.MAX_VALUE);
	System.out.println(Byte.MIN_VALUE);
	System.out.println(Byte.MAX_VALUE);
	System.out.println(Character.MIN_VALUE);
	System.out.println(Character.MAX_VALUE);
	
	int count1 = Integer.parseInt("12345");
	int count2 = Integer.valueOf("42069");
	
}
}
