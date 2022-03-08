package ru.MyOnlineShop;
import ru.MyOnlineShop.model.CreateToObject;
import ru.MyOnlineShop.model.dataBase.ClientDataBase;
import ru.MyOnlineShop.model.dataBase.ProductDataBase;
import ru.MyOnlineShop.model.service.buy.BuyServise;
import java.util.Scanner;


public class MyOnlineShop {
    public static void main(String[] args) {

        //Регистрация клиента
        CreateToObject.createOnlineShop();
        Scanner scanner = CreateToObject.createScanner();
        ClientDataBase clientDataBase = CreateToObject.createClientDataBase();
        clientDataBase.dataBaseRead();
        clientDataBase.exportFromDataBase();


        //Импорт-Экспорт базы данных по категориям и поиск продуктов в коллекции по категории продуктов
        ProductDataBase productDataBase = CreateToObject.createProductDataBase();
        productDataBase.dataBaseRead();
        productDataBase.exportFromDataBase();
        productDataBase.importToDataBase();
        BuyServise.productCategorySearch(scanner, productDataBase);
    }


    }
