package ru.MyOnlineShop.model.client;

import java.util.Objects;


public class Client {
    private int idClient;
    private String name;
    private String lastName;
    private String gender;
    private int age;
    private String phoneNumber;
    private String email;

    public Client(int idClient, String name, String lastName, String gender, int age, String phoneNumber, String email) {
        this.idClient = idClient;
        this.name = name;
        this.lastName = lastName;
        this.gender = gender;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.email = email;

    }

    public Client() {

    }

    public int generateIdClient(Client client) {
        int id = client.hashCode() / 10000;
        if (id < 0) {
            int idFinal = Math.abs(-id);
            setIdClient(idFinal);
            return getIdClient();
        } else setIdClient(id);

        return getIdClient();

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Client)) return false;
        Client client = (Client) o;
        return getIdClient() == client.getIdClient() && getAge() == client.getAge() && getName().equals(client.getName()) &&
                getLastName().equals(client.getLastName()) && getGender().equals(client.getGender()) &&
                getPhoneNumber().equals(client.getPhoneNumber()) && getEmail().equals(client.getEmail());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getIdClient(), getName(), getLastName(), getGender(), getAge(), getPhoneNumber(), getEmail());
    }

    @Override
    public String toString() {
        return "Номер клиента:" + idClient + " , " + "Имя:" + name + " , " + "Фамилия:" + lastName + " , " + "Пол:" + gender + " , " + "Возраст:" + age +
                " , " + "Номер_телефона:" + phoneNumber + " , " + "Email:" + email;

    }

    public int getIdClient() {
        return idClient;
    }

    public void setIdClient(int idClient) {
        this.idClient = idClient;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


}
