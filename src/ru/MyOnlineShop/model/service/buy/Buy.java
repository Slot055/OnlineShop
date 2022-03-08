package ru.MyOnlineShop.model.service.buy;
import ru.MyOnlineShop.model.product.Product;
import java.util.Collection;

public interface Buy {

    Object findProduct(String name) throws Exception;

    void putInBasket();

    default void pay() {

    }

}
