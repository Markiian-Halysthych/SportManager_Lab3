package ua.lviv.iot;

public class Sort {

	public static void sortByPercentageOfCotton(Wear[] arrWearCotton) {
		for (int i = 0; i < arrWearCotton.length; i++) {
			Wear num = arrWearCotton[i];
			for (int j = i - 1; j >= 0; j--) {
				Wear leftNumber = arrWearCotton[j];
				if (num.getPercentageOfCotton() < leftNumber.getPercentageOfCotton()) {
					arrWearCotton[j + 1] = leftNumber;
					arrWearCotton[j] = num;
				} else {
					break;
				}
			}
		}
	}

	public static void sortByPercentageOfCottonUp(Wear[] arrWearCottonUp) {
		for (int i = 0; i < arrWearCottonUp.length; i++) {
			Wear num = arrWearCottonUp[i];
			for (int j = i - 1; j >= 0; j--) {
				Wear leftNumber = arrWearCottonUp[j];
				if (num.getPercentageOfCotton() > leftNumber.getPercentageOfCotton()) {
					arrWearCottonUp[j + 1] = leftNumber;
					arrWearCottonUp[j] = num;
				} else {
					break;
				}
			}
		}
	}

	public static void sortByPrice(Wear[] arrWearPrice) {
		for (int i = 0; i < arrWearPrice.length; i++) {
			Wear num = arrWearPrice[i];
			for (int j = i - 1; j >= 0; j--) {
				Wear leftNumber = arrWearPrice[j];
				if (num.getPrice() < leftNumber.getPrice()) {
					arrWearPrice[j + 1] = leftNumber;
					arrWearPrice[j] = num;
				} else {
					break;
				}
			}
		}
	}
}