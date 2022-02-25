package ru.MyOnlineShop.model.dataBase;

import ru.MyOnlineShop.model.CreateToObject;
import ru.MyOnlineShop.model.product.Product;
import ru.MyOnlineShop.model.client.Client;
import ru.MyOnlineShop.model.client.ClientAccount;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;


public class ClientAccountDataBase extends DataBase {
    private Client client;
    private ClientAccount clientAccount;
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

    public ClientAccount getClientAccount() {
        return clientAccount;
    }

    public void setClientAccount(ClientAccount clientAccount) {
        this.clientAccount = clientAccount;
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

    @Override
    public void dataBaseWrite(Scanner scanner) {
        try (FileWriter fw = new FileWriter("dataBase/dataBaseCatalog/ClientAccountDataBase.txt", true)) {
            Client client = CreateToObject.createClient(scanner);
            ClientAccount clientAccount = CreateToObject.createClientAccount(client);

            fw.write(String.valueOf(clientAccount));
            fw.write("\n");
            fw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    @Override
    public void dataBaseRead() {
        try (BufferedReader br = new BufferedReader(new FileReader("dataBase/dataBaseCatalog/ClientAccountDataBase.txt"))) {

            String currentLine = "";
            while ((currentLine = br.readLine()) != null) {
                System.out.println(currentLine);
                if (currentLine != null && !currentLine.isBlank())
                    clientBase.add(convertStringToBase(currentLine));
            }

            System.out.println(clientBase);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public ClientAccount convertStringToBase(String currentLine) {


        String[] splitted = currentLine.split(" , ");
        Client client = new Client();
        ClientAccount clientAccount = new ClientAccount();

        for (String s : splitted) {
            getIdClientAndSet(s,client);
            getNameAndSet(s, client);
            getLastNameAndSet(s, client);
            getGenderAndSet(s, client);
            getAgeAndSet(s, client);
            getPhonenumberAndSet(s, client);
            getEmailAndSet(s, client);

        }

        return clientAccount;
    }
    private static void getIdClientAndSet(String s, Client client) {
        if (s != null && s.contains("Номер аккаунта:")) {
            client.setIdClient(Integer.parseInt(s.split(":")[1]));
        }
    }

    private static void getNameAndSet(String s, Client client) {
        if (s != null && s.contains("Имя:")) {
            client.setName(s.split(":")[1]);
        }
    }

    private static void getLastNameAndSet(String s, Client client) {
        if (s != null && s.contains("Фамилия:")) {
            client.setLastName(s.split(":")[1]);
        }
    }

    private static void getGenderAndSet(String s, Client client) {
        if (s != null && s.contains("Пол:")) {
            client.setGender(s.split(":")[1]);
        }
    }

    private static void getAgeAndSet(String s, Client client) {
        if (s != null && s.contains("Возраст:")) {
            client.setAge(Integer.parseInt(s.split(":")[1]));
        }
    }

    private static void getPhonenumberAndSet(String s, Client client) {
        if (s != null && s.contains("Номер_телефона:")) {
            client.setPhoneNumber(s.split(":")[1]);
        }
    }

    private static void getEmailAndSet(String s, Client client) {
        if (s != null && s.contains("Email:")) {
            client.setEmail(s.split(":")[1]);
        }
    }
}


