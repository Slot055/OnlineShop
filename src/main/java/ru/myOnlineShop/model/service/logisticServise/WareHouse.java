package ru.myOnlineShop.model.service.logisticServise;
import ru.myOnlineShop.model.product.Product;
import ru.myOnlineShop.model.service.clientBuyService.Delivery;
import ru.myOnlineShop.model.service.clientBuyService.Order;

public class WareHouse {
    private Product product;
    private Delivery delivery;
    private Order order;

    public WareHouse() {
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Delivery getDelivery() {
        return delivery;
    }

    public void setDelivery(Delivery delivery) {
        this.delivery = delivery;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }
}
