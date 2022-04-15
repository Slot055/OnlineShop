package ru.myOnlineShop.model.service.logisticServise;

import ru.myOnlineShop.model.constanta.Day;
import ru.myOnlineShop.model.service.clientBuyService.Delivery;
import ru.myOnlineShop.model.service.clientBuyService.Order;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class WarehouseServise {

    private final Map<Day, ArrayList<Order>> deliveryList = new HashMap<>();
    private final Map<Day, ArrayList<Order>> pickupList = new HashMap<>();

    public WarehouseServise() {

    }
    public Map<Day,ArrayList<Order>> pickupLogictics(Delivery delivery,Order order){
        switch (order.getDateTime().getDayOfWeek()) {
            case 5,6,7:
                pickupList.put(Day.MONDAY, delivery.getListOrdersPickup());
                System.out.println("День самовывоза: " + Day.MONDAY.getName());
                break;
            case 1:
                pickupList.put(Day.TUESDAY, delivery.getListOrdersPickup());
                System.out.println("День самовывоза: " + Day.TUESDAY.getName());
                break;
            case 2:
                pickupList.put(Day.WEDNESDAY, delivery.getListOrdersPickup());
                System.out.println("День самовывоза: " + Day.WEDNESDAY.getName());
                break;
            case 3:
                pickupList.put(Day.THURSDAY, delivery.getListOrdersPickup());
                System.out.println("День самовывоза: " + Day.THURSDAY.getName());
                break;
            case 4:
                pickupList.put(Day.FRIDAY, delivery.getListOrdersPickup());
                System.out.println("День самовывоза: " + Day.FRIDAY.getName());
                break;
        }

        return pickupList;
    }

    public Map<Day, ArrayList<Order>> deliveryLogistics(Delivery delivery,Order order) {
        if (delivery.getDay() == null) {
            System.out.println("Заказ отправлен на самовывоз");
            pickupLogictics(delivery,order);
            return pickupList;
        } else
            switch (delivery.getDay().getNumber()) {
                case 1:
                    deliveryList.put(Day.MONDAY, delivery.getListOrdersDelivery());
                    System.out.println("День доставки: " + Day.MONDAY.getName());
                    break;
                case 2:
                    deliveryList.put(Day.TUESDAY, delivery.getListOrdersDelivery());
                    System.out.println("День доставки: " + Day.TUESDAY.getName());
                    break;
                case 3:
                    deliveryList.put(Day.WEDNESDAY, delivery.getListOrdersDelivery());
                    System.out.println("День доставки: " + Day.WEDNESDAY.getName());
                    break;
                case 4:
                    deliveryList.put(Day.THURSDAY, delivery.getListOrdersDelivery());
                    System.out.println("День доставки: " + Day.THURSDAY.getName());
                    break;
                case 5:
                    deliveryList.put(Day.FRIDAY, delivery.getListOrdersDelivery());
                    System.out.println("День доставки: " + Day.FRIDAY.getName());
                    break;
            }


        return deliveryList;
    }

    public Map<Day, ArrayList<Order>> getDeliveryList() {
        return deliveryList;
    }

    public Map<Day, ArrayList<Order>> getPickupList() {
        return pickupList;
    }
}
