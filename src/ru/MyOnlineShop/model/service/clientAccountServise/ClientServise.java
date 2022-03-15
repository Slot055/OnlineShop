package ru.MyOnlineShop.model.service.clientAccountServise;
import ru.MyOnlineShop.model.CreateToObject;
import ru.MyOnlineShop.model.dataBase.ClientDataBase;

public class ClientServise extends ClientDataBase implements Runnable {

    //private static final int MAX_POOL = 10;
    //ExecutorService pool = Executors.newFixedThreadPool(MAX_POOL);

    @Override
    public void run() {
        //System.out.println("Начался " + Thread.currentThread().getName() + " поток");
        registrationClientAccount();
        //System.out.println("Закончился " + Thread.currentThread().getName() + " поток");

    }

    public void registrationClientAccount() {

        ClientDataBase clientDataBase = CreateToObject.createClientDataBase();
        clientDataBase.dataBaseRead();
        clientDataBase.exportFromDataBase();
    }
}
