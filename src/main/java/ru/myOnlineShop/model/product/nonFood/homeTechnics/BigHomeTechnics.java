package ru.myOnlineShop.model.product.nonFood.homeTechnics;
import ru.myOnlineShop.model.product.Product;
import ru.myOnlineShop.model.product.nonFood.NonFood;

import java.util.ArrayList;
import java.util.List;

public abstract class BigHomeTechnics extends NonFood {

    public BigHomeTechnics(String categoryProduct, String typeProduct, String nameProduct, double price, int item, int quantity) {
        super(categoryProduct, typeProduct, nameProduct, price, item, quantity);
    }
    public BigHomeTechnics(){

    }
    public static List<Product> bigHomeTechnicsList = new ArrayList<>();

}
