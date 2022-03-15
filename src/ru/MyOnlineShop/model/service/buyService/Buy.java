package ru.MyOnlineShop.model.service.buyService;

public interface Buy {

    Object findProduct(String name) throws Exception;

    void putInBasket();

    default void pay() {

    }

}
