package org.example.HomeWork;

public class Product {
    private String sku;
    private double price;
    private int rating;

    public Product(String sku, double price, int rating) {
        this.sku = sku;
        this.price = price;
        this.rating = rating;
    }

    public Product() {
    }


    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
