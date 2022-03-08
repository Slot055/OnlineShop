package ru.MyOnlineShop.model.product.homeTechnics;

import ru.MyOnlineShop.model.product.Product;

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
