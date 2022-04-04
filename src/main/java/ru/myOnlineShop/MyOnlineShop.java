package ru.myOnlineShop;

import ru.myOnlineShop.model.CreateToObject;
import ru.myOnlineShop.model.dataBase.ProductDataBase;
import ru.myOnlineShop.model.service.Basket;
import ru.myOnlineShop.model.service.buyService.BuyServise;
import ru.myOnlineShop.model.service.clientAccountServise.ClientServise;

import java.util.Scanner;


public class MyOnlineShop {
    public static void main(String[] args) {

        CreateToObject.createOnlineShop();
        Scanner scanner = CreateToObject.createScanner();

        //Регистрация клиентов(в два параллельных потока)
        ClientServise clientServise = CreateToObject.createClientServise();
        /*clientServise.pool.execute(clientServise);
        clientServise.pool.shutdown();
        Thread registration = new Thread(clientServise, "Дополнительный");
        registration.start();
        clientServise.registrationClientAccount();*/


        //Импорт-Экспорт базы данных по категориям и поиск продуктов в коллекции по категории продуктов
        ProductDataBase productDataBase = CreateToObject.createProductDataBase();
        productDataBase.dataBaseRead();
        productDataBase.exportFromDataBase();
        productDataBase.importToDataBase();
        BuyServise buyServise = CreateToObject.createBuyServise();
        //buyServise.productCategorySearch(scanner, productDataBase);

        //Получаем корзину продуктов
        Basket basket = CreateToObject.createBasket();
        buyServise.getBasketProducts(basket,scanner,buyServise.productCategorySearch(scanner,productDataBase),productDataBase);
        System.out.println(basket.getProductsInBasket());
        System.out.println(productDataBase.productBase.toString());

        //Отправляем на доставку


    }
}
