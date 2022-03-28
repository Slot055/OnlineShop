package ru.MyOnlineShop.model.service.buyService;

import ru.MyOnlineShop.model.dataBase.ProductDataBase;
import ru.MyOnlineShop.model.exeption.InvalidCategoryProduct;
import ru.MyOnlineShop.model.product.Product;
import ru.MyOnlineShop.model.service.Basket;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BuyServise implements Buy, Runnable {

    public static int attempts = 3;

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
        ArrayList<Product> products = product;
        System.out.println("Введите номер продукта для добавления в корзину" + "\n" + "Для завершения наберите: 0");

        while (true) {
            int pro = scanner.nextInt();
            for (Product list : products) {
                if (pro == list.getItem() && pro != 0) {
                    putInBasket(basket, list);
                } else if (pro == 0) {
                   return basket;
                }
            }

        }

    }
}





