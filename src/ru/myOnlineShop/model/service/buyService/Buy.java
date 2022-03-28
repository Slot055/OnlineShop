package ru.myOnlineShop.model.service.buyService;

import ru.myOnlineShop.model.product.Product;
import ru.myOnlineShop.model.service.Basket;

import java.util.ArrayList;

public interface Buy {

    default Object findProduct(String name) throws Exception {
        return name;
    }

    default ArrayList<Product> putInBasket(Basket basket, Product product) {
        basket.getProductsInBasket().add(product);
        return (ArrayList<Product>) basket.getProductsInBasket();
    }

    default void pay() {

    }

}
