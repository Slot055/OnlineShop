package ru.MyOnlineShop.model;

import ru.MyOnlineShop.model.client.Client;
import ru.MyOnlineShop.model.client.ClientAccount;
import ru.MyOnlineShop.model.dataBase.ClientAccountDataBase;
import ru.MyOnlineShop.model.dataBase.ProductDataBase;
import ru.MyOnlineShop.model.service.Basket;

import java.util.Date;
import java.util.Scanner;

public class CreateToObject {
    public static OnlineShop createOnlineShop() {
        OnlineShop myShop = new OnlineShop("MyShop", "08:00-23:00", "www.MyShop.ru", "8(800)123-45-67");
        myShop.infoStore();
        Date date = new Date();
        System.out.println("Текущее время: " + date.getHours() + " час(ов) : " + date.getMinutes() + " минут(ы)" + "\n" +
                "***********************************");
        myShop.getTimeStore(date);
        return myShop;
    }

    public static Client createClient(Scanner scanner) {
        Client client = new Client();
        System.out.println("******************************" + "\n" + "Регистрация аккаунта" + "\n" + "******************************");
        System.out.println("Анкетные данные:" + "\n" + "******************************");
        System.out.println("Имя:");
        client.setName(scanner.next());
        System.out.println("Фамилия:");
        client.setLastName(scanner.next());
        System.out.println("Пол (М/Ж):");
        client.setGender(scanner.next());
        System.out.println("Возраст (лет):");
        client.setAge(scanner.nextInt());
        System.out.println("Номер телефона (10 знаков без пробелов):");
        client.setPhoneNumber(scanner.next());
        System.out.println("Email:");
        client.setEmail(scanner.next());

        return client;
    }

    public static ClientAccount createClientAccount(Client client) {
        ClientAccount clientAccount = new ClientAccount(client.hashCode(), client);

        return clientAccount;
    }

    public static ClientAccountDataBase createClientDataBase(ClientAccount clientAccount) {
        ClientAccountDataBase clientAccountDataBase = new ClientAccountDataBase();
        clientAccountDataBase.addInBase(clientAccount);
        return clientAccountDataBase;
    }

    public static ProductDataBase createProductDataBase() {
        ProductDataBase productDataBase = new ProductDataBase();
        return productDataBase;
    }

    public static Scanner createScanner() {
        return new Scanner(System.in);
    }

    public static Basket createBasket() {
        return new Basket("Корзина продуктов");
    }

}
