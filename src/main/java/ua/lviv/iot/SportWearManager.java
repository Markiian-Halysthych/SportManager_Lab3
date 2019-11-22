package ua.lviv.iot;

public class SportWearManager {

	public static void main(String[] args) {

		Wear wear0 = new Wear();

		Wear tracksuit = new Wear(WearType.TRACKSUIT);
		Sneakers sneakers = new Sneakers(WearType.SNEAKERS);
		Tops jacket = new Tops(WearType.JACKET);

		Wear[] arrBrand = { wear0, tracksuit, sneakers, jacket };
		Wear[] arrWearPrice = { tracksuit, sneakers, jacket };
		Wear[] arrCotton = { tracksuit, sneakers, jacket };

		String[] arrSearchBrand = { "adidas" };

		tracksuit.setBrand("adidas");
		tracksuit.setPrice(100);
		tracksuit.setPercentageOfCotton(30);

		sneakers.setBrand("nike");
		sneakers.setPrice(150.3);
		sneakers.setPercentageOfCotton(13.12);

		jacket.setBrand("reebok");
		jacket.setPrice(150.20);
		jacket.setPercentageOfCotton(70.5);

		Sort.sortByPrice(arrWearPrice);

		System.out.println("Price List");
		for (int i = 0; i < arrWearPrice.length; i++) {
			System.out.println(arrWearPrice[i].getPrice());
		}
		System.out.println();

		Sort.sortByPercentageOfCotton(arrCotton);

		System.out.println("Cotton List");
		for (int i = 0; i < arrCotton.length; i++) {

			System.out.println(arrCotton[i].getPercentageOfCotton());
		}

		System.out.println();

		System.out.println(Search.searchByPrice(arrWearPrice, 100));
		System.out.println();

		System.out.println(Search.searchByBrand(arrBrand, arrSearchBrand));
		System.out.println();
	}
}
