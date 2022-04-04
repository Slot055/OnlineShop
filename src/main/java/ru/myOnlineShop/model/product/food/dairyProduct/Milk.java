package ru.myOnlineShop.model.product.food.dairyProduct;

public class Milk extends DairyProduct {
    private double volume;

    public Milk(String categoryProduct, String typeProduct, String nameProduct, double price, int item, double expirationDate, double volume, int quantity) {
        super(categoryProduct, typeProduct, nameProduct, price, item, expirationDate, quantity);
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
