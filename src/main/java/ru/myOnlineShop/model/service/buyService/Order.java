package ru.myOnlineShop.model.service.buyService;

import ru.myOnlineShop.model.product.Product;
import ru.myOnlineShop.model.service.Basket;

import java.util.ArrayList;

public class Order {
    private int numberOrder;
    private ArrayList<Product> list;
    private Basket basket;

    public Order(int numberOrder, ArrayList<Product> list) {
        this.numberOrder = numberOrder;
        this.list = list;
    }

    public int getNumberOrder() {
        return numberOrder;
    }

    public void setNumberOrder(int numberOrder) {
        this.numberOrder = numberOrder;
    }

    public ArrayList<Product> getList() {
        return list;
    }

    public void setList(ArrayList<Product> list) {
        this.list = list;
    }

    public Basket getBasket() {
        return basket;
    }

    public void setBasket(Basket basket) {
        this.basket = basket;
    }
}
