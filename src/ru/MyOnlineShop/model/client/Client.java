package ru.MyOnlineShop.model.client;

public class Client {
    private int idClient;
    private String name;
    private String lastName;
    private String gender;
    private int age;
    private String phoneNumber;
    private String email;
    private ClientAccount clientAccount;


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

    @Override
    public String toString() {
        return "Номер аккаунта:" + idClient + " , " + "Имя:" + name + " , " + "Фамилия:" + lastName + " , " + "Пол:" + gender + " , " + "Возраст:" + age +
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

    public ClientAccount getClientAccount() {
        return clientAccount;
    }

    public void setClientAccount(ClientAccount clientAccount) {
        this.clientAccount = clientAccount;
    }


}
