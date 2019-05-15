package day23;

public class ContinuePractice {
	public static void main(String[] args) {
		String str = "java";
		for(int x = 0; x<str.length()-1;x++) {
			if(str.substring(x, x+1).equals("a")) {
				continue;
			}
			System.out.println(str.substring(x, x+1));
		}
	}
}
