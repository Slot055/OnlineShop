package ru.MyOnlineShop.model.product.food.bakery;

import ru.MyOnlineShop.model.product.Product;

import java.util.Collection;
import java.util.Set;

public class Bread extends Bakery {
    public Bread(String name, double price, int item) {
        super(name, price, item);
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
}
