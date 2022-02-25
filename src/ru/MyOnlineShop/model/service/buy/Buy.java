package ru.MyOnlineShop.model.service.buy;
import ru.MyOnlineShop.model.product.Product;

import java.util.Collection;
import java.util.Set;

public interface Buy {

    Collection<Product> findAllProducts();

    Product findProduct(String name);

    Set<Product> findProducts(int price);

    void putInBasket();

    default void pay() {

    }

}
