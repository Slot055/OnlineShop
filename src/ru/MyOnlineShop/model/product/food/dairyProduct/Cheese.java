package ru.MyOnlineShop.model.product.food.dairyProduct;

import ru.MyOnlineShop.model.product.Product;

import java.util.Collection;
import java.util.Set;

public class Cheese extends DairyProduct {
    public Cheese(String categoryProduct, String typeProduct, String nameProduct, double price, int item, double expirationDate) {
        super(categoryProduct, typeProduct, nameProduct, price, item, expirationDate);
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

}
