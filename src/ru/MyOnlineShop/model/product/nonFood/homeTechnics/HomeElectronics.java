package ru.MyOnlineShop.model.product.nonFood.homeTechnics;

import ru.MyOnlineShop.model.product.Product;
import ru.MyOnlineShop.model.product.nonFood.NonFood;

import java.util.ArrayList;
import java.util.List;

public abstract class HomeElectronics extends NonFood {
    public HomeElectronics(String categoryProduct, String typeProduct, String nameProduct, double price, int item) {
        super(categoryProduct, typeProduct, nameProduct, price, item);
    }
    public HomeElectronics(){

    }
    public static List<Product> homeElectronicsList = new ArrayList<>();
}
