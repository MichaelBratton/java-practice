package day42;

public class MyCoffee {
	public static void main(String[] args) {
		//Coffee 1
Coffee coffee1 = new Coffee();
coffee1.name = "ICED CARAMEL MOCA";
coffee1.calories = 250;
coffee1.size = "Small";
coffee1.price = 4.75;
coffee1.getCoffeeInfo();

//Coffee 2
Coffee coffee2 = new Coffee();
coffee2.name = "JAVA CHAI";
coffee2.calories = 150;
coffee2.size = "Large";
coffee2.price = 6.80;
coffee2.setName("BLACK");
coffee2.getCoffeeInfo();
	}
}
