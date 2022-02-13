package ru.MyOnlineShop;

import ru.MyOnlineShop.model.CreateToObject;
import ru.MyOnlineShop.model.client.Client;
import ru.MyOnlineShop.model.client.ClientAccount;
import ru.MyOnlineShop.model.dataBase.ClientAccountDataBase;
import ru.MyOnlineShop.model.dataBase.ProductDataBase;
import ru.MyOnlineShop.model.product.Product;


import java.util.Scanner;


public class MyOnlineShop {
    public static void main(String[] args) {

        //Регистрация клиента
        CreateToObject.createOnlineShop();
        Scanner scanner = CreateToObject.createScanner();
        Client client = CreateToObject.createClient(scanner);
        ClientAccount clientAccount = CreateToObject.createClientAccount(client);
        clientAccount.registrationAccount(clientAccount);
        System.out.println(ClientAccountDataBase.getClientBase().toString());

        //Поиск продуктов в коллекции
        ProductDataBase productDataBase = CreateToObject.createProductDataBase();
        productDataBase.foodBase(productDataBase);
        System.out.println("***********************************" + "\n" + "Список продуктов: " + "\n" + productDataBase.productBase.keySet());
        System.out.println("***********************************" + "\n" + "Для информации о продукте введите его наименование: ");
        String name = scanner.next();
        Product product = productDataBase.findProduct(name);
        System.out.println(product);


    }

}