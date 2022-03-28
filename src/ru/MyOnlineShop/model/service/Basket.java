package ru.MyOnlineShop.model.service;

import ru.MyOnlineShop.model.product.Product;

import java.util.ArrayList;
import java.util.List;

public class Basket {

    private String name;
    private Product product;
    private List<Product> productsInBasket;

    public Basket(String name,ArrayList<Product> productsInBasket) {
        this.name = name;
        this.productsInBasket = productsInBasket;
    }

    public Basket() {

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

    public void setProductsInBasket(List<Product> productsInBasket) {
        this.productsInBasket = productsInBasket;
    }
}
