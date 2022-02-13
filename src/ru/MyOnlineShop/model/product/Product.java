package ru.MyOnlineShop.model.product;

import ru.MyOnlineShop.model.service.buy.Buy;

public abstract class Product implements Buy {
    private String name;
    private double price;
    private int item;

    public Product(String name, double price, int item) {
        this.name = name;
        this.price = price;
        this.item = item;
    }

    public Product() {
    }

    @Override
    public String toString() {
        return "Продукт: " + name + "; Артикул: " + item + " Цена: " + price;
    }

    public abstract void productInfo();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
}
