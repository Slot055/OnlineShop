package ru.MyOnlineShop.model.product.homeTechnics;
import ru.MyOnlineShop.model.product.Product;
import java.util.ArrayList;
import java.util.List;

public abstract class BigHomeTechnics extends NonFood {

    public BigHomeTechnics(String categoryProduct, String typeProduct, String nameProduct, double price, int item) {
        super(categoryProduct, typeProduct, nameProduct, price, item);
    }
    public BigHomeTechnics(){

    }
    public static List<Product> bigHomeTechnicsList = new ArrayList<>();
}
