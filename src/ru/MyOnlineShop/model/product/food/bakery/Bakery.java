package ru.MyOnlineShop.model.product.food.bakery;

import ru.MyOnlineShop.model.product.food.Food;

public abstract class Bakery extends Food {

    public Bakery(String name, double price, int item) {
        super(name, price, item);
    }
}
