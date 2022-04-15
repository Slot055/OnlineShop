package ru.myOnlineShop.model.service.clientBuyService;

import org.joda.time.DateTime;
import ru.myOnlineShop.model.product.Product;
import ru.myOnlineShop.model.service.Basket;

import java.util.ArrayList;

public class Order {
    private int numberOrder;
    private double sum;
    private ArrayList<Product> listProducts;
    private Basket basket;
    private DateTime dateTime;
    private Check check;

    public Order(int numberOrder, DateTime dateTime, ArrayList<Product> listProducts, Double sum, Check check) {
        this.numberOrder = numberOrder;
        this.dateTime = dateTime;
        this.listProducts = listProducts;
        this.sum = sum;
        this.check = check;
    }

    public Order() {

    }
    public void infoOrder(Order order) {
        System.out.println("Номер заказа: " + order.getNumberOrder() + "\n" + "Дата заказа: " + order.getDateTime().toDate());
        System.out.println("Список товаров в заказе: ");
        for (Product p : order.getListProducts())
            System.out.println("Наименование товара: " + p.getNameProduct() + "     " + "Цена: " + p.getPrice() + "     "
                    + "     " + "Количество: " + p.getQuantity());
        System.out.println("Сумма заказа: " + order.getSum());
    }

    public int generateNumberOrder(Order order) {
        int number = order.hashCode() / 10000;
        if (number < 0) {
            int idFinal = Math.abs(-number);

            return idFinal;
        } else return number;

    }

    public int getNumberOrder() {
        return numberOrder;
    }

    public void setNumberOrder(int numberOrder) {
        this.numberOrder = numberOrder;
    }

    public ArrayList<Product> getListProducts() {
        return listProducts;
    }

    public void setListProducts(ArrayList<Product> listProducts) {
        this.listProducts = listProducts;
    }

    public Basket getBasket() {
        return basket;
    }

    public void setBasket(Basket basket) {
        this.basket = basket;
    }

    public DateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(DateTime dateTime) {
        this.dateTime = dateTime;
    }

    public double getSum() {
        return sum;
    }

    public void setSum(double sum) {
        this.sum = sum;
    }

    public Check getCheck() {
        return check;
    }

    public void setCheck(Check check) {
        this.check = check;
    }
}
