package ru.myOnlineShop.model.service.clientBuyService;

import ru.myOnlineShop.model.constanta.Day;

import java.util.ArrayList;

public class Delivery {

    private Day day;
    private Order order;
    private Check check;
    private ArrayList<Order> listOrdersDelivery = new ArrayList<>();
    private ArrayList<Order> listOrdersPickup = new ArrayList<>();

    public Delivery(Day day, Order order, Check check) {
        this.day = day;
        this.order = order;
        this.check = check;
    }
    public Delivery(){

    }

    public Delivery deliveryInfo() {

        return null;
    }

    public Day getDay() {
        return day;
    }

    public void setDay(Day day) {
        this.day = day;
    }

    public Order getOrder() {
        return order;
    }

    public Check getCheck() {
        return check;
    }

    public ArrayList<Order> getListOrdersDelivery() {
        return listOrdersDelivery;
    }

    public void setListOrdersDelivery(ArrayList<Order> listOrdersDelivery) {
        this.listOrdersDelivery = listOrdersDelivery;
    }

    public ArrayList<Order> getListOrdersPickup() {
        return listOrdersPickup;
    }

    public void setListOrdersPickup(ArrayList<Order> listOrdersPickup) {
        this.listOrdersPickup = listOrdersPickup;
    }
}
