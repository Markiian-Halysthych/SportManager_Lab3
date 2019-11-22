package ua.lviv.iot;

import org.junit.Assert;
import org.junit.Test;

public class SortTest {

	Wear wear0 = new Wear();
	Wear example = new Wear();
	Wear tracksuit = new Wear(WearType.TRACKSUIT);
	Wear sneakers = new Wear(WearType.SNEAKERS);
	Wear jacket = new Wear(WearType.JACKET);

	@Test
	public void testSortByPrice() {

		tracksuit.setPrice(100);
		sneakers.setPrice(200);
		jacket.setPrice(150);

		Wear[] arrWearPrice = { tracksuit, sneakers, jacket };
		Wear[] expected = { tracksuit, jacket, sneakers };

		Sort.sortByPrice(arrWearPrice);

		Assert.assertNotEquals(expected, arrWearPrice);
	}

	@Test
	public void testSortByPercentageOfCotton() {

		tracksuit.setPercentageOfCotton(30);
		sneakers.setPercentageOfCotton(13.12);
		jacket.setPercentageOfCotton(70.5);

		Wear[] arrWearCotton = { tracksuit, sneakers, jacket };
		Wear[] expected = { sneakers, tracksuit, jacket };

		Sort.sortByPercentageOfCotton(arrWearCotton);

		Assert.assertArrayEquals(expected, arrWearCotton);
	}

	@Test
	public void testSortByPercentageOfCottonUp() {

		tracksuit.setPercentageOfCotton(30);
		sneakers.setPercentageOfCotton(13.12);
		jacket.setPercentageOfCotton(70.5);

		Wear[] arrWearCottonUp = { tracksuit, sneakers, jacket };
		Wear[] expected = { jacket, tracksuit, sneakers };

		Sort.sortByPercentageOfCottonUp(arrWearCottonUp);

		Assert.assertArrayEquals(expected, arrWearCottonUp);
	}
}
