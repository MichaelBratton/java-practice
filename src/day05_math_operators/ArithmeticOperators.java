package day05_math_operators;

public class ArithmeticOperators {
public static void main(String[] args) {
	int chairs = 140;
	int moreChairs = chairs+2;
	int tables = 130;
	int total = tables+chairs;
	System.out.println(55+5);
	System.out.println(chairs+2);
	System.out.println(moreChairs);
	System.out.println(total);
	//Addition
	int linesOfCode = 50;
	System.out.println("Lines of code "+linesOfCode);
	linesOfCode = linesOfCode - 2;
	System.out.println("Lines of code "+linesOfCode);
	//Multiplication
	System.out.println(6*8);
	System.out.println(linesOfCode*2);
	//division
	System.out.println(10/3);//returns back an integer and ignore remainder
	System.out.println(10.0/3);//able to return exact division value bc 10.0 is float
}
}
