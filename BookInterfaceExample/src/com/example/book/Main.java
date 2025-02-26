package com.example.book;

import com.example.book.Book;
import com.example.book.BookImpl;

public class Main {
    public static void main(String[] args) {
        Book book = new BookImpl("The Great Book", "MJ",  10.99);
        
        System.out.println("Title: " + book.getTitle());
        System.out.println("Author: " + book.getAuthor());
        System.out.println("Price: Rs" + book.getPrice());
    }
}
