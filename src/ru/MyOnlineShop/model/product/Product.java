package ru.MyOnlineShop.model.product;

import ru.MyOnlineShop.model.service.buy.Buy;

import java.util.Collection;
import java.util.Set;

public class Product implements Buy {
    private String categoryProduct;
    private String typeProduct;
    private String nameProduct;
    private double price;
    private int item;

    public Product(String categoryProduct, String typeProduct, String nameProduct, double price, int item) {
        this.categoryProduct = categoryProduct;
        this.typeProduct = typeProduct;
        this.nameProduct = nameProduct;
        this.price = price;
        this.item = item;
    }

    public Product() {
    }

    @Override
    public String toString() {
        return "Категория товара:" + categoryProduct + " , " + "Тип товара" + typeProduct + " , " + "Товар:" + nameProduct +
                " , " + "Артикул:" + item + " , " + "Цена: " + price;
    }

    public void productInfo() {

    }

    public String getTypeProduct() {
        return typeProduct;
    }

    public void setTypeProduct(String typeProduct) {
        this.typeProduct = typeProduct;
    }

    public String getCategoryProduct() {
        return categoryProduct;
    }

    public void setCategoryProduct(String categoryProduct) {
        this.categoryProduct = categoryProduct;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getItem() {
        return item;
    }

    public void setItem(int item) {
        this.item = item;
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
}
