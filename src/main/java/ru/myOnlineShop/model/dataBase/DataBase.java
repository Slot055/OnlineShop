package ru.myOnlineShop.model.dataBase;

import ru.myOnlineShop.model.service.buyService.Buy;

import java.util.Scanner;

public abstract class DataBase implements Buy{

    abstract void dataBaseWrite(Scanner scanner);

    abstract void dataBaseRead();

    abstract Object convertStringToBase(String currentLine);

    abstract void exportFromDataBase();

    abstract void importToDataBase();

}