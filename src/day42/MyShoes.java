package day42;

public class MyShoes {
	public static void main(String[] args) {
Shoes shoe1 = new Shoes();
shoe1.setShoeData("Balenciaga", 11.5);

Shoes shoe2 = new Shoes();
shoe2.setShoeData("Nike", 12.0);

Shoes shoe3 = new Shoes();
shoe3.setShoeData("Addidas", 11.0);

Shoes[] shoesArray = new Shoes[3];
shoesArray[0] = shoe1;
shoesArray[1] = shoe2;
shoesArray[2] = shoe3;

for(int i = 0;i<shoesArray.length;i++) {
	shoesArray[i].displayShoeData();
}
for(int i = 0;i<shoesArray.length;i++) {
	System.out.println(shoesArray[i].brand);
}
	}
	}
