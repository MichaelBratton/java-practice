package day42;

public class Shoes {
String brand;
Double size;

public void setShoeData(String newBrand, Double newSize) {
	brand = newBrand;
	size = newSize;
}
public void displayShoeData() {
	System.out.println("Brand: "+brand+" | Size: "+size);
}

}
