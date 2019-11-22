package ua.lviv.iot;

public class Search {

	private static boolean toggles = true;

	public static double searchByPrice(Wear[] arrWearPrice, double search) {
		int start = 0;
		int end = arrWearPrice.length - 1;
		int mid = (start + end) / 2;
		while (toggles) {
			if (arrWearPrice[mid].getPrice() == search) {
				toggles = false;
			} else {
				if (arrWearPrice[mid].getPrice() < search) {
					mid = mid + 1;
				} else {
					if (arrWearPrice[mid].getPrice() > search) {
						mid = mid - 1;
					}
				}
			}
		}
		return arrWearPrice[mid].getPrice();
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