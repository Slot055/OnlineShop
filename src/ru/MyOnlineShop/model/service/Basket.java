package ru.MyOnlineShop.model.service;

import ru.MyOnlineShop.model.product.Product;

import java.util.ArrayList;
import java.util.List;

public class Basket {

    private String name;
    private Product product;

    public Basket(String name) {
        this.name = name;
    }

    private List<Product> basket = new ArrayList<>();


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

    public List<Product> getBasket() {
        return basket;
    }

    public void setBasket(List<Product> basket) {
        this.basket = basket;
    }

}
