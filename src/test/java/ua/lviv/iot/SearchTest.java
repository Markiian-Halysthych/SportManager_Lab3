package ua.lviv.iot;

import org.junit.Assert;
import org.junit.Test;

public class SearchTest {

//	Wear wear0 = new Wear();
	Trousers example = new Trousers();
	Trousers trousers = new Trousers();
	Sneakers sneakers = new Sneakers();
	Tops jacket = new Tops(); 
	Tops jacket2 = new Tops();
	Tops jacket3 = new Tops();
	Tops jacket4 = new Tops();
	Tops jacket5 = new Tops();
	Tops jacket6 = new Tops();

	@Test
	public void testSearchByPriceNegativ() {

		trousers.setPrice(100.5);
		sneakers.setPrice(150.5);
		jacket.setPrice(200.5);
		jacket2.setPrice(250.5);
		jacket3.setPrice(300.5);
		jacket4.setPrice(350.5);
		jacket5.setPrice(400.5);
		jacket6.setPrice(500.5);

		Wear[] arrWearPrice = { trousers, sneakers, jacket, jacket2, jacket3, jacket4, jacket5, jacket6 };

		Assert.assertEquals("no wear with this price" + "the nearest price: " + 150.5, Search.searchByPrice(arrWearPrice, 120));
	}

	@Test
	public void testSearchByPricePositiv() {

		trousers.setPrice(100.5);
		sneakers.setPrice(150.5);
		jacket.setPrice(200.5);
		jacket2.setPrice(300.5);
		jacket3.setPrice(400.5);

		Wear[] arrWearPrice = { trousers, sneakers, jacket, jacket2, jacket3 };

		Assert.assertEquals("searched price: " + 400.5, Search.searchByPrice(arrWearPrice, 400.5));
	}

	@Test
	public void testSearchByBrand() {

		example.setBrand("Adidas");

		trousers.setBrand("Adidas");
		sneakers.setBrand("Nike");
		jacket.setBrand("Reebok");
		jacket2.setBrand("Adidas");
		jacket3.setBrand("Nike");

		Wear[] arrBrand = { trousers, sneakers, jacket, jacket2, jacket3 };
		String[] arrSearchBrand = { "Adidas" };

		Assert.assertEquals("Adidas", Search.searchByBrand(arrBrand, arrSearchBrand));
	}
}