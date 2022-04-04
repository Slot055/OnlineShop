package ru.myOnlineShop.model.service.buyService;

import ru.myOnlineShop.model.dataBase.ProductDataBase;
import ru.myOnlineShop.model.exeption.InvalidCategoryProduct;
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
            }else if (i == 3) {
                System.out.println("Список товаров в корзине:" + "\n" + basket.getProductsInBasket() + "\n" + "***************************");


            }else if (i == 0) {
                return basket;
            }
            else System.out.println("Выберете действие из списка" + "\n" + "*****************************");
        }

    }

    public Delivery getDelivery(Delivery delivery, Order order) {


        return delivery;
    }
}





