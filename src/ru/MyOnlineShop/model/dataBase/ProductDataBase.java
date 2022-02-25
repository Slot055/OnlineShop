package ru.MyOnlineShop.model.dataBase;

import ru.MyOnlineShop.model.product.Product;
import ru.MyOnlineShop.model.product.food.bakery.Bread;
import ru.MyOnlineShop.model.product.food.bakery.Cracker;
import ru.MyOnlineShop.model.product.food.dairyProduct.Cheese;
import ru.MyOnlineShop.model.product.food.dairyProduct.Milk;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class ProductDataBase extends DataBase {
    private Product product;
    public Map<String, Product> productBase = new HashMap<>();

    public Map<String, Product> addInBase(String name, Product product) {
        product.setItem(hashCode());
        productBase.put(name, product);
        return productBase;
    }

    public void setFoodBase(ProductDataBase productDataBase) {
        productDataBase.addInBase("Сыр-1", new Cheese("Продукты питания","Молочные продукты","Сыр Российский", 490.00, 0, 1));
        productDataBase.addInBase("Хлеб", new Bread("Продукты питания","Выпечка","Хлеб", 38.00, 0,0.1));
        productDataBase.addInBase("Печенье", new Cracker("Продукты питания","Выпечка","Печенье Овсяное", 65, 0,0.2));
        productDataBase.addInBase("Молоко-1", new Milk("Продукты питания","Молочные продукты","Молоко Простоквашино", 64.00, 0, 1.0, 0.6));
        productDataBase.addInBase("Сыр-2", new Cheese("Продукты питания","Молочные продукты","Сыр Пошехонский", 520.00, 0, 1));
        productDataBase.addInBase("Молоко-2", new Milk("Продукты питания","Молоко","Молоко Домик в деревне", 78.00, 0, 1.0, 0.6));
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @Override
    public Collection<Product> findAllProducts() {
        return null;
    }

    @Override
    public Product findProduct(String name) {
        if (productBase.containsKey(name)) {

            return productBase.get(name);
        } else {
            System.out.println("Такого продукта пока нет в прайс-листе");
            return null;
        }

    }

    @Override
    public Set<Product> findProducts(int price) {
        return null;
    }

    @Override
    public void putInBasket() {

    }

    @Override
    public void dataBaseWrite(Scanner scanner) {
        try (FileWriter fw = new FileWriter("dataBase/dataBaseCatalog/ProductDataBase.txt", true)) {
            fw.write(String.valueOf(product));
            fw.write("\n");
            fw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    @Override
    public void dataBaseRead() {
        try (BufferedReader br = new BufferedReader(new FileReader("dataBase/dataBaseCatalog/ProductDataBase.txt"))) {

            List<Product> productBase = new ArrayList<>();

            String currentLine = "";
            while ((currentLine = br.readLine()) != null) {
                System.out.println(currentLine);
                if (currentLine != null && !currentLine.isBlank())
                    productBase.add(convertStringToBase(currentLine));
            }

            System.out.println(productBase);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public Product convertStringToBase(String currentLine) {


        String[] splitted = currentLine.split(" , ");
        Product product = new Product();

        for (String s : splitted) {
            getNameAndSet(s, product);
            getPriceAndSet(s, product);
            getItemAndSet(s, product);
        }

        return product;
    }

    private static void getNameAndSet(String s, Product product) {
        if (s != null && s.contains("Товар:")) {
            product.setNameProduct(s.split(":")[1]);
        }
    }

    private static void getPriceAndSet(String s, Product product) {
        if (s != null && s.contains("Цена:")) {
            product.setPrice(Double.parseDouble(s.split(":")[1]));
        }
    }

    private static void getItemAndSet(String s, Product product) {
        if (s != null && s.contains("Артикул:")) {
            product.setItem(Integer.parseInt(s.split(":")[1]));
        }
    }
}


