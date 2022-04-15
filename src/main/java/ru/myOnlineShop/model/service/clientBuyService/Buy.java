package ru.myOnlineShop.model.service.clientBuyService;

import ru.myOnlineShop.model.product.Product;
import ru.myOnlineShop.model.service.Basket;

import java.util.ArrayList;
import java.util.Scanner;

public interface Buy {

    default Object findProduct(String name) throws Exception {
        return name;
    }

    default ArrayList<Product> putInBasket(Basket basket, Product product) {
        basket.getProductsInBasket().add(product);
        return (ArrayList<Product>) basket.getProductsInBasket();
    }

    default ArrayList<Product> removeFromToBasket(Basket basket, Product product) {
        basket.getProductsInBasket().remove(product);
        return (ArrayList<Product>) basket.getProductsInBasket();
    }

    default Check pay(Order order, Scanner scanner) {
        Check check;
        System.out.println("                  " + "\n" + "Сумма для оплаты: " + order.getSum() + "\n" + "Оплата на сайте - 1" + "\n" +
                "Оплата при получении - 2" + "\n" + "Выход - 3");
        int i = scanner.nextInt();
        if (i == 1) {
            check = new Check();
            check.setPay(true);
            order.setCheck(check);
            System.out.println("                         ЧЕК");
            for (Product p : order.getListProducts())
                System.out.println("Наименование: " + p.getNameProduct() + "     " + "Цена: " + p.getPrice() + "     " + "Количество: " +
                        p.getQuantity());
            System.out.println("Итоговая сумма: " + order.getSum());

            return check;
        } else if (i == 2) {
            check = new Check();
            check.setPay(false);
            order.setCheck(check);
            System.out.println("Чек будет доступен после оплаты товара");
            return check;
        } else
            return null;
    }
    default Object findOrderDelivery(int numberOrder) throws Exception {
        return numberOrder;
    }

}
