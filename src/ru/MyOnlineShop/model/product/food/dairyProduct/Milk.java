package ru.MyOnlineShop.model.product.food.dairyProduct;

import ru.MyOnlineShop.model.product.Product;

import java.util.Collection;
import java.util.Set;

public class Milk extends DairyProduct {
    private double volume;

    public Milk(String categoryProduct, String typeProduct, String nameProduct, double price, int item, double expirationDate, double volume) {
        super(categoryProduct, typeProduct, nameProduct, price, item, expirationDate);
        this.volume = volume;
    }

    public Milk() {
    }

    @Override
    public void productInfo() {

    }

    @Override
    public Product findProduct(String name) {
        return null;
    }

    @Override
    public void putInBasket() {

    }

    @Override
    public void pay() {
        super.pay();
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }


}
