package ua.lviv.iot;

public class Tops extends Wear {
	private String season;

	public Tops() {
		return;
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