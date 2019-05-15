package day41_custom_classes;

public class Car {
	String make;
	String model;
	int currentSpeed;
	String color;
	int price;

	public void printCarInfo() {
		System.out.println(
				"Car Make: " + make + "\nModel: " + model + "\nColor" + color + "\nCurrent Speed: " + currentSpeed);
	}

	public void showCurrentSpeed(int speedLimit) {
		if (speedLimit <= currentSpeed) {
			System.out.println(make + " is driving at " + currentSpeed + "mph | following the speed limit of "
					+ speedLimit + "mph");
		} else {
			System.out.println(
					make + " is driving at " + currentSpeed + "mph | over the speed limit of " + speedLimit + "mph");
		}
	}
	
	public void drive() {
		System.out.println(make+" "+model+" is driving");
	}
	
	public void accelerate(int speed) {
		currentSpeed += speed;
	}
}
