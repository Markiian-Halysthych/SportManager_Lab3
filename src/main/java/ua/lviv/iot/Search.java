package ua.lviv.iot;

public class Search extends Wear {

    private static double search;
    private static boolean toggles = true;


    public static void searchByPrice(Wear[] arrWearPrice, double search) {
        int start = 0;
        int end = arrWearPrice.length - 1;
        int mid = (start + end)/2;
        while(toggles) {
            if (arrWearPrice[mid].getPrice() == search) {
                System.out.println(arrWearPrice[mid].getWearType() + " : " + arrWearPrice[mid].getPrice());
                toggles = false;
            }
            else {
                if (arrWearPrice[mid].getPrice() < search) {
                    mid = mid + 1;
                }
                else {
                    if (arrWearPrice[mid].getPrice() > search) {
                        mid = mid - 1;
                    }
                }
            }
        }
    }

    public static String searchByBrand(Wear[] arrBrand, String[] arrSearchBrand) {
        String searchBrand = arrSearchBrand[0];
        for (int i = 1 ; i < arrBrand.length ; i++) {
            if (arrBrand[i].getBrand() == searchBrand) {
                System.out.println(arrBrand[i].getWearType() + " " + arrBrand[i].getBrand() +" : "+ arrBrand[i].getPrice());
            }
        }
        return searchBrand;
    }




    public static double getSearch() {
        return search;
    }
}