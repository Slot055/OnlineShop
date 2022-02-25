package ru.MyOnlineShop.model.dataBase;

import ru.MyOnlineShop.model.service.buy.Buy;

import java.util.Scanner;

public abstract class DataBase implements Buy {

    private static final String DATA_BASE = "dataBaseCatalog/";

    abstract void dataBaseWrite(Scanner scanner);

    abstract void dataBaseRead();

    abstract Object convertStringToBase(String currentLine);

}