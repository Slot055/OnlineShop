package ru.MyOnlineShop.model.product.food.bakery;

import ru.MyOnlineShop.model.product.Product;

import java.util.Collection;
import java.util.Set;

public class Bread extends Bakery {
    public Bread(String categoryProduct, String typeProduct, String nameProduct, double price, int item, double expirationDate) {
        super(categoryProduct, typeProduct, nameProduct, price, item, expirationDate);
    }

    public Bread(){

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
}
