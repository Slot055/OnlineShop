package ru.MyOnlineShop.model.product.food.dairyProduct;

import ru.MyOnlineShop.model.product.Product;

import java.util.Collection;
import java.util.Set;

public class Cheese extends DairyProduct {
    private double expirationDate;

    public Cheese(String name, double price, int item, double expirationDate) {
        super(name, price, item);
        this.expirationDate = expirationDate;
    }

    public Cheese() {
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

}
