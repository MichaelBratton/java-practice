package day32_methods;
import java.util.*;
public class MethodWithReturn {
public static void main(String[] args) {
	System.out.println(giveMe10());
	System.out.println(name());
}
public static int giveMe10() {
	return 10;
}
public static String name() {
	Scanner scan = new Scanner(System.in);
	return scan.next();
}
}
