package ua.lviv.iot;

import java.util.ArrayList;

public class SportWearManager {

    public static void main(String[] args) {

        ArrayList<String> wearBrand = new ArrayList<String>();
        ArrayList<Double> wearPrice = new ArrayList<Double>();
        ArrayList<Double> wearCotton = new ArrayList<Double>();
        ArrayList<Double> wearSearchPrice = new ArrayList<Double>();


        Wear wear0 = new Wear();
        Wear example = new Wear();
        Wear tracksuit = new Wear(WearType.TRACKSUIT);
        Wear sneakers = new Wear(WearType.SNEAKERS);
        Wear jacket = new Wear(WearType.JACKET);

        Wear[] arrBrand = {wear0, tracksuit, sneakers, jacket};
        Wear[] arrWearPrice = {tracksuit, sneakers, jacket};
        Wear[] arrWearPriceUp = {tracksuit, sneakers, jacket};
        Wear[] arrCotton = {tracksuit, sneakers, jacket};
        Wear[] arrCottonUp = {tracksuit, sneakers, jacket};

        String[] arrSearchBrand = {"adidas"};

        example.setBrand("nike");

        tracksuit.setBrand("adidas");
        tracksuit.setWearType("Track Suit");
        tracksuit.setPrice(100);
        tracksuit.setPercentageOfCotton(30);

        sneakers.setBrand("nike");
        sneakers.setWearType("Sneakers");
        sneakers.setPrice(150.3);
        sneakers.setPercentageOfCotton(13.12);

        jacket.setBrand("reebok");
        jacket.setWearType("Jacket");
        jacket.setPrice(150.20);
        jacket.setPercentageOfCotton(70.5);



        Sort.sortByPrice(arrWearPrice);


        System.out.println("Price List");
        for (int i = 0; i < arrWearPrice.length; i++) {
            wearPrice.add(arrWearPrice[i].getPrice());
        }
        for (int i = 0; i < wearPrice.size(); i++) {
            System.out.println(wearPrice.get(i));
        }

        System.out.println();


        Sort.sortByPercentageOfCotton(arrCotton);


        System.out.println("Cotton List");
        for (int i = 0; i < arrCotton.length; i++) {

            wearCotton.add(arrCotton[i].getPercentageOfCotton());
        }

        for (int i = 0; i < wearCotton.size(); i++) {
            System.out.println(wearCotton.get(i));
        }

        System.out.println();

        Search.searchByPrice(arrWearPrice, 150.20);
        System.out.println();

        Search.searchByBrand(arrBrand, arrSearchBrand);
        System.out.println();
    }
}
