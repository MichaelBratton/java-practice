package day23;

public class PrimeNumNestLoop {
public static void main(String[] args) {

	int num = 0;
	for (num = 2; num<=100; num++) {
		for(int x = 2; x<num;x++) {
			if (num%x == 0) {
				System.out.println(num+ " is not prime");
				break;
			} else if (num-1 == x){
				System.out.println(num+" is prime");
			}
			
		}
		
		}
	}
}
   


