package day43;

public class MyComp {
public static void main(String[] args) {
	Computer comp = new Computer();
	Computer computer = new Computer();
	System.out.println(comp.toString());
	System.out.println(computer.toString());
	comp.setBrand("iMac");
	comp.setOs("Mac Os High Siera");
	comp.setPrice(1999.99);
	
	computer.setBrand("HP");
	computer.setOs("Windows 10");
	computer.setPrice(699.99);
	
}
}
