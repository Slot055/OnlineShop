package ru.MyOnlineShop.model.product.food;

import ru.MyOnlineShop.model.product.Product;
import ru.MyOnlineShop.model.service.buyService.Buy;

import java.util.ArrayList;
import java.util.List;

public abstract class Food extends Product implements Buy {
    private double expirationDate;

    public Food(String categoryProduct, String typeProduct, String nameProduct, double price, int item, double expirationDate) {
        super(categoryProduct, typeProduct, nameProduct, price, item);
        this.expirationDate = expirationDate;
    }

    public Food() {
    }

    public static List<Product> food = new ArrayList<>();

    public double getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(double expirationDate) {
        this.expirationDate = expirationDate;
    }
}
