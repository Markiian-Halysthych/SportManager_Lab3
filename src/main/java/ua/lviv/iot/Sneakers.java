package ua.lviv.iot;

public class Sneakers extends Wear {
	private String color;

	public Sneakers() {
	}

	public String getSize() {
		return this.color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return super.toString() + ", color = " + color + ")";
	}

	@Override
	public String getType() {
		return "Sneakers";
	}
}
