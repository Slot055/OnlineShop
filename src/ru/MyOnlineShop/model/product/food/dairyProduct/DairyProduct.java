package ru.MyOnlineShop.model.product.food.dairyProduct;

import ru.MyOnlineShop.model.product.food.Food;

public abstract class DairyProduct extends Food {
    public DairyProduct(String categoryProduct, String typeProduct, String nameProduct, double price, int item, double expirationDate) {
        super(categoryProduct, typeProduct, nameProduct, price, item, expirationDate);
    }

    public DairyProduct() {
    }

}
