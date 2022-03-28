package ru.MyOnlineShop;

import ru.MyOnlineShop.model.CreateToObject;
import ru.MyOnlineShop.model.dataBase.ProductDataBase;
import ru.MyOnlineShop.model.service.Basket;
import ru.MyOnlineShop.model.service.buyService.BuyServise;
import ru.MyOnlineShop.model.service.clientAccountServise.ClientServise;

import java.util.Scanner;


public class MyOnlineShop {
    public static void main(String[] args) {

        CreateToObject.createOnlineShop();
        Scanner scanner = CreateToObject.createScanner();

        //Регистрация клиентов(в два параллельных потока)
       /* ClientServise clientServise = CreateToObject.createClientServise();
        Thread registration = new Thread(clientServise, "Дополнительный");
        registration.start();
        clientServise.registrationClientAccount();
*/

        //Импорт-Экспорт базы данных по категориям и поиск продуктов в коллекции по категории продуктов
        ProductDataBase productDataBase = CreateToObject.createProductDataBase();
        productDataBase.dataBaseRead();
        productDataBase.exportFromDataBase();
        productDataBase.importToDataBase();
        BuyServise buyServise = CreateToObject.createBuyServise();
        // buyServise.productCategorySearch(scanner, productDataBase);

        //Получаем корзину продуктов
        Basket basket = CreateToObject.createBasket();
        buyServise.getBasketProducts(basket,scanner,buyServise.productCategorySearch(scanner,productDataBase),productDataBase);
        System.out.println(basket.getProductsInBasket());
    }
}
