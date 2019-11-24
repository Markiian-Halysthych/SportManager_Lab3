package ua.lviv.iot;

public abstract class Wear {

	private Long id;
	private static String brand;
	private static double price;
	private static double percentageOfCotton;
	private static WearType wearType;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getPercentageOfCotton() {
		return percentageOfCotton;
	}

	public void setPercentageOfCotton(double percentageOfCotton) {
		this.percentageOfCotton = percentageOfCotton;
	}

	public WearType getWearType() {
		return wearType;
	}

	public void setWearType(WearType wearType) {
		this.wearType = wearType;
	}

	public abstract String getType();

	@Override
	public String toString() {
		return getType() + "(" + ", brand = " + brand + ", price = " + price + ", cotton = " + percentageOfCotton
				+ ", type = " + wearType;
	}

	public static String getHeaders() {
		return "Brand, Price, Cotton, Type";
	}

	public static String toCSV() {
		return brand + ", " + price + ", " + percentageOfCotton + ", " + wearType;
	}

}
