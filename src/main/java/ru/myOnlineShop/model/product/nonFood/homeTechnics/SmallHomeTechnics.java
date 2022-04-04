package ru.myOnlineShop.model.product.nonFood.homeTechnics;

import ru.myOnlineShop.model.product.Product;
import ru.myOnlineShop.model.product.nonFood.NonFood;

import java.util.ArrayList;
import java.util.List;

public abstract class SmallHomeTechnics extends NonFood {
    public SmallHomeTechnics(String categoryProduct, String typeProduct, String nameProduct, double price, int item, int quantity) {
        super(categoryProduct, typeProduct, nameProduct, price, item, quantity);
    }
    public SmallHomeTechnics(){

    }
    public static List<Product> smallHomeTechnicsList = new ArrayList<>();
}
