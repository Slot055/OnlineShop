package ru.myOnlineShop.model.product.food;

import ru.myOnlineShop.model.product.Product;
import ru.myOnlineShop.model.service.clientBuyService.Buy;

import java.util.ArrayList;
import java.util.List;

public abstract class Food extends Product implements Buy {
    private double expirationDate;

    public Food(String categoryProduct, String typeProduct, String nameProduct, double price, int item, double expirationDate, int quantity) {
        super(categoryProduct, typeProduct, nameProduct, price, item, quantity);
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
