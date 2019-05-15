package day07_Scanner;


public class PreAndPost {
	public static void main(String[] arg) {
		int num=0;
		int num2=num++;
				System.out.println("num: "+num);
				System.out.println("num2: "+num2);
		int n=0;
		int n2=++n;
		        System.out.println("n: "+n);
		        System.out.println("n2: "+n2);
		        
		int bannanas = 6;
		int pears = bannanas++;
		int apples = ++bannanas;
		
		System.out.println("Bannanas: "+bannanas);
		System.out.println("Pears: "+pears);
		System.out.println("Apples: "+apples);
		
		int p1=10;
		int p2=10;
		int sum= p1++ + 5;
		int sum2= ++p2 +5;	
		System.out.println(sum);
		System.out.println(sum2);
		
		int bat = 8;
		int obat = 5;
		int totbat = bat++ + ++obat;
		System.out.println("bat: "+bat);
		System.out.println("obat: "+obat);
		System.out.println("totbat: "+totbat);
		
	}

}
