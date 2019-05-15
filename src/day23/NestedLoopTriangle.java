package day23;

public class NestedLoopTriangle {
public static void main(String[] args) {
	for (int x = 1;x<=10;x++) {
		for(int i = 1;i<=10;i++) {
			System.out.print(i+" ");
		}
		System.out.println();
	}
	System.out.println();
	for (int x = 1;x<=10;x++) {
		for(int i = 1;i<=x;i++) {
			System.out.print(i+" ");
		}
		System.out.println();
	}
	System.out.println();
	for (int x = 10;x>=1;x--) {
		for(int i = 1;i<=x;i++) {
			System.out.print(i+" ");
		}
		System.out.println();
	}
	System.out.println();
	for (int x = 1;x<=10;x++) {
		for(int i = 1;i<=10;i++) {
			if(i != x) {
			System.out.print(i+" ");
			} else {
				System.out.print("   ");
			}
		}
		System.out.println();
	}
}
}
