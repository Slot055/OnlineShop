package ru.myOnlineShop.model.service.buyService;

import org.joda.time.DateTime;

public class Delivery {

    private DateTime dateTime;
    private Order order;

    public Delivery(DateTime dateTime, Order order) {
        this.dateTime = dateTime;
        this.order = order;
    }

    public Delivery deliveryInfo() {

        return null;
    }

    public DateTime getDateTime() {
        return dateTime;
    }

    public Order getBasket() {
        return order;
    }
}
