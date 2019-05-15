package day12_switch_ternary;
import java.util.*;
public class CalculatorV2 {
public static void main(String[] args) {
	double n1, n2, sum;
	sum = 0.0;
	String op;
	Scanner in = new Scanner(System.in);
	System.out.println("Enter first number:");
	n1 = in.nextDouble();
	System.out.println("Enter operator:");
	op = in.next();
	System.out.println("Entersecond number:");
	n2 = in.nextDouble();
	switch (op) {
	case "+":
		sum = n1 + n2;
		break;
	case "-":
		sum = n1 - n2;
		break;
	case "*":
		sum = n1 * n2;
		break;
	case "/":
		sum = n1 / n2;
		break;
	case "%":
		sum = n1 % n2;
		break;
	}
	System.out.println(sum);
	in.close();
}
}
