package ru.MyOnlineShop.model.service.buy;

import ru.MyOnlineShop.model.dataBase.ProductDataBase;
import ru.MyOnlineShop.model.product.Product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public abstract class BuyServise implements Buy {

    public static int attempts = 3;

    public static void productCategorySearch(Scanner scanner, ProductDataBase productDataBase) {

        System.out.println("***********************************" + "\n" + "Список категорий товаров: " + "\n" + productDataBase.productBasePrice.keySet());
        System.out.println("***********************************" + "\n" + "Для информации о товарах введите наименование категории из списка: ");
        try {
            ArrayList<Product> product = productDataBase.findProduct(scanner.nextLine());
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
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Осталось попыток ввода: " + attempts);

            if (attempts != 0) {
                if (e.getMessage().equals(e.getMessage())) {
                    attempts--;
                    productCategorySearch(scanner, productDataBase);
                }
            } else {
                System.out.println("Попытки ввода закончились");
            }

        }

    }
}





