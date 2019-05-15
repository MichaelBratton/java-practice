import java.util.Scanner;
public class EnterNumber {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("type a number");
		int x = in.nextInt();
		in.close();
		System.out.println("Your number is "+x);
		
	}

}
