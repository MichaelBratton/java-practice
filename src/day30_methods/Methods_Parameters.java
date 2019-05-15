package day30_methods;

public class Methods_Parameters {
public static void main(String[] args) {
	study("Java");
	study("Math");
}
public static void study(String topic) {
	System.out.println("Student is studying "+topic);
}
public static void sleep(int hours) {
	System.out.println("Student slept for "+hours+" hours");
}

}
