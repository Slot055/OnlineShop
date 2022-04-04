package ru.myOnlineShop.model.service.clientAccountServise;
import ru.myOnlineShop.model.CreateToObject;
import ru.myOnlineShop.model.dataBase.ClientDataBase;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ClientServise extends ClientDataBase implements Runnable {

    private static final int MAX_POOL = 10;
    public ExecutorService pool = Executors.newFixedThreadPool(MAX_POOL);

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
