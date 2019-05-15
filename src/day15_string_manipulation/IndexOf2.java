package day15_string_manipulation;

public class IndexOf2 {
public static void main(String[] args) {
	//index of with 2 inputs
	
	String list = "html-selenium-angular-jenkins-grid";
	int firstDash = list.indexOf("-");
	System.out.println("First dash: "+firstDash);
	
	int secondDash = list.indexOf("-", 5);  //means start searching for dash from 5th index onwards
	System.out.println("Second dash: "+secondDash);
	
	int thirdDash = list.indexOf("-", secondDash+1);
	System.out.println("Third dash: "+thirdDash);
	
	int lastDash = list.lastIndexOf("-");
	System.out.println("Last dash: "+lastDash);
	
}
}
