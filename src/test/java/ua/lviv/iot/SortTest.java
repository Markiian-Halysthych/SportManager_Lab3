package ua.lviv.iot;

import org.junit.Assert;
import org.junit.Test;

public class SortTest {

//	Wear wear0 = new Wear();
	Tops example = new Tops();
	Trousers trousers = new Trousers();
	Sneakers sneakers = new Sneakers();
	Tops jacket = new Tops();

	@Test
	public void testSortByPrice() {

		trousers.setPrice(100);
		sneakers.setPrice(200);
		jacket.setPrice(150);

		Wear[] arrWearPrice = { trousers, sneakers, jacket };
		Wear[] expected = { trousers, jacket, sneakers };

		Sort.sortByPrice(arrWearPrice);

		Assert.assertNotEquals(expected, arrWearPrice);
	}

	@Test
	public void testSortByPercentageOfCotton() {

		trousers.setPercentageOfCotton(30);
		sneakers.setPercentageOfCotton(13.12);
		jacket.setPercentageOfCotton(70.5);

		Wear[] arrWearCotton = { trousers, sneakers, jacket };
		Wear[] expected = { sneakers, trousers, jacket };

		Sort.sortByPercentageOfCotton(arrWearCotton);

		Assert.assertArrayEquals(expected, arrWearCotton);
	}

	@Test
	public void testSortByPercentageOfCottonUp() {

		trousers.setPercentageOfCotton(30);
		sneakers.setPercentageOfCotton(13.12);
		jacket.setPercentageOfCotton(70.5);

		Wear[] arrWearCottonUp = { trousers, sneakers, jacket };
		Wear[] expected = { jacket, trousers, sneakers };

		Sort.sortByPercentageOfCottonUp(arrWearCottonUp);

		Assert.assertArrayEquals(expected, arrWearCottonUp);
	}
}
