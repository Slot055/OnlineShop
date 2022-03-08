package ru.MyOnlineShop.model.exeption;

public class InvalidCategoryProduct extends Exception{
    private String typeProduct;
    public InvalidCategoryProduct(String message, String typeProduct){
        super(message);
        this.typeProduct = typeProduct;
    }

    public String getTypeProduct() {
        return typeProduct;
    }
}
