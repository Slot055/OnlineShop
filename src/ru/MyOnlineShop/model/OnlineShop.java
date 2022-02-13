package ru.MyOnlineShop.model;

import java.util.Date;

public class OnlineShop {
    private String name;
    private String workHours;
    private String adress;
    private String phone;

    public OnlineShop(String name, String workHours, String adress, String phone) {
        this.name = name;
        this.workHours = workHours;
        this.adress = adress;
        this.phone = phone;
    }

    public void infoStore() {
        System.out.println("Магазин: " + getName() + "\n" + "Время работы магазина: " + getWorkHours() + "\n" + "Сайт: " +
                getAdress() + "\n" + "Телефон: " + getPhone() + "\n" + "***********************************");
    }


    public void getTimeStore(Date date) {
        if (date.getHours() < 8) {
            System.out.println("Магазин закрыт" + "\n" + "\n" + "Магазин откроется через " + (7 - date.getHours()) +
                    " час(ов) : " + (60 - date.getMinutes()) + " минут(ы)");
            System.exit(0);
        } else if (date.getHours() < 23) {
            storeOpen();
        } else {
            System.out.println("Магазин закрыт" + "\n" + "Магазин откроется через " + (31 - date.getHours()) +
                    " час(ов) : " + (60 - date.getMinutes()) + " минут(ы)");
            System.exit(0);
        }
    }

    public void storeOpen() {
        System.out.println("Добро пожаловать в интернет-магазин: " + getName());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWorkHours() {
        return workHours;
    }

    public void setWorkHours(String workHours) {
        this.workHours = workHours;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
