package day12_switch_ternary;
import java.util.*;
public class CalclatorV1 {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	double n1, n2, sum;
	String op;
	System.out.println("Enter first number: ");
	n1 = in.nextDouble();
	System.out.println("Enter Operator");
	op = in.next();
	System.out.println("Enter second number: ");
	n2 = in.nextDouble();
	
	if (op.equals("+")) {
		sum = n1 + n2;
		System.out.println(sum);
	}  else if (op.equals("-")) {
		sum = n1 - n2;
		System.out.println(sum);
	} else if (op.equals("/")) {
		sum = n1 / n2;
		System.out.println(sum);
	} else if (op.equals("*")) {
		sum = n1 * n2;
		System.out.println(sum);
	} else if (op.equals("%")) {
		sum = n1 % n2;
		System.out.println(sum);
	} else {
		System.out.println("Invalid operator");
	}
	
	
	
	
}
}
