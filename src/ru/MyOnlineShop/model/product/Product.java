package ru.MyOnlineShop.model.product;
import ru.MyOnlineShop.model.service.buy.Buy;
import java.util.Objects;

public class Product implements Buy, Comparable<Product> {
    private String categoryProduct;
    private String typeProduct;
    private String nameProduct;
    private double price;
    private int item;

    public Product(String categoryProduct, String typeProduct, String nameProduct, double price, int item) {
        this.categoryProduct = categoryProduct;
        this.typeProduct = typeProduct;
        this.nameProduct = nameProduct;
        this.price = price;
        this.item = item;
    }

    public Product() {
    }

    @Override
    public String toString() {
        return "Категория товара:" + categoryProduct + " , " + "Тип товара:" + typeProduct + " , " + "Наименование товара:" + nameProduct +
                " , " + "Цена:" + price + " , " + "Артикул:" + item;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product)) return false;
        Product product = (Product) o;
        return Double.compare(product.getPrice(), getPrice()) == 0 && Objects.equals(getCategoryProduct(), product.getCategoryProduct()) &&
                Objects.equals(getTypeProduct(), product.getTypeProduct()) && Objects.equals(getNameProduct(), product.getNameProduct());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCategoryProduct(), getTypeProduct(), getNameProduct(), getPrice());
    }

    public void productInfo() {

    }

    public String getTypeProduct() {
        return typeProduct;
    }

    public void setTypeProduct(String typeProduct) {
        this.typeProduct = typeProduct;
    }

    public String getCategoryProduct() {
        return categoryProduct;
    }

    public void setCategoryProduct(String categoryProduct) {
        this.categoryProduct = categoryProduct;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getItem() {
        return item;
    }

    public void setItem(int item) {
        this.item = item;
    }


    @Override
    public Product findProduct(String name) {
        return null;
    }

    @Override
    public void putInBasket() {

    }

    @Override
    public int compareTo(Product product) {
        return (int) (this.getPrice() - product.getPrice());
    }
}
