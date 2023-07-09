package org.example.HomeWork;

import java.util.ArrayList;

public class Category {
    private String nameCategory;
    private ArrayList<Product> products;

    public Category() {
    }

    public Category(String nameCategory) {
        this.nameCategory = nameCategory;
        products = new ArrayList<>();
    }

    public String getNameCategory() {
        return nameCategory;
    }

    public void setNameCategory(String nameCategory) {
        this.nameCategory = nameCategory;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void addProduct(Product product) {
        this.products.add(product);
    }
}
