package ru.MyOnlineShop.model.product.homeTechnics;

import ru.MyOnlineShop.model.product.Product;

import java.util.ArrayList;
import java.util.List;

public abstract class SmallHomeTechnics extends NonFood {
    public SmallHomeTechnics(String categoryProduct, String typeProduct, String nameProduct, double price, int item) {
        super(categoryProduct, typeProduct, nameProduct, price, item);
    }
    public SmallHomeTechnics(){

    }
    public static List<Product> smallHomeTechnicsList = new ArrayList<>();
}
