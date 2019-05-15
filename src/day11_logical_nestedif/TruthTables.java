package day11_logical_nestedif;

public class TruthTables {
public static void main(String[] args) {
	System.out.println("#### TRUTH TABLE FOR && OPERATOR ####");
	System.out.println("WHen true and true - result is "+(true&&true));// true
	System.out.println("WHen true and false - result is "+(true&&false));//false
	System.out.println("WHen false and true - result is "+(false&&true));//false
	System.out.println("WHen false and false - result is "+(false&&false));//false
	
	System.out.println();//add an empty line
	
	System.out.println("#### TRUTH TABLE FOR || OPERATOR ####");
	System.out.println("WHen true or true - result is "+(true||true));// true
	System.out.println("WHen true or false - result is "+(true||false));//true
	System.out.println("WHen false or true - result is "+(false||true));//true
	System.out.println("WHen false or false - result is "+(false||false));//false
	
    System.out.println();//add an empty line
	
	System.out.println("#### TRUTH TABLE FOR ! (NOT) OPERATOR ####");
	System.out.println("WHen !true - result is "+(!true));// false
	System.out.println("WHen !false - result is "+(!false));//true
}
}
