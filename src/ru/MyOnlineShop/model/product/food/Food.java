package ru.MyOnlineShop.model.product.food;

import ru.MyOnlineShop.model.product.Product;
import ru.MyOnlineShop.model.service.buy.Buy;

public abstract class Food extends Product implements Buy {

     public Food(String name, double price, int item) {
        super(name, price, item);
    }

    public Food() {
    }
}
