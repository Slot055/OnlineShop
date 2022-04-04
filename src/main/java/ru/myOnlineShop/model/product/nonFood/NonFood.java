package ru.myOnlineShop.model.product.nonFood;

import ru.myOnlineShop.model.product.Product;

import java.util.ArrayList;
import java.util.List;

public abstract class NonFood extends Product {

    public NonFood(String categoryProduct, String typeProduct, String nameProduct, double price, int item, int quantity) {
        super(categoryProduct, typeProduct, nameProduct, price, item, quantity);
    }

    public NonFood(){

    }

    public static List<Product> nonFood = new ArrayList<>();

}
