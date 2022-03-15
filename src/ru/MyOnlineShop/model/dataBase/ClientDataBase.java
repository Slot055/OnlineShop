package ru.MyOnlineShop.model.dataBase;
import ru.MyOnlineShop.model.CreateToObject;
import ru.MyOnlineShop.model.product.Product;
import ru.MyOnlineShop.model.client.Client;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;


public class ClientDataBase extends DataBase {
    private Client client;
    private List<Client> clientBase = new ArrayList<>();

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<Client> getClientBase() {
        return clientBase;
    }

    public void setClientBase(List<Client> clientBase) {
        this.clientBase = clientBase;
    }

    @Override
    public Product findProduct(String name) {
        return null;
    }

    @Override
    public void putInBasket() {

    }

    @Override
    public void dataBaseWrite(Scanner scanner) {
        try (FileWriter fw = new FileWriter("dataBase/dataBaseCatalog/ClientBaseInput.txt", true)) {
            Client client = CreateToObject.createClient(scanner);

            fw.write(String.valueOf(client));
            fw.write("\n");
            fw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    @Override
    public void dataBaseRead() {
        try (BufferedReader br = new BufferedReader(new FileReader("dataBase/dataBaseCatalog/ClientBaseInput.txt"))) {

            String currentLine = "";
            while ((currentLine = br.readLine()) != null) {
               // System.out.println(currentLine);
                if (currentLine != null && !currentLine.isBlank())
                    clientBase.add(convertStringToBase(currentLine));
            }

           //  System.out.println(clientBase);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public Client convertStringToBase(String currentLine) {
        String[] splitted = currentLine.split(" , ");
        Client client = new Client();

        for (String s : splitted) {
            getIdClientAndSet(s, client);
            getNameAndSet(s, client);
            getLastNameAndSet(s, client);
            getGenderAndSet(s, client);
            getAgeAndSet(s, client);
            getPhonenumberAndSet(s, client);
            getEmailAndSet(s, client);

        }

        return client;
    }

    @Override
    public void exportFromDataBase() {

        try (FileWriter fw = new FileWriter("dataBase/dataBaseCatalog/ClientBaseExport.txt")) {
            for (Client client : clientBase)
                fw.write(client + "\n");
            fw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void importToDataBase() {

    }

    private static void getIdClientAndSet(String s, Client client) {
        if (s != null && s.contains("Номер клиента:")) {
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


