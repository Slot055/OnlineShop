package ru.MyOnlineShop.model.dataBase;

import ru.MyOnlineShop.model.service.buyService.Buy;

import java.util.Scanner;

public abstract class DataBase implements Buy{

    abstract void dataBaseWrite(Scanner scanner);

    abstract void dataBaseRead();

    abstract Object convertStringToBase(String currentLine);

    abstract void exportFromDataBase();

    abstract void importToDataBase();

}