package ua.lviv.iot;

public class Tops extends Wear {
    private String season;

    public Tops(String brand, double price, double percentageOfCotton, String season) {
        this.setBrand(brand);
        this.setPrice(price);
        this.setPercentageOfCotton(percentageOfCotton);
        this.setSeason(season);
    }

    public Tops() {
	}

	public Tops(WearType WearType) {
	}

	public String getSeason() {
        return this.season;
    }

    public void setSeason(String season) {
        this.season = season;
    }
}