package day43;
import java.util.*;
public class TeslaDealer {
	public static Tesla testDrive(String model) {
		System.out.println("-Hi wi would like to test drive the "+model);
		System.out.println("Sure, let me build the object and rfeturn it momentarily");
		Tesla car = new Tesla();
		car.setData("Model S", 350, 3.5,80000);
		return car;
	}
	
	public static void buy(Tesla object) {
		System.out.println("Purchasing: "+object.getModel()+", for: $"+object.getPrice());
	}
	
	
	public static void main(String[] args) {
Tesla tesla = new Tesla();
tesla.setModel("Roadster");
tesla.setPrice(200000);
tesla.setRange(620);
tesla.setZeroToSixty(1.9);

Tesla tesla1  = new Tesla();
tesla1.setModel("Model X");
tesla1.setPrice(105000);
tesla1.setRange(350);
tesla1.setZeroToSixty(3.2);


Tesla cadi = new Tesla();
cadi.setModel("Deville");
cadi.setPrice(5000);
cadi.setRange(400);
cadi.setZeroToSixty(7.8);


ArrayList<Tesla> carRay = new ArrayList<>();
carRay.add(tesla);
carRay.add(cadi);
carRay.add(tesla1);
for(int i = 0;i<carRay.size();i++) {
	//toString method i created calls itself when trying to print object of class
	System.out.println(carRay.get(i));
}
System.out.println(tesla.getZeroToSixty()<cadi.getZeroToSixty() ? "Roadster is Faster" : "Deville is Faster");

buy(tesla);
Tesla testCar = testDrive("Model 3");
System.out.println(testCar);




// iwasdrunk yeserday made a poor assesment of what usaid and in retrospect will accept her number 
	}
}
