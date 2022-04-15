package ru.myOnlineShop;
import org.joda.time.DateTime;
import ru.myOnlineShop.model.CreateToObject;
import ru.myOnlineShop.model.constanta.Day;
import ru.myOnlineShop.model.dataBase.ProductDataBase;
import ru.myOnlineShop.model.service.Basket;
import ru.myOnlineShop.model.service.clientBuyService.BuyServise;
import ru.myOnlineShop.model.service.clientBuyService.Delivery;
import ru.myOnlineShop.model.service.clientBuyService.Order;
import ru.myOnlineShop.model.service.clientAccountServise.ClientServise;
import ru.myOnlineShop.model.service.logisticServise.WarehouseServise;
import java.util.Scanner;


public class MyOnlineShop {
    public static void main(String[] args) {

        CreateToObject.createOnlineShop();
        Scanner scanner = CreateToObject.createScanner();

        //Регистрация клиентов(в два параллельных потока)
        ClientServise clientServise = CreateToObject.createClientServise();
        /*clientServise.pool.execute(clientServise);
        clientServise.pool.shutdown();
        Thread registration = new Thread(clientServise, "Дополнительный");
        registration.start();
        clientServise.registrationClientAccount();*/


        //Импорт-Экспорт базы данных по категориям и поиск продуктов в коллекции по категории продуктов
        ProductDataBase productDataBase = CreateToObject.createProductDataBase();
        productDataBase.dataBaseRead();
        productDataBase.exportFromDataBase();
        productDataBase.importToDataBase();
        BuyServise buyServise = CreateToObject.createBuyServise();
        //buyServise.productCategorySearch(scanner, productDataBase);

        //Получаем корзину продуктов
        Basket basket = CreateToObject.createBasket();
        buyServise.getBasketProducts(basket, scanner, buyServise.productCategorySearch(scanner, productDataBase), productDataBase);
        System.out.println(basket.getProductsInBasket());

        //Получение заказа и оплата заказа(получение чека)
        Order order = CreateToObject.createOrder(basket);
        order.infoOrder(order);
        buyServise.pay(order, scanner);

        //Отправляем заказ на доставку
        Delivery delivery = new Delivery();
        buyServise.getDelivery(delivery,order,scanner);

        WarehouseServise warehouseServise = new WarehouseServise();
        warehouseServise.deliveryLogistics(delivery,order);


        System.out.println("Количество заказов на доставку на " + delivery.getDay().getName() + " - " + warehouseServise.getDeliveryList().size() + " шт.");
        System.out.println("Количество заказов на самовывоз на " + warehouseServise.getPickupList().size());

    }

}
