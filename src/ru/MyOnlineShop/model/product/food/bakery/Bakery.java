package ru.MyOnlineShop.model.product.food.bakery;

import ru.MyOnlineShop.model.product.food.Food;

public abstract class Bakery extends Food {

    public Bakery(String categoryProduct, String typeProduct, String nameProduct, double price, int item, double expirationDate) {
        super(categoryProduct, typeProduct, nameProduct, price, item, expirationDate);
    }
}
