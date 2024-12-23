package com.xworkz.libbookapp.book;

public class Book {

    private int bookId;
    private String bookAuthor;
    private String bookName;
    private double price;

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Book() {
    }

    public Book(int bookId, String bookAuthor, String bookName, double price) {
        this.bookId = bookId;
        this.bookAuthor = bookAuthor;
        this.bookName = bookName;
        this.price = price;
    }
}
