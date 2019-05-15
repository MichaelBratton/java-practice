package day41_custom_classes;

public class MyCars {
public static void main(String[] args) {
	Car cadi = new Car();
	cadi.model = "Coupe Deville";
	cadi.make = "Cadillac";
	cadi.color = "Black";
	cadi.currentSpeed = 42;
	
	
	Car mazi = new Car();
	mazi.model = "3 hatch sport";
	mazi.make = "Mazda";
	mazi.color = "Red";
	mazi.currentSpeed = 69;
	
	cadi.printCarInfo();
	mazi.printCarInfo();
	cadi.showCurrentSpeed(35);
	mazi.showCurrentSpeed(70);
	cadi.drive();
	mazi.drive();
	cadi.accelerate(10);
	mazi.accelerate(15);
	cadi.printCarInfo();
	mazi.printCarInfo();
}
}
