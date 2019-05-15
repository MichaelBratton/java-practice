package day18_while_dowhile_loop;

public class ThreadSleep {
public static void main(String[] args) throws InterruptedException {
	int num = 1;
	 
	while(num==num) {
		System.out.println(num);
		num++;
		Thread.sleep(1000);
	}
}
}
