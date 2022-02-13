package ru.MyOnlineShop.model.dataBase;

import ru.MyOnlineShop.model.client.Client;
import ru.MyOnlineShop.model.client.ClientAccount;
import ru.MyOnlineShop.model.product.Product;

import java.util.*;


public class ClientAccountDataBase extends DataBase {
    private Client client;
    private static List<ClientAccount> clientBase = new ArrayList<>();


    public void addInBase(ClientAccount clientAccount) {
        clientBase.add(clientAccount);

    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public static List<ClientAccount> getClientBase() {
        return clientBase;
    }

    public static void setClientBase(List<ClientAccount> clientBase) {
        ClientAccountDataBase.clientBase = clientBase;
    }

    @Override
    public Collection<Product> findAllProducts() {
        return null;
    }

    @Override
    public Product findProduct(String name) {
        return null;
    }

    @Override
    public Set<Product> findProducts(int price) {
        return null;
    }

    @Override
    public void putInBasket() {

    }
}


