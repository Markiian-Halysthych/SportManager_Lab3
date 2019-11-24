package ua.lviv.iot;

import java.awt.List;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class SportWearManager {

	public static void main(String[] args) {

		final WearType tracksuitWearType = WearType.WOMAN;
		final WearType sneakersWearType = WearType.WOMAN;
		final WearType jacketWearType = WearType.MAN;

		final String tracksuitBrand = "adidas";
		final String sneakersBrand = "nike";
		final String jacketBrand = "reebok";

		final String sneakersColor = "black";
		final String jacketSeason = "winter";

		final double tracksuitPrice = 100.5;
		final double sneakersPrice = 200.5;
		final double jacketPrice = 150.5;

		final double tracksuitPercentageOfCotton = 30.5;
		final double sneakersPercentageOfCotton = 13.12;
		final double jacketPercentageOfCotton = 70.5;

//		Wear wear0 = new ();

		ArrayList<Wear> listToWrite = new ArrayList();

		Trousers trousers = new Trousers();
		Sneakers sneakers = new Sneakers();
		Tops jacket = new Tops();

		Wear[] arrBrand = { trousers, sneakers, jacket };
		Wear[] arrWearPrice = { trousers, sneakers, jacket };
		Wear[] arrCotton = { trousers, sneakers, jacket };
		Wear[] arrWear = { trousers, sneakers, jacket };
		
		String[] arrSearchBrand = { "nike" };

		trousers.setWearType(tracksuitWearType);
		trousers.setBrand(tracksuitBrand);
		trousers.setPrice(tracksuitPrice);
		trousers.setPercentageOfCotton(tracksuitPercentageOfCotton);

		sneakers.setWearType(sneakersWearType);
		sneakers.setBrand(sneakersBrand);
		sneakers.setPrice(sneakersPrice);
		sneakers.setPercentageOfCotton(sneakersPercentageOfCotton);
		sneakers.setColor(sneakersColor);

		jacket.setWearType(jacketWearType);
		jacket.setBrand(jacketBrand);
		jacket.setPrice(jacketPrice);
		jacket.setPercentageOfCotton(jacketPercentageOfCotton);
		jacket.setSeasone(jacketSeason);

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
		System.out.println(Search.searchByPrice(arrWearPrice, 130));
		System.out.println();

		System.out.println(Search.searchByBrand(arrBrand, arrSearchBrand));
		System.out.println();

		File file = new File("output.csv");
		
		listToWrite.add(trousers);
		listToWrite.add(jacket);
		listToWrite.add(sneakers);
		
		SportWearWriter writer = new SportWearWriter();
		try {
			SportWearWriter.writeToFile(listToWrite);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
