package day33_methods_with_params;

public class PayCalculator {
public static double getHourlyPay(int hours, double rate) {
	double pay= hours*rate;
	if(hours<=0 || rate<=0) {
		System.out.println("You didn't make shit!!!");
		return 0;
	} else {
		return pay;
	}
}
}
