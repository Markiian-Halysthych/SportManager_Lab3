package ua.lviv.iot;

public class Wear {
    private String WearType;
    private String brand;
    private double price;
    private double percentageOfCotton;




    public Wear(String brand, double price, double percentageOfCotton) {
        this.setBrand(brand);
        this.setPrice(price);
        this.setPercentageOfCotton(percentageOfCotton);
    }




    public Wear(WearType WearType) {

    }




    public String getBrand() {
        return this.brand;
    }




    public void setBrand(String brand) {
        this.brand = brand;
    }




    public double getPrice() {
        return price;
    }


    public Wear() {
        return;
    }


    public void setPrice(double price) {
        this.price = price;
    }




    public double getPercentageOfCotton() {
        return percentageOfCotton;
    }




    public void setPercentageOfCotton(double percentageOfCotton) {
        this.percentageOfCotton = percentageOfCotton;
    }




    public String getWearType() {
        return WearType;
    }




    public void setWearType(String wearType) {
        WearType = wearType;
    }
}