package ru.MyOnlineShop.model.dataBase;

import ru.MyOnlineShop.model.product.Product;
import ru.MyOnlineShop.model.product.food.bakery.Bread;
import ru.MyOnlineShop.model.product.food.bakery.Cracker;
import ru.MyOnlineShop.model.product.food.dairyProduct.Cheese;
import ru.MyOnlineShop.model.product.food.dairyProduct.Milk;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ProductDataBase extends DataBase {
private Product product;
    public Map<String, Product> productBase = new HashMap<>();

    public Map<String, Product> addInBase(String name,Product product) {
        product.setItem(hashCode());
        productBase.put(name, product);
        return productBase;
    }

    public void foodBase(ProductDataBase productDataBase) {
        productDataBase.addInBase("Сыр-1", new Cheese("Сыр Российский", 490.00, 0, 1));
        productDataBase.addInBase("Хлеб", new Bread("Хлеб ржаной", 38.00, 0));
        productDataBase.addInBase("Печенье", new Cracker("Печенье Овсяное", 65, 0));
        productDataBase.addInBase("Молоко-1", new Milk("Молоко Простоквашино", 64.00, 0, 1.0, 0.6));
        productDataBase.addInBase("Сыр-2", new Cheese("Сыр Пошехонский", 520.00, 0, 1));
        productDataBase.addInBase("Молоко-2", new Milk("Молоко Домик в деревне", 78.00, 0, 1.0, 0.6));
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
        if (productBase.containsKey(name)){

        return productBase.get(name);
    }
       else {
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
}
