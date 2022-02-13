package ru.MyOnlineShop.model.product.food.dairyProduct;

import ru.MyOnlineShop.model.product.Product;

import java.util.Collection;
import java.util.Set;

public class Milk extends DairyProduct {

    private double expirationDate;
    private double volume;

    public Milk(String name, double price, int item, double volume, double expirationDate) {
        super(name, price, item);
    }

    public Milk() {
    }

    @Override
    public void productInfo() {

    }

    @Override
    public Collection<Product> findAllProducts() {
        return null;
    }

    @Override
    public Product findProduct(String name) {
        return null;
    }

    @Override
    public Set<Product> findProducts(int price) {
        return null;
    }

    @Override
    public void putInBasket() {

    }

    @Override
    public void pay() {
        super.pay();
    }

    public double getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(double expirationDate) {
        this.expirationDate = expirationDate;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }


}
