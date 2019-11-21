package ua.lviv.iot;

public class Sneakers extends Wear {

	private String color;
	
	public Sneakers(WearType WearType) {
	}
		
		public Sneakers(String brand, double price, double percentageOfCotton, String color) {
	        this.setBrand(brand);
	        this.setPrice(price);
	        this.setPercentageOfCotton(percentageOfCotton);
	        this.setColor(color);
	    }

	    public Sneakers() {
		}

		public String getColor() {
	        return this.color;
	    }

	    public void setColor(String color) {
	        this.color = color;
	        }

}

	