package com.example.book;

public class BookImpl implements Book {
    private String title;
    private String author;
    private double price;

    public BookImpl(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getAuthor() {
        return author;
    }

   
    @Override
    public double getPrice() {
        return price;
    }
}
