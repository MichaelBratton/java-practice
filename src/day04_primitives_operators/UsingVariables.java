package day04_primitives_operators;

public class UsingVariables {
public static void main(String[] args) {
	int num1, num2, num3;
	num1 = 100;
	num2 = num1;
	System.out.println(num1);
    System.out.println(num2);
	num2 = 200;
	num1 = num2;
	num3 = num1;
	System.out.println(num1);
	System.out.println(num2);
	System.out.println(num3);
	int Apples = 25;
	int Kiwis = Apples;
	int Mangos = 55;
	Kiwis = Mangos;
	System.out.println(Apples);
	System.out.println(Kiwis);
	System.out.println(Mangos);
	
	
}
}
