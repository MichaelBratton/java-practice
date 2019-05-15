package day24;

public class CarShow {
public static void main(String[] args) {
	//step 1 create array with cars
	String[] cars = {"Cadillac", "Rolls Royce", "Porsche", "Mercedes", "Bentley, Bentayaga", "Aurus", "Dusenburg", "Lagonda", "Astin Martin", };
	//step 2 print ones that begin with a
	for(String car: cars) {
		if (car.startsWith("A")) {
			System.out.println(car);
		}
	}
	for(String car: cars) {
		if (car.contains("a")) {
			System.out.println(car);
		}
	}
}
}
