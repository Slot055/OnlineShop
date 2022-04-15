package ru.myOnlineShop.model.service.clientBuyService;

public class Check {
    private boolean pay;
    private Order order;

    public Check(Order order,boolean pay) {
        this.order = order;
        this.pay = pay;
    }

    public Check() {

    }

    public Order getOrder() {
        return order;
    }

    public boolean isPay() {
        return pay;
    }

    public void setPay(boolean pay) {
        this.pay = pay;
    }
}
