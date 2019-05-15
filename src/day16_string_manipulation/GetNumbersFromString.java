package day16_string_manipulation;

public class GetNumbersFromString {
public static void main(String[] args) {
	String sentence = "I wrote [236] lines of code today";
	//print the number between [ ]
	int start, end;
	start = sentence.indexOf('[')+1;
	end = sentence.indexOf(']');
	String count = sentence.substring(start, end);
	System.out.println("Lines of code: "+count);
	System.out.println("Lines of code: "+sentence.substring(sentence.indexOf('[')+1, sentence.indexOf(']')));
	//check if count > 20;
	int count1 = Integer.parseInt(count); //convert string to int.
	if (count1>20) {
		System.out.println("You wote more than 20 lines of code today!");
	} else {
		System.out.println("Not enough coding for today!");
	}
}
}
