package day27;
import java.util.*;
public class CopyOfMethod {
public static void main(String[] args) {
	double[] d1 = {2.3, 4.5, 12.4};
	double[] d2 = d1;
	double[] d3 = Arrays.copyOf(d1, d1.length);
	
	System.out.println(Arrays.toString(d1));
	System.out.println(Arrays.toString(d2));
	System.out.println(Arrays.toString(d3));
	
	d1[0]=1000.3;

	System.out.println(Arrays.toString(d1));
	System.out.println(Arrays.toString(d2));
	System.out.println(Arrays.toString(d3));
}
}
