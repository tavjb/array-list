package com.tav;

import com.tav.model.Book;

import java.util.List;

public class BooksArrayList {
    public static List<Book> booksArrayList(Book[] books, int[] stock) {
        throw new RuntimeException("Please implement the booksArrayList method");
    }

    public static void main(String[] args) {
        Book[] books = {
                new Book("Harry potter", 20),
                new Book("The alchemist", 30),
                new Book("Effective Java", 70)
        };

        int[] stock = {3, 2, 10};

        booksArrayList(books, stock);
    }
}
