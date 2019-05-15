package day09_stringequals_conditionals;

public class StringEquals {
	public static void main(String[] args) {
		String str1 = "java";
		String str2 = "java";

		// Using ==
		System.out.println(str1 == str2);
		System.out.println(str1 == "java");
		System.out.println(str1 == "Java");

		// Using eqauls()

		System.out.println(str1.equals(str2));
		System.out.println(str1.equals("java"));
		System.out.println(str1.equals("Java"));
	}
}
