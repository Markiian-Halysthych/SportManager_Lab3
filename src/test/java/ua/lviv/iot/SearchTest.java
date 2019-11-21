package ua.lviv.iot;

import org.junit.Assert;
import org.junit.Test;

public class SearchTest {
	
	Wear wear0 = new Wear();
    Wear example = new Wear();
    Wear tracksuit = new Wear(WearType.TRACKSUIT);
    Wear sneakers = new Wear(WearType.SNEAKERS);
    Wear jacket = new Wear(WearType.JACKET);
	
	@Test
	public void testSearchByPrice() {
		
//		private static boolean toggles = true;
		
		tracksuit.setPrice(100);
	    sneakers.setPrice(200);
	    jacket.setPrice(150);
	    
	    Wear[] arrWearPrice = {tracksuit, jacket, sneakers};
	    
	    Search.searchByPrice(arrWearPrice, 200);
	    
//	    Assert.assertEquals(200, mid);
	}
}