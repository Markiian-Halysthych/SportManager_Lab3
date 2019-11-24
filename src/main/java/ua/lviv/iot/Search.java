package ua.lviv.iot;

public class Search {

	public static String searchByPrice(Wear[] arrWearPrice, double search) {
		StringBuilder result = new StringBuilder();
		
		boolean toggles = true;
		int start = 0;
		int end = arrWearPrice.length;
		while (toggles) {
			if (arrWearPrice[start].getPrice() == search) {
				result.append("searched price: ");
				toggles = false;
			} else {
				start = start + 1;
			}
			{
				if (arrWearPrice[start].getPrice() > search) {
					result.append("no wear with this price");
					result.append("the nearest price: ");
					toggles = false;
				}
			}
		}
		return result.toString() + arrWearPrice[start].getPrice();
	}

	public static String searchByBrand(Wear[] arrBrand, String[] arrSearchBrand) {
		String searchBrand = arrSearchBrand[0];
		for (int i = 1; i < arrBrand.length; i++) {
			if (arrBrand[i].getBrand() == searchBrand) {
			}
		}
		return searchBrand;
	}
}