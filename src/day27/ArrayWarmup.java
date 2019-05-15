package day27;

import java.util.*;

public class ArrayWarmup {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] time1 = new int[2];
		int[] time2 = new int[2];
		System.out.println("Enter time1:");
		time1[0] = scan.nextInt();
		time1[1] = scan.nextInt();
		if (time1[0] > 24 || time1[0]<0 || time1[1] > 60 || time1[1]<0) {
			System.out.println("invalid!");
			return;
		}
		System.out.println("Enter time2:");
		time2[0] = scan.nextInt();
		time2[1] = scan.nextInt();
		if (time2[0] > 24 || time2[0]<0 || time2[1] > 60 || time2[1]<0) {
			System.out.println("invalid!");
			return;
		}
		if (time1[0] < time2[0]) {
			System.out.println("Time1 is earlier");
		} else if (time1[0] > time2[0]) {
			System.out.println("Time2 is earlier");
		} else if (time1[1] < time2[2]) {
			System.out.println("Time1 is earlier");
		} else if (time1[1] > time2[2]) {
			System.out.println("Time2 is earlier");
		}
	}
}
