package day33_methods_with_params;

public class AgeCalculator {
public static String age(int year) {
	int age = 2019-year;
	String cat = "";
	if(age>1 && age<15) {
		cat = "child";
	} else if(age>14 && age<26) {
		cat = "baller";
	} else if(age>25 && age<65) {
		cat = "adult";
	} else {
		cat = "senior";
	}
	cat += "Age: "+Integer.toString(age)+"\n";
	return cat;
	
}
}
