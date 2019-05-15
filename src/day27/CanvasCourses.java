package day27;
import java.util.*;
public class CanvasCourses {
public static void main(String[] args) {
	String url = "https://learn.cybertekschool.com/courses/144";
	int course = 0;
	String[] words = url.split("/");
	if (words[(words.length)-1].equals("144")) {
		course = 144;
	} else if (words[(words.length)-1].equals("143")) {
		course = 143;
	} else if (words[(words.length)-1].equals("149")) {
		course = 149;
	} else if (words[(words.length)-1].equals("147")) {
		course = 147;
	} else if (words[(words.length)-1].equals("152")) {
		course = 152;
	} else if (words[(words.length)-1].equals("204")) {
		course = 204;
	}
	switch(course) {
	case 143:
		System.out.println("Welcome Kit!");
		break;
	case 144:
		System.out.println("Team Activity");
		break;
	case 149:
		System.out.println("SDLC");
		break;
	case 147:
		System.out.println("JAVA Programing");
		break;
	case 152:
		System.out.println("QA Testing");
		break;
	case 204:
		System.out.println("VA Mentoring");
		break;
		default:
			System.out.println("Invalid Last IDX");
	}
}
}
