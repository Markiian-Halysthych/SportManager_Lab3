package ua.lviv.iot;

import org.junit.Assert;
import org.junit.Test;

public class SearchTest {

	Wear wear0 = new Wear();
	Wear example = new Wear();
	Wear tracksuit = new Wear();
	Wear sneakers = new Wear();
	Wear jacket = new Wear();
	Wear tracksuit2 = new Wear();
	Wear jacket2 = new Wear();
	Wear jacket3 = new Wear();
	Wear jacket4 = new Wear();
	Wear jacket5 = new Wear();
	Wear jacket6 = new Wear();

	@Test
	public void testSearchByPriceMucherMid() {

		tracksuit.setPrice(100.50);
		sneakers.setPrice(150);
		jacket.setPrice(200);
		jacket2.setPrice(250);
		jacket3.setPrice(300);
		jacket4.setPrice(350);
		jacket5.setPrice(400);
		jacket6.setPrice(500);

		Wear[] arrWearPrice = { tracksuit, sneakers, jacket, jacket2, jacket3, jacket4, jacket5, jacket6 };

		Assert.assertEquals(250, Search.searchByPrice(arrWearPrice, 250), 0.2);
	}

	@Test
	public void testSearchByPriceLesserMid() {

		tracksuit.setPrice(100);
		sneakers.setPrice(150);
		jacket.setPrice(200);
		jacket2.setPrice(300);
		jacket3.setPrice(400);

		Wear[] arrWearPrice = { tracksuit, sneakers, jacket, jacket2, jacket3 };

		Assert.assertEquals(400, Search.searchByPrice(arrWearPrice, 400), 5);
	}

	@Test
	public void testSearchByBrand() {

		example.setBrand("Adidas");

		tracksuit.setBrand("Adidas");
		sneakers.setBrand("Nike");
		jacket.setBrand("Reebok");
		jacket2.setBrand("Adidas");
		jacket3.setBrand("Nike");

		Wear[] arrBrand = { tracksuit, sneakers, jacket, jacket2, jacket3 };
		String[] arrSearchBrand = { "Adidas" };

		Assert.assertEquals("Adidas", Search.searchByBrand(arrBrand, arrSearchBrand));
	}
}