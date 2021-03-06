package ru.myOnlineShop.model.product.food.bakery;

import ru.myOnlineShop.model.product.Product;
import ru.myOnlineShop.model.product.food.Food;

import java.util.ArrayList;
import java.util.List;

public abstract class Bakery extends Food {

    public Bakery(String categoryProduct, String typeProduct, String nameProduct, double price, int item, double expirationDate) {
        super(categoryProduct, typeProduct, nameProduct, price, item, expirationDate);
    }

    public Bakery(){

    }
    public static List<Product> bakeryList = new ArrayList<>();
}
