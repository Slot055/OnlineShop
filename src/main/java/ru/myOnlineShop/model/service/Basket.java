package ru.myOnlineShop.model.service;

import ru.myOnlineShop.model.product.Product;

import java.util.ArrayList;
import java.util.List;

public class Basket {

    private String name;
    private Product product;
    private ArrayList<Product> productsInBasket;

    public Basket(ArrayList<Product> productsInBasket) {
        this.productsInBasket = productsInBasket;
    }

    public Basket() {

    }

    @Override
    public String toString() {
        return String.valueOf(getProductsInBasket());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public List<Product> getProductsInBasket() {
        return productsInBasket;
    }

    public void setProductsInBasket(ArrayList<Product> productsInBasket) {
        this.productsInBasket = productsInBasket;
    }
}
