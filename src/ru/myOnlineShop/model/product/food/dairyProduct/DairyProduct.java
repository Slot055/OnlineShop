package ru.myOnlineShop.model.product.food.dairyProduct;
import ru.myOnlineShop.model.product.Product;
import ru.myOnlineShop.model.product.food.Food;
import java.util.ArrayList;
import java.util.List;

public abstract class DairyProduct extends Food {
    public DairyProduct(String categoryProduct, String typeProduct, String nameProduct, double price, int item, double expirationDate) {
        super(categoryProduct, typeProduct, nameProduct, price, item, expirationDate);
    }

    public DairyProduct() {
    }

    public static List<Product> dairyProductList = new ArrayList<>();

}
