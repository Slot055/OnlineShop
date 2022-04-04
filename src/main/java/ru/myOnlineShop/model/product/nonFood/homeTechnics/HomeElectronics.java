package ru.myOnlineShop.model.product.nonFood.homeTechnics;

import ru.myOnlineShop.model.product.Product;
import ru.myOnlineShop.model.product.nonFood.NonFood;

import java.util.ArrayList;
import java.util.List;

public abstract class HomeElectronics extends NonFood {
    public HomeElectronics(String categoryProduct, String typeProduct, String nameProduct, double price, int item, int quantity) {
        super(categoryProduct, typeProduct, nameProduct, price, item, quantity);
    }
    public HomeElectronics(){

    }
    public static List<Product> homeElectronicsList = new ArrayList<>();
}
