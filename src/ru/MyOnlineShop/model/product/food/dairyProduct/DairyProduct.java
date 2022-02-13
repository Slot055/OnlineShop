package ru.MyOnlineShop.model.product.food.dairyProduct;

import ru.MyOnlineShop.model.product.food.Food;

public abstract class DairyProduct extends Food {

    public DairyProduct(String name, double price, int item) {
        super(name, price, item);
    }

    public DairyProduct() {
    }
}
