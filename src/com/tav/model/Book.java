package com.tav.model;

public class Book {
    public Book(String title, float price) {
        this.title = title;
        this.price = price;
    }

    private final String title;
    private float price;

    public String getTitle() {
        return title;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
