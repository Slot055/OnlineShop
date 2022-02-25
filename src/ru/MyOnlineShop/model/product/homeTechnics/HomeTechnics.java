package ru.MyOnlineShop.model.product.homeTechnics;

import ru.MyOnlineShop.model.product.Product;

public abstract class HomeTechnics extends Product {

    public HomeTechnics(String categoryProduct, String typeProduct, String nameProduct, double price, int item) {
        super(categoryProduct, typeProduct, nameProduct, price, item);
    }
}
