package day03;
import java.util.Scanner;
public class HelloName{
	public static void main(String[] args) {
		String Name;
		Scanner Input = new Scanner(System.in);
		System.out.println("What is your name?");
		Name = Input.nextLine();
		System.out.println("Hello "+ Name);
		Input.close();
		
	}
}
