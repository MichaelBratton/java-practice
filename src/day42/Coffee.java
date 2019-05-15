package day42;

public class Coffee {
String name;
String size;
Double price;
int calories;

public void getCoffeeInfo() {
	String info = name.toUpperCase()+" | Size: "+size+" | Price: "+price+" | Calories: "+calories;
	System.out.println(info);
}
public void setData(String newName, Double newPrice, String newSize, int newCal) {
	name = newName;
	price = newPrice;
	if(newSize.equalsIgnoreCase("Small") || newSize.equalsIgnoreCase("Medium") || newSize.equalsIgnoreCase("Large")) {
		size = newSize;
	} else {
		System.out.println("ERROR");
	}
	calories = newCal;
}



public void setName(String newName) {
	name = newName;
}
public void setPrice(Double newPrice) {
	price = newPrice;
}
public void setSize(String newSize) {
	if(newSize.equalsIgnoreCase("Small") || newSize.equalsIgnoreCase("Medium") || newSize.equalsIgnoreCase("Large")) {
		size = newSize;
	}
}
	public void setCalories(int newCal){
		calories = newCal;
	}
}

