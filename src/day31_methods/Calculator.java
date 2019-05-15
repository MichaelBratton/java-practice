package day31_methods;
import java.util.*;
public class Calculator {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter first number:");
	double num1 = scan.nextDouble();
	System.out.println("Enter operator:");
	String op = scan.next();
	System.out.println("Enter second number:");
	double num2 = scan.nextDouble();
	if(op.equalsIgnoreCase("subtract")) {
		subtract(num1, num2);
	} else if(op.equalsIgnoreCase("add")) {
		add(num1, num2);
	} else if(op.equalsIgnoreCase("multiply")) {
		multiply(num1, num2);
	} else if(op.equalsIgnoreCase("divide")) {
		divide(num1, num2);
	} else if(op.equalsIgnoreCase("remainder")) {
		remainder(num1, num2);
	}
}
public static void subtract(double num1, double num2) {
	System.out.println(num1-num2);
}
public static void add(double num1, double num2) {
	System.out.println(num1+num2);
}
public static void multiply(double num1, double num2) {
	System.out.println(num1*num2);
}
public static void divide(double num1, double num2) {
	System.out.println(num1/num2);
}
public static void remainder(double num1, double num2) {
	System.out.println(num1%num2);
}
}
