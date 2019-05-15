package day43;

public class Computer {
private String brand;
private String os;
private double price;
public Computer() {
	
}
public Computer(String brand1, String os1, double price1) {
	System.out.println("Computer constructor...");
	brand = brand1;
	os = os1;
	price = price1;
}
//getters and setters

public String getBrand() {
	return brand;
}

public void setBrand(String brand) {
	this.brand = brand;
}

public String getOs() {
	return os;
}

public void setOs(String os) {
	this.os = os;
}

public double getPrice() {
	return price;
}

public void setPrice(double price) {
	this.price = price;
}

//to string method
public String toString() {
	return "Computer [brand=" + brand + ", os=" + os + ", price=" + price + "]";
}

}
