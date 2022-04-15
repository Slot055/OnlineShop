package ru.myOnlineShop.model.exeption;

public class InvalidPay extends NullPointerException{

    public InvalidPay(String message){
        super(message);
    }
}
