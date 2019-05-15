package day43;

public class Tesla {
	private String model;
	private int range;
	private double zeroToSixty;
	private double price;

	public boolean isValidModel(String model) {
		if (model.equalsIgnoreCase("model s") || model.equalsIgnoreCase("model x") || model.equalsIgnoreCase("model 3")
				|| model.equalsIgnoreCase("roadster")) {
			return true;
		}
		return false;
	}
public void setData(String model, int range, double zeroToSixty, double price) {
	if (isValidModel(model)) {
		this.model = model;
	} else {
		System.out.println(model + " is not a recognized Tesla model");
		this.model = "unknown";
	}
	this.range = range;
	this.zeroToSixty = zeroToSixty;
	this.price = price;
}
	public void setModel(String model) {
		if (isValidModel(model)) {
			this.model = model;
		} else {
			System.out.println(model + " is not a recognized Tesla model");
			this.model = "unknown";
		}
	}

	public String getModel() {
		return model;
	}

	public void setRange(int range) {
		this.range = range;
	}

	public int getRange() {
		return range;
	}

	public void setZeroToSixty(double zeroToSixty) {
		this.zeroToSixty = zeroToSixty;
	}

	public double getZeroToSixty() {
		return zeroToSixty;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return "Tesla [model=" + model + ", range=" + range + ", zeroToSixty=" + zeroToSixty + ", price=" + price + "]";
	}

}
