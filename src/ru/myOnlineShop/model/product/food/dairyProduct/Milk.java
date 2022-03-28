package ru.myOnlineShop.model.product.food.dairyProduct;

public class Milk extends DairyProduct {
    private double volume;

    public Milk(String categoryProduct, String typeProduct, String nameProduct, double price, int item, double expirationDate, double volume) {
        super(categoryProduct, typeProduct, nameProduct, price, item, expirationDate);
        this.volume = volume;
    }

    public Milk() {
    }


    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }


}
