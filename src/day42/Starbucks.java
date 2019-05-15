package day42;

public class Starbucks {
public static void main(String[] args) {
	Coffee[] coffeeArray = new Coffee[2];
	coffeeArray[0] = new Coffee();
	coffeeArray[0].setData("expresso",2.55,  "medium", 70);
	coffeeArray[0].getCoffeeInfo();
	
	Coffee latte = new Coffee();
	latte.setData("Latte", 4.20,"large" , 15);
	coffeeArray[1] = latte;
	coffeeArray[1].getCoffeeInfo();
	
	
}
}
