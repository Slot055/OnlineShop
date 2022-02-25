package ru.MyOnlineShop.model.client;

import ru.MyOnlineShop.model.CreateToObject;


public class ClientAccount {
    private int idClient;
    private Client client;

    public ClientAccount(int idClient, Client client) {
        this.idClient = idClient;
        this.client = client;
    }

    @Override
    public String toString() {
        return "Номер аккаунта:" + idClient + " , " + client;
    }

    public ClientAccount() {

    }

    public void registrationAccount(ClientAccount clientAccount) {
        CreateToObject.createClientDataBase();
    }


    public int getIdClient() {
        return idClient;
    }

    public void setIdClient(int idClient) {
        this.idClient = idClient;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }


}
