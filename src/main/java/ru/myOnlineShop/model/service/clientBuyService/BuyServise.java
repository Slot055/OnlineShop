package ru.myOnlineShop.model.service.clientBuyService;

import ru.myOnlineShop.model.constanta.Day;
import ru.myOnlineShop.model.dataBase.ProductDataBase;
import ru.myOnlineShop.model.exeption.InvalidCategoryProduct;
import ru.myOnlineShop.model.exeption.InvalidDay;
import ru.myOnlineShop.model.exeption.InvalidPay;
import ru.myOnlineShop.model.product.Product;
import ru.myOnlineShop.model.service.Basket;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BuyServise implements Buy, Runnable {

    public int attempts = 3;

    @Override
    public void run() {

    }


    public ArrayList<Product> productCategorySearch(Scanner scanner, ProductDataBase productDataBase) {

        System.out.println("***********************************" + "\n" + "Список категорий товаров: " + "\n" + productDataBase.productBasePrice.keySet());
        System.out.println("***********************************" + "\n" + "Для информации о товарах введите наименование категории из списка: ");
        try {
            ArrayList<Product> product = productDataBase.findProduct(scanner.nextLine().toLowerCase());
            Collections.sort(product);
            System.out.println("Введите диапазон цен: " + "\n" + "***********************************");
            System.out.println("Минимальная цена: ");
            int minPrice = scanner.nextInt();
            System.out.println("Максимальная цена: ");
            int maxPrice = scanner.nextInt();
            System.out.println("Список товаров по запросу:" + "\n" + "***********************************");
            for (Product list : product)
                if (list.getPrice() >= minPrice && list.getPrice() <= maxPrice) {
                    System.out.println(list);
                }
            return product;
        } catch (InvalidCategoryProduct e) {
            System.out.println(e.getTypeProduct() + " - " + e.getMessage());
            System.out.println("Осталось попыток ввода: " + attempts);

            if (attempts != 0) {
                if (e.getMessage().equals(e.getMessage())) {
                    attempts--;
                    productCategorySearch(scanner, productDataBase);
                }
            } else {
                System.out.println("Попытки ввода закончились");
            }
            return null;

        }

    }

    public Basket getBasketProducts(Basket basket, Scanner scanner, ArrayList<Product> product, ProductDataBase productDataBase) {

        while (true) {
            System.out.println("""
                    Выберите действие:
                    *******************
                    Добавить в корзину - 1
                    Удалить из корзины - 2
                    Содержимое корзины - 3
                    Завершить - 0""");
            int i = scanner.nextInt();
            if (i == 1) {
                System.out.println("Введите Артикул продукта");
                int num = scanner.nextInt();
                for (Product list : product) {
                    if (num == list.getItem()) {
                        putInBasket(basket, list);
                        list.setQuantity(1);
                        System.out.println("Добавлен в корзину" + "\n" + "******************");
                    }
                }
            } else if (i == 2) {
                System.out.println("Введите номер продукта");
                int num = scanner.nextInt();
                for (Product list : product) {
                    if (num == list.getItem()) {
                        removeFromToBasket(basket, list);
                        System.out.println("Удалён из корзины" + "\n" + "******************");
                    }
                }
            } else if (i == 3) {
                System.out.println("Список товаров в корзине:" + "\n" + basket.getProductsInBasket() + "\n" + "***************************");


            } else if (i == 0) {
                return basket;
            } else System.out.println("Выберете действие из списка" + "\n" + "*****************************");
        }

    }

    @Override
    public Check pay(Order order, Scanner scanner) {
        return Buy.super.pay(order, scanner);
    }

    public Delivery getDelivery(Delivery delivery, Order order, Scanner scanner) {

        System.out.println("""
                ***********************
                Выберите день доставки:
                Понедельник - 1
                Вторник - 2
                Среда - 3
                Четверг -4
                Пятница - 5
                -----------------------
                Самовывоз - 0
                """);
        try {
            if (order.getCheck() == null) {
                throw new InvalidPay("Заказ не подтверждён");
            }
            int d = scanner.nextInt();
            switch (d) {
                case 0:
                    delivery.setDay(null);
                    break;
                case 1:
                    delivery.setDay(Day.MONDAY);
                    break;
                case 2:
                    delivery.setDay(Day.TUESDAY);
                    break;
                case 3:
                    delivery.setDay(Day.WEDNESDAY);
                    break;
                case 4:
                    delivery.setDay(Day.THURSDAY);
                    break;
                case 5:
                    delivery.setDay(Day.FRIDAY);
                    break;
                default:
                    throw new InvalidDay("Необходимо обозначить день в рамках недели");


            }
            if (order.getCheck().isPay()) {
                delivery.getListOrdersDelivery().add(order);
                System.out.println("Статус заказа: Оплачен");
                return delivery;
            } else if (!order.getCheck().isPay()) {
                delivery.getListOrdersDelivery().add(order);
                System.out.println("Статус заказа: Не оплачен");
                return delivery;
            } else
                return null;
        } catch (InvalidPay | InvalidDay e) {
            System.out.println(e.getMessage());
            System.out.println("Осталось попыток ввода: " + attempts);

            if (attempts != 0) {
                if (e.getMessage().equals(e.getMessage())) {
                    attempts--;
                    getDelivery(delivery, order, scanner);
                }
            } else {
                System.out.println("Попытки ввода закончились" + "\n" + "День доставки не выбран");
                return delivery;
            }

        }
        return delivery;

    }
}





