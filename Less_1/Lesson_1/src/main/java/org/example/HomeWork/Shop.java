package org.example.HomeWork;

import java.util.ArrayList;

public class Shop {
    private ArrayList<Category> categories;

    public Shop() {
        this.categories = new ArrayList<>();
    }

    public void addCategory(Category category) {
        categories.add(category);
    }

    public void printCatalog() {
        for (Category category : categories) {
            System.out.println(category.getNameCategory());
            ArrayList<Product> products = category.getProducts();
            for (Product product : products) {
                System.out.println(" - " + product.getSku() + " - " + product.getPrice() +
                        " - " + product.getRating());
            }
        }
    }
}
